package com.example
import org.apache.spark.sql.SparkSession

object Main extends App {

val spark = SparkSession.builder()
  .appName("Read CSV Example")
  .master("local[*]")
  .getOrCreate()

val df = spark.read
  .option("header", "true") // true if CSV has headers
  .option("inferSchema", "true")
  .csv("/opt/data/Fire_Department_and_Emergency_Medical_Services_Dispatched_Calls_for_Service_20240818.csv")

df.show()

}

