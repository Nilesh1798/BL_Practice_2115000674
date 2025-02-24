import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime {}

class ExecutionTimeLogger {
    @LogExecutionTime
    public void performTask() {
        long start = System.nanoTime();
        for (int i = 0; i < 1000000; i++); // Simulating task
        long end = System.nanoTime();
        System.out.println("Execution time: " + (end - start) + " ns");
    }
}