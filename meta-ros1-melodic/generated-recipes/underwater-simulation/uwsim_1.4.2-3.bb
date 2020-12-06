# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "UWSim is an UnderWater SIMulator for marine robotics research and development. UWSim visualizes an underwater virtual scenario that can be configured using standard modeling software. Controllable underwater vehicles, surface vessels and robotic manipulators, as well as simulated sensors, can be added to the scene and accessed externally through ROS interfaces. This allows to easily integrate the visualization tool with existing control architectures."
AUTHOR = "Mario Prats <marioprats@gmail.com>"
ROS_AUTHOR = "Mario Prats <marioprats@gmail.com>"
HOMEPAGE = "http://www.irs.uji.es/uwsim/"
SECTION = "devel"
LICENSE = "GPL-1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

ROS_CN = "underwater_simulation"
ROS_BPN = "uwsim"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libopenscenegraph} \
    ${ROS_UNRESOLVED_DEP-libxml++-2.6} \
    ${ROS_UNRESOLVED_DEP-muparser} \
    boost \
    dccomms-ros \
    fftw \
    geographiclib \
    geometry-msgs \
    image-transport \
    interactive-markers \
    kdl-parser \
    mesa \
    nav-msgs \
    osg-interactive-markers \
    osg-markers \
    osg-utils \
    pcl-ros \
    pluginlib \
    resource-retriever \
    robot-state-publisher \
    roscpp \
    sensor-msgs \
    tf \
    underwater-sensor-msgs \
    urdf \
    uwsim-bullet \
    uwsim-osgbullet \
    uwsim-osgocean \
    uwsim-osgworks \
    xacro \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libopenscenegraph} \
    ${ROS_UNRESOLVED_DEP-libxml++-2.6} \
    ${ROS_UNRESOLVED_DEP-muparser} \
    boost \
    dccomms-ros \
    fftw \
    geographiclib \
    geometry-msgs \
    image-transport \
    interactive-markers \
    kdl-parser \
    mesa \
    nav-msgs \
    osg-interactive-markers \
    osg-markers \
    osg-utils \
    pcl-ros \
    pluginlib \
    resource-retriever \
    robot-state-publisher \
    roscpp \
    sensor-msgs \
    tf \
    underwater-sensor-msgs \
    urdf \
    uwsim-bullet \
    uwsim-osgbullet \
    uwsim-osgocean \
    uwsim-osgworks \
    xacro \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libopenscenegraph} \
    ${ROS_UNRESOLVED_DEP-libxml++-2.6} \
    ${ROS_UNRESOLVED_DEP-muparser} \
    boost \
    dccomms-ros \
    fftw \
    geographiclib \
    geometry-msgs \
    image-transport \
    interactive-markers \
    kdl-parser \
    mesa \
    nav-msgs \
    osg-interactive-markers \
    osg-markers \
    osg-utils \
    pcl-ros \
    pluginlib \
    resource-retriever \
    robot-state-publisher \
    roscpp \
    sensor-msgs \
    tf \
    underwater-sensor-msgs \
    urdf \
    uwsim-bullet \
    uwsim-osgbullet \
    uwsim-osgocean \
    uwsim-osgworks \
    xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/uji-ros-pkg/underwater_simulation-release/archive/release/melodic/uwsim/1.4.2-3.tar.gz
ROS_BRANCH ?= "branch=release/melodic/uwsim"
SRC_URI = "git://github.com/uji-ros-pkg/underwater_simulation-release;${ROS_BRANCH};protocol=https"
SRCREV = "f8c99d0e0c9b306f488aa33e679ef26148022b87"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
