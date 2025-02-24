import java.lang.reflect.*;

class ClassInformation {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("java.util.ArrayList");
        System.out.println("Methods: ");
        for (Method method : clazz.getMethods()) {
            System.out.println(method.getName());
        }
    }
}