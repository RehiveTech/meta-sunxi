require recipes-bsp/u-boot/u-boot.inc

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/gpl-2.0.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263"

# This revision corresponds to the tag "v2015.01"
SRCREV = "92fa7f53f1f3f03296f8ffb14bdf1baefab83368"

PE = "1"
PV = "v2015.01+git${SRCPV}"

SPL_BINARY = "u-boot-sunxi-with-spl.bin"

# Much more machines are supported, but I have only that one
COMPATIBLE_MACHINE = "(olinuxino-a10)"

PACKAGE_ARCH = "${MACHINE_ARCH}"
