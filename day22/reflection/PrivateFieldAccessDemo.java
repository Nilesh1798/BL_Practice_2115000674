import java.lang.reflect.*;

class Person {
    private int age = 25;
}

class ReflectionDemo {
    public static void main(String[] args) throws Exception {
        Person person = new Person();
        Field ageField = Person.class.getDeclaredField("age");
        ageField.setAccessible(true);
        ageField.set(person, 30);
        System.out.println("Updated Age: " + ageField.get(person));
    }
}