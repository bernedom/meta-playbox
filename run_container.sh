#!/bin/bash


declare -i NUM_PROC_TO_USE=$(nproc)/2
docker run --rm -v $(pwd):/home/builder/image-builder -v $(echo $HOME)/.ssh:/home/builder/.ssh --cpus="${NUM_PROC_TO_USE}" -ti bernedom/yoctobuilder:latest