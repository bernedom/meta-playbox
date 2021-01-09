DESCRIPTION = "Playbox docker containers and service files"
LICENSE = "GPLv3"

SRC_URI="https://github.com/bernedom/playbox/archive/0.1.8.tar.gz"
SRC_URI[md5sum] = "73d6a5d82fd414c1e2750ba10bc0d0e8"

inherit systemd

DEPENDS += "\
docker-distribution docker-ce \
"

LIC_FILES_CHKSUM="file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"
S = " \ 
    ${WORKDIR}/playbox-${PV} \
    "
                

do_install() {

    install -d ${D}${systemd_unitdir}/system
    install -m 0644 ${S}/resource/playbox_container.service ${D}${systemd_unitdir}/system
}

SYSTEMD_SERVICE_${PN} = " \
    playbox_container.service \
"

SYSTEMD_AUTO_ENABLE_${PN} = "enable"
REQUIRED_DISTRO_FEATURES= "systemd"