import java.lang.reflect.*;

interface Greeting {
    void sayHello();
}

class GreetingImpl implements Greeting {
    public void sayHello() {
        System.out.println("Hello, World!");
    }
}

class LoggingProxy {
    public static void main(String[] args) {
        Greeting greeting = (Greeting) Proxy.newProxyInstance(
            Greeting.class.getClassLoader(),
            new Class<?>[]{Greeting.class},
            (proxy, method, methodArgs) -> {
                System.out.println("Executing: " + method.getName());
                return method.invoke(new GreetingImpl(), methodArgs);
            }
        );
        greeting.sayHello();
    }
}