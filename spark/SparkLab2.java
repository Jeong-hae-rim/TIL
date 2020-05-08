package sparkexam;

import java.util.Arrays;

import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

import scala.Tuple2;

public class SparkLab2 {
	
	public static void main(String[] args) throws Exception {
		JavaSparkContext sc = SparkUtils.getSparkContext("SparkLab1");
		
		doMapAndFlatMap(sc);

		sc.stop();
	}

	public static void doMapAndFlatMap(JavaSparkContext sc)  {
		JavaRDD<String> rdd = sc.textFile("hdfs://192.168.111.120:9000/edudata/product_click.log");
		JavaRDD<String> rdd1 = rdd.flatMap((String t) -> Arrays.asList(t.split(" ")).iterator());
		//System.out.println(rdd1.collect());
		
		JavaRDD<String> rdd2 = rdd1.filter(word -> word.length() < 5); 
		//System.out.println(rdd2.collect());
		
		JavaPairRDD<String, Integer> rdd3 = rdd2.mapToPair(word -> new Tuple2<String, Integer>(word, 1));
		//System.out.println(rdd3.collect());
		
		JavaPairRDD<String, Integer> rdd4 = rdd3.reduceByKey((v1,  v2) -> v1 + v2);
		//System.out.println(rdd4.collect());
		
		JavaPairRDD<Integer, String> rdd5 = rdd4.mapToPair(x -> x.swap());
		JavaPairRDD<Integer, String> rdd6 = rdd5.sortByKey(false);
		JavaPairRDD<String, Integer> rdd7 = rdd6.mapToPair(x -> x.swap());
		
		
		rdd7.foreach(tupledata -> System.out.println("(" + tupledata._1 + "," +tupledata._2 + ")" ));
		

	} 

}
