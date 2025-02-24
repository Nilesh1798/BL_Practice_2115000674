import java.util.ArrayList;

public class Exercise3 {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList list = new ArrayList(); // No generics specified
        list.add("Unchecked warning suppressed");
        System.out.println(list.get(0));
    }
}