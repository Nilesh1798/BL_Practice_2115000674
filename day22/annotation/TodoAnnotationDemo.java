import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Todo {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}

class TodoDemo {
    @Todo(task = "Implement login", assignedTo = "Alice", priority = "HIGH")
    public void loginFeature() {}

    @Todo(task = "Optimize database queries", assignedTo = "Bob")
    public void optimizeDB() {}
}

class TodoProcessor {
    public static void main(String[] args) throws Exception {
        Method[] methods = TodoDemo.class.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Todo.class)) {
                Todo annotation = method.getAnnotation(Todo.class);
                System.out.println("Task: " + annotation.task() + ", Assigned to: " + annotation.assignedTo() + ", Priority: " + annotation.priority());
            }
        }
    }
}