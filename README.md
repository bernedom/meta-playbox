This README file contains information on the contents of the meta-playbox layer.

Please see the corresponding sections below for details.

Dependencies
============


    URI: https://github.com/jumpnow/meta-rpi
    branch: dunfell

    URI: git://git.yoctoproject.org/poky.git
    branch: dunfell

    URI: git://git.openembedded.org/meta-openembedded
    branch: dunfell

    URI: https://github.com/meta-qt5/meta-qt5
    branch: dunfell

    URI: git://git.yoctoproject.org/meta-raspberrypi
    branch: dunfell

    URI: git://git.yoctoproject.org/meta-security.git
    branch: dunfell

    URI: git://git.yoctoproject.org/meta-virtualization
    branch: dunfell

Patches
=======

Maintainer: Dominik Berner <dominik.berner at googles mail dot com>

Table of Contents
=================

  I. Adding the meta-playbox layer to your build
 II. Building


I. Adding the meta-playbox layer to your build
=================================================

Run 'bitbake-layers add-layer meta-playbox'

II. Building
============

```bash
cd <build-dir/poky>
. oe-build-environment
bitbake core-image-base
```

## Further reading

https://jumpnowtek.com/rpi/Raspberry-Pi-Systems-with-Yocto.html

https://medium.com/@shantanoodesai/run-docker-on-a-raspberry-pi-4-with-yocto-project-551d6b615c0b