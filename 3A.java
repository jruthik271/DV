/*
Apache Hadoop is an open-source framework used for distributed storage and processing
of large data sets using the Map Reduce programming model.
Hadoop can operate in three modes:
1. Standalone Mode – Default mode, runs Hadoop as a single Java process, mainly used
for testing.
2. Pseudo-Distributed Mode – Runs all Hadoop daemons on a single machine but
simulates a distributed environment.
3. Fully Distributed Mode – Runs Hadoop daemons on multiple machines forming a
cluster.
Each mode helps in understanding Hadoop’s scalability and functionality.
Steps to Install and Run Hadoop on Windows: -
*/


Step 1: Download JDK 1.8 and Apache Hadoop 3.2.4

Step 2: Extract Apache Hadoop into the *C:* drive

Step 3: Rename the extracted folder from
hadoop-3.2.4 → Hadoop

Step 4: Set JAVA_HOME in Environment Variables
(Path of JDK installation)

Step 5: Verify Java installation
java -version

Step 6: Set HADOOP_HOME in Environment Variables
(Path: C:\hadoop)

Step 7: Verify Hadoop installation
hadoop version

Step 8: Configure XML files
(core-site.xml, hdfs-site.xml, mapred-site.xml, yarn-site.xml)
as per the PPT

Step 9: Format NameNode
hdfs namenode -format

Step 10: Start Hadoop services
start-dfs.cmd
start-yarn.cmd

Step 11: Check running Hadoop processes using:
Jps

/*
Standalone Mode (Local Mode)
 No Hadoop daemons are required.
 Uses the local file system.
 Suitable for learning and debugging.

Features:
 Simple configuration
 No HDFS
 Single JVM execution

Pseudo-Distributed Mode
 All Hadoop services run on a single node.
 Uses HDFS.
 Each daemon runs in a separate JVM.

Daemons Running:
 NameNode
 DataNode
 ResourceManager
 NodeManager

Fully Distributed Mode
 Hadoop runs on multiple nodes.
 One master node and multiple slave nodes.
 Used in real-time production environments.

Advantages:
 High fault tolerance
 Distributed storage and processing
 Better performance and scalability

*/