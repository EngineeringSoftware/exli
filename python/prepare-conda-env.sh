#!/bin/bash
# prepare a conda environment for developing exli

_DIR=$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )

function prepare_conda_env() {
        # the python version to use
        local python_version=${1:-3.9}; shift
        # the conda env name
        local env_name=${1:-exli}; shift

        echo ">>> Preparing conda environment \"${env_name}\", python_version=${python_version}"
        
        # Preparation
        set -e
        eval "$(conda shell.bash hook)"
        conda env remove --name $env_name
        conda create --name $env_name python=$python_version pip -y
        conda activate $env_name
        pip install --upgrade pip

        # Install libraries but not this package itself
        pip install .[dev,research]
        pip uninstall ExLi-research -y
}


prepare_conda_env "$@"
