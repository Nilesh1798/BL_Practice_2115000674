import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReports {
    BugReport[] value();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(BugReports.class)
@interface BugReport {
    String description();
}

class SoftwareModule {
    @BugReport(description = "Null pointer exception on edge case")
    @BugReport(description = "Incorrect output in certain conditions")
    public void buggyMethod() {
        System.out.println("Buggy method");
    }
}

public class Exercise5 {
    public static void main(String[] args) throws Exception {
        Method method = SoftwareModule.class.getMethod("buggyMethod");
        BugReports reports = method.getAnnotation(BugReports.class);
        for (BugReport report : reports.value()) {
            System.out.println("Bug Report: " + report.description());
        }
    }
}