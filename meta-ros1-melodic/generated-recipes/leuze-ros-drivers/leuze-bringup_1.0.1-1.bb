# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "This package contains ."
AUTHOR = "Ludovic Delval <ludovic.delval@ipa.fraunhofer.de>"
ROS_AUTHOR = "Ludovic Delval <ludovic.delval@ipa.fraunhofer.de>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=740ffa6e787a40b3ec532a5b41b0c385"

ROS_CN = "leuze_ros_drivers"
ROS_BPN = "leuze_bringup"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    leuze-description \
    leuze-phidget-driver \
    leuze-rsl-driver \
    phidgets-ik \
    robot-state-publisher \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    roslaunch \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ipa-led/leuze_ros_drivers-release/archive/release/melodic/leuze_bringup/1.0.1-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/leuze_bringup"
SRC_URI = "git://github.com/ipa-led/leuze_ros_drivers-release;${ROS_BRANCH};protocol=https"
SRCREV = "417d00f5d283f905c7308492c8b60ea73540c084"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}