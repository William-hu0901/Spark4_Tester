package org.daodao.spark4;

public final class Constants {
    
    private Constants() {
        // Utility class - prevents instantiation
    }
    
    // Application constants
    public static final String APP_NAME = "Spark4Tester";
    public static final String LOCAL_MASTER = "local[*]";
    
    // Spark 4.0 specific constants
    public static final String SPARK_SQL_ANSI_MODE = "spark.sql.ansi.enabled";
    public static final String SPARK_SQL_STORE_ASSIGNMENT_POLICY = "spark.sql.storeAssignmentPolicy";
    public static final String SPARK_SQL_DATETIME_JAVA8API_ENABLED = "spark.sql.datetime.java8API.enabled";
    public static final String SPARK_SQL_LEGACY_INTERVAL_ENABLED = "spark.sql.legacy.interval.enabled";
    public static final String SPARK_SQL_ARROW_PYSPARK_ENABLED = "spark.sql.execution.arrow.pyspark.enabled";
    public static final String SPARK_SQL_EXECUTION_ARROW_MAX_RECORDS_PER_BATCH = "spark.sql.execution.arrow.maxRecordsPerBatch";
}