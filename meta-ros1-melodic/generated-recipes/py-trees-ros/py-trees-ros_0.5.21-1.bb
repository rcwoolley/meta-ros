# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Ros extensions and behaviours for py_trees."
AUTHOR = "Daniel Stonier <d.stonier@gmail.com>"
ROS_AUTHOR = "Daniel Stonier"
HOMEPAGE = "http://ros.org/wiki/py_trees"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "py_trees_ros"
ROS_BPN = "py_trees_ros"

ROS_BUILD_DEPENDS = " \
    ${PYTHON_PN}-setuptools \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${PYTHON_PN}-rospkg \
    ${ROS_UNRESOLVED_DEP-python-termcolor} \
    actionlib \
    actionlib-msgs \
    dynamic-reconfigure \
    geometry-msgs \
    move-base-msgs \
    nav-msgs \
    py-trees \
    py-trees-msgs \
    rosbag \
    rospy \
    sensor-msgs \
    std-msgs \
    unique-id \
    uuid-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    geometry-msgs \
    py-trees \
    python-qt-binding \
    rostest \
    rosunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/stonier/py_trees_ros-release/archive/release/melodic/py_trees_ros/0.5.21-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/py_trees_ros"
SRC_URI = "git://github.com/stonier/py_trees_ros-release;${ROS_BRANCH};protocol=https"
SRCREV = "1155c33bb21170e8c17cd09c5ca94e22364e2d8c"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
