DESCRIPTION = "Playbox docker containers and service files"
LICENSE = "GPLv3"

inherit systemd features_check

SRC_URI="git://github.com/bernedom/playbox.git"
SRCREV="0.1.8"
S = "${WORKDIR}/git"



DEPENDS += "\
docker-distribution docker-ce \
"
LIC_FILES_CHKSUM="file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

do_install() {

    install -d ${D}${systemd_unitdir}/system
    install -m 0644 ${S}/resource/playbox_container.service ${D}${systemd_unitdir}/system
}

SYSTEMD_SERVICE_${PN} = " \
    playbox_container.service \
"

SYSTEMD_AUTO_ENABLE_${PN} = "enable"
REQUIRED_DISTRO_FEATURES= "systemd"