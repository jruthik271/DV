// Step-1: MAP REDUCE PROGRAM
import java.io.IOException;
import java.util.StringTokenizer;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
public class WordCount {
	// Mapper Class
	public static class TokenizerMapper
	extends Mapper < Object, Text, Text, IntWritable > {
		private final static IntWritable one = new IntWritable(1);
		private Text word = new Text();
		public void map(Object key, Text value, Context context)
		throws IOException,
		InterruptedException {
			StringTokenizer itr = new StringTokenizer(value.toString());
			while(itr.hasMoreTokens()) {
				word.set(itr.nextToken());
				context.write(word, one);
			}
		}
	}
	// Reducer Class
	public static class IntSumReducer
	extends Reducer < Text, IntWritable, Text, IntWritable > {
		private IntWritable result = new IntWritable();
		public void reduce(Text key, Iterable < IntWritable > values, Context context)
		throws IOException,
		InterruptedException {
			int sum = 0;
			for(IntWritable val: values) {
				sum += val.get();
			}
			result.set(sum);
			context.write(key, result);
		}
	}
	// Driver Class
	public static void main(String[] args) throws Exception {
		Configuration conf = new Configuration();
		Job job = Job.getInstance(conf, "word count");
		job.setJarByClass(WordCount.class);
		job.setMapperClass(TokenizerMapper.class);
		job.setCombinerClass(IntSumReducer.class);
		job.setReducerClass(IntSumReducer.class);
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(IntWritable.class);
		FileInputFormat.addInputPath(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		System.exit(job.waitForCompletion(true) ? 0 : 1);
	}
}

/*

Step-2: Create Input File (Local File System)
This is BDA
hadoop map reduce
hadoop is powerful
map reduce is fast

Step 3: Compile the Program
Compile the Java file using Hadoop libraries:
javac -classpath
"C:\hadoop\share\hadoop\common\*;C:\hadoop\share\hadoop\common\lib\*;C:\hadoop\share\hadoop\mapreduce\*;C:\hadoop\share\hadoop\mapreduce\lib\*;C:\hadoop\share\hadoop\hdfs
\*;C:\hadoop\share\hadoop\hdfs\lib\*;C:\hadoop\share\hadoop\yarn\*;C:\hadoop\share\hadoo
p\yarn\lib\*" WordCount.java


Step 4: Create JAR File
Package the compiled class files into a JAR file:
jar cf wordcount.jar WordCount*.class

Step 5: Start Hadoop Services
Start HDFS and YARN daemons:
start-dfs.cmd
start-yarn.cmd
Verify running services:
jps


Step 6: Check Safe Mode
Check HDFS safe mode status:
hdfs dfsadmin -safemode get
If Safe Mode is ON, turn it OFF:
hdfs dfsadmin -safemode leave


Step 7: Create Input Directory in HDFS
Create a directory for input data:
hdfs dfs -mkdir /wordcount


Step 8: Copy Input File to HDFS
Copy the input file from local system to HDFS:
hdfs dfs -put D:\input.txt /wordcount
Verify:
hdfs dfs -ls /wordcount


Step 9 : Execute the MapReduce Job
Run the WordCount MapReduce program:
hadoop jar wordcount.jar WordCount /wordcount /wordcount_output


Step 10: View Output
Display the final output stored in HDFS:
hdfs dfs -cat /wordcount_output/part-r-00000

*/