# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_eloquent
inherit ros_superflore_generated

DESCRIPTION = "Geographic information metapackage.      Not needed for wet packages, use only to resolve dry stack     dependencies."
AUTHOR = "Jack O'Quin <jack.oquin@gmail.com>"
ROS_AUTHOR = "Jack O'Quin"
HOMEPAGE = "http://wiki.ros.org/geographic_info"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "geographic_info"
ROS_BPN = "geographic_info"

ROS_BUILD_DEPENDS = " \
    geodesy \
    geographic-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    geodesy \
    geographic-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geodesy \
    geographic-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-geographic-info/geographic_info-release/archive/release/eloquent/geographic_info/1.0.1-1.tar.gz
ROS_BRANCH ?= "branch=release/eloquent/geographic_info"
SRC_URI = "git://github.com/ros-geographic-info/geographic_info-release;${ROS_BRANCH};protocol=https"
SRCREV = "fc7ae0eda1ed2d2092422c18c75cf7842af8b859"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
