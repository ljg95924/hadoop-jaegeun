package org.apache.hadoop.io;

import java.io.IOException;
import java.util.List;

import org.apache.hadoop.mapred.InputSplit;
import org.apache.hadoop.mapred.JobContext;
import org.apache.hadoop.mapreduce.RecordReader;
import org.apache.hadoop.mapreduce.TaskAttemptContext;

public abstract class InputFormat<K,V> {
	public abstract List<InputSplit> getSplits(JobContext context)throws IOException,
	InterruptedException;
	public abstract RecordReader<K,V> createRecordReader(InputSplit split,
			TaskAttemptContext context) throws IOException, InterruptedException;
}
