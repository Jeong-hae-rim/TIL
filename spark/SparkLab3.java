package sparkexam;

import java.util.Arrays;

import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

import scala.Tuple2;

public class SparkLab3 {
	
	public static void main(String[] args) throws Exception {
		JavaSparkContext sc = SparkUtils.getSparkContext("SparkLab3");
		
		doMapAndFlatMap(sc);

		sc.stop();
	}

	public static void doMapAndFlatMap(JavaSparkContext sc) {
		
		JavaRDD<String> rdd = sc.textFile("hdfs://192.168.111.120:9000/edudata/tomcat_access_log.txt");
		//System.out.println(rdd.collect());
		
		JavaRDD<String> rdd1 = rdd.flatMap((String t) -> Arrays.asList(t.split(" ")[3]).iterator());
		//System.out.println(rdd1.collect());
		
		JavaRDD<String> rdd2 = rdd1.flatMap((String line) -> Arrays.asList(line.substring(13, 15)).iterator());
		//System.out.println(rdd2.collect());
		
		JavaPairRDD<String, Integer> rdd3 = rdd2.mapToPair(time -> new Tuple2<String, Integer>(time, 1));
		//System.out.println(rdd3.collect());
		
		JavaPairRDD<String, Integer> rdd4 = rdd3.reduceByKey((v1,  v2) -> v1 + v2);
		//System.out.println(rdd4.collect());
		
		JavaPairRDD<Integer, String> rdd5 = rdd4.mapToPair(x -> x.swap());
		JavaPairRDD<Integer, String> rdd6 = rdd5.sortByKey(false);
		JavaPairRDD<String, Integer> rdd7 = rdd6.mapToPair(x -> x.swap());
		
		
		//rdd7.foreach(tupledata -> System.out.println("(" + tupledata._1 + "," +tupledata._2 + ")" ));
		
		System.out.println("제일 많이 요청된 시간은 " + rdd7.first()._1 + "시간대 입니다.");
		
		
		
		
	}

}
