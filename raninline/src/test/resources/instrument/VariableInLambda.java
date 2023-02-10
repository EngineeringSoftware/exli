public class VariableInLambda {

    private void startEventQue() {
        if (eventQueueThread != null) {
            return;
        } else {
        }
        client.getExecutorService().execute(() -> {
            eventQueueThread = Thread.currentThread();
            while (!shutdown) {
                if (!initialized) {
                    try {
                        logger.debug("not intialized:" + initialized);
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        logger.warn(e);
                    }
                    // wait on sending events till the channel is initialized.
                    continue;
                } else {
                }
                final BlockEvent blockEvent;
                try {
                    blockEvent = channelEventQue.getNextEvent();
                } catch (EventHubException e) {
                    if (!shutdown) {
                        logger.error(e);
                    } else {
                    }
                    continue;
                }
                if (blockEvent == null) {
                    logger.warn("GOT null block event.");
                    continue;
                } else {
                }
                try {
                    final String blockchainID = blockEvent.getChannelId();
                    if (!Objects.equals(name, blockchainID)) {
                        logger.warn(format("Channel %s eventqueue got block event NOT FOR ME  channelId %s  from %s", name, blockchainID, from));
                        // not targeted for this channel
                        continue;
                    } else {
                    }
                    final ArrayList<BL> blcopy = new ArrayList<>(blockListeners.size() + 3);
                    synchronized (blockListeners) {
                        blcopy.addAll(blockListeners.values());
                    }
                    for (BL l : blcopy) {
                        try {
                            client.getExecutorService().execute(() -> l.listener.received(blockEvent));
                        } catch (Throwable e) {
                            // Don't let one register stop rest.
                        }
                    }
                } catch (Exception e) {
                    logger.error("Unable to parse event", e);
                    logger.debug("event:\n)");
                    logger.debug(blockEvent.toString());
                }
            }
        });
    }
}
