DESCRIPTION = "roscpp is a C++ implementation of ROS. It provides a client \
  library that enables C++ programmers to quickly interface with ROS Topics, \
  Services, Parameters. roscpp is the most widely used ROS client library and is designed to \
  be the high-performance library for ROS."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "\
  catkin-native cpp-common message-generation-native rosconsole roscpp-serialization \
  roscpp-traits rosgraph-msgs roslang rostime std-msgs xmlrpcpp \
"

require ros-comm.inc

S = "${WORKDIR}/ros_comm-${PV}/clients/${BPN}"
