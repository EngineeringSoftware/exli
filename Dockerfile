# docker build -t exli .
# docker run -it exli /bin/bash

# Pull base image
FROM ubuntu:22.04
ARG DEBIAN_FRONTEND=noninteractive

# Install sofware properties common
RUN apt-get update && \
    apt-get install -y software-properties-common
RUN rm /bin/sh && ln -s /bin/bash /bin/sh
RUN apt-get update && \
    apt-get -qq -y install apt-utils curl wget unzip zip gcc mono-mcs sudo emacs vim less git build-essential pkg-config libicu-dev firefox
RUN apt-get update && \
    curl -L https://github.com/mozilla/geckodriver/releases/download/v0.31.0/geckodriver-v0.31.0-linux64.tar.gz | tar xz -C /usr/local/bin

# Install miniconda
ENV CONDA_DIR /opt/conda
RUN wget --quiet https://repo.anaconda.com/miniconda/Miniconda3-latest-Linux-x86_64.sh -O ~/miniconda.sh && \
     /bin/bash ~/miniconda.sh -b -p /opt/conda
# Put conda in path so we can use conda activate
ENV PATH=$CONDA_DIR/bin:$PATH

# Add new user
RUN useradd -ms /bin/bash -c "Inlinetests User" itdocker && echo "itdocker:itdocker" | chpasswd && adduser itdocker sudo
USER itdocker
WORKDIR /home/itdocker/

# Install sdkman
RUN curl -s "https://get.sdkman.io" | bash && source "$HOME/.sdkman/bin/sdkman-init.sh"
# Install java 8
RUN sdk install java 8.0.302-open

# Init conda
RUN conda init bash && source ~/.bashrc

# Set up working environment
RUN git clone git@github.com:EngineeringSoftware/inlinetest.git inlinetest
RUN git clone git@github.com:EngineeringSoftware/exli.git exli
# RUN mkdir projects
# COPY --chown=itdocker:itdocker results exli/results
# COPY --chown=itdocker:itdocker python exli/python
# COPY --chown=itdocker:itdocker java exli/java
# COPY --chown=itdocker:itdocker jars exli/jars

# Install python exli
RUN cd "$HOME/exli/python" && /bin/bash -c "bash prepare-conda-env.sh"
# Install ITest
RUN cd "$HOME/inlinetest/java" && /bin/bash -c "bash install.sh"
# Install Exli
RUN cd "$HOME/exli/java" && /bin/bash -c "bash install.sh"

ENTRYPOINT /bin/bash