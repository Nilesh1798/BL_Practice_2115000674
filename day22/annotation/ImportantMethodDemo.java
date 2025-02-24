import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ImportantMethod {
    String level() default "HIGH";
}

class ImportantMethodsDemo {
    @ImportantMethod(level = "HIGH")
    public void criticalFunction() {
        System.out.println("Executing critical function");
    }
    
    @ImportantMethod(level = "MEDIUM")
    public void secondaryFunction() {
        System.out.println("Executing secondary function");
    }
}

class ImportantMethodProcessor {
    public static void main(String[] args) throws Exception {
        Method[] methods = ImportantMethodsDemo.class.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                System.out.println("Method: " + method.getName() + ", Level: " + annotation.level());
            }
        }
    }
}