public class ClassDeclarator {

    private String registerChaincodeListenerProcessor() throws InvalidArgumentException {
        logger.debug(format("Channel %s registerChaincodeListenerProcessor starting", name));
        // Chaincode event listener is internal Block listener for chaincode events.
        return registerBlockListener(blockEvent -> {
            if (chainCodeListeners.isEmpty()) {
                return;
            } else {
            }
            LinkedList<ChaincodeEvent> chaincodeEvents = new LinkedList<>();
            // Find the chaincode events in the transactions.
            for (TransactionEvent transactionEvent : blockEvent.getTransactionEvents()) {
                logger.debug(format("Channel %s got event for transaction %s ", name, transactionEvent.getTransactionID()));
                for (BlockInfo.TransactionEnvelopeInfo.TransactionActionInfo info : transactionEvent.getTransactionActionInfos()) {
                    ChaincodeEvent event = info.getEvent();
                    if (null != event) {
                        chaincodeEvents.add(event);
                    } else {
                    }
                }
            }
            if (!chaincodeEvents.isEmpty()) {
                class MatchPair {

                    final ChaincodeEventListenerEntry eventListener;

                    final ChaincodeEvent event;

                    MatchPair(ChaincodeEventListenerEntry eventListener, ChaincodeEvent event) {
                        this.eventListener = eventListener;
                        this.event = event;
                    }
                }
                // Find matches.
                List<MatchPair> matches = new LinkedList<>();
                synchronized (chainCodeListeners) {
                    for (ChaincodeEventListenerEntry chaincodeEventListenerEntry : chainCodeListeners.values()) {
                        for (ChaincodeEvent chaincodeEvent : chaincodeEvents) {
                            if (chaincodeEventListenerEntry.isMatch(chaincodeEvent)) {
                                matches.add(new MatchPair(chaincodeEventListenerEntry, chaincodeEvent));
                            } else {
                            }
                        }
                    }
                }
                // fire events
                for (MatchPair match : matches) {
                    ChaincodeEventListenerEntry chaincodeEventListenerEntry = match.eventListener;
                    ChaincodeEvent ce = match.event;
                    chaincodeEventListenerEntry.fire(blockEvent, ce);
                }
            } else {
            }
        });
    }

    /**
     * Shutdown the channel with all resources released.
     *
     * @param force force immediate shutdown.
     */
    public synchronized void shutdown(boolean force) {
        if (shutdown) {
            return;
        } else {
        }
        String ltransactionListenerProcessorHandle = transactionListenerProcessorHandle;
        transactionListenerProcessorHandle = null;
        if (null != ltransactionListenerProcessorHandle) {
            try {
                unregisterBlockListener(ltransactionListenerProcessorHandle);
            } catch (Exception e) {
                logger.error(format("Shutting down channel %s transactionListenerProcessorHandle", name), e);
            }
        } else {
        }
        String lchaincodeEventUpgradeListenerHandle = chaincodeEventUpgradeListenerHandle;
        chaincodeEventUpgradeListenerHandle = null;
        if (null != lchaincodeEventUpgradeListenerHandle) {
            try {
                unregisterChaincodeEventListener(lchaincodeEventUpgradeListenerHandle);
            } catch (Exception e) {
                logger.error(format("Shutting down channel %s chaincodeEventUpgradeListenr", name), e);
            }
        } else {
        }
        initialized = false;
        shutdown = true;
        final ServiceDiscovery lserviceDiscovery = serviceDiscovery;
        serviceDiscovery = null;
        if (null != lserviceDiscovery) {
            lserviceDiscovery.shutdown();
        } else {
        }
        if (chainCodeListeners != null) {
            chainCodeListeners.clear();
        } else {
        }
        if (blockListeners != null) {
            blockListeners.clear();
        } else {
        }
        if (client != null) {
            client.removeChannel(this);
        } else {
        }
        client = null;
        for (EventHub eh : eventHubs) {
            try {
                eh.shutdown();
            } catch (Exception e) {
                // Best effort.
            }
        }
        eventHubs.clear();
        for (Peer peer : new ArrayList<>(getPeers())) {
            try {
                removePeerInternal(peer);
                peer.shutdown(force);
            } catch (Exception e) {
                // Best effort.
            }
        }
        // make sure.
        peers.clear();
        peerMSPIDMap.clear();
        ordererMSPIDMap.clear();
        peerEndpointMap.clear();
        ordererEndpointMap.clear();
        // Make sure
        for (Set<Peer> peerRoleSet : peerRoleSetMap.values()) {
            peerRoleSet.clear();
        }
        for (Orderer orderer : getOrderers()) {
            orderer.shutdown(force);
        }
        orderers.clear();
        if (null != eventQueueThread) {
            eventQueueThread.interrupt();
            eventQueueThread = null;
        } else {
        }
        ScheduledFuture<?> lsweeper = sweeper;
        sweeper = null;
        if (null != lsweeper) {
            lsweeper.cancel(true);
        } else {
        }
        ScheduledExecutorService lse = sweeperExecutorService;
        sweeperExecutorService = null;
        if (null != lse) {
            lse.shutdownNow();
        } else {
        }
    }
}
