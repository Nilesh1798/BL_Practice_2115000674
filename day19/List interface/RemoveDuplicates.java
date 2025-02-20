import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

    public static List<Integer> removeDuplicates(List<Integer> list) {
        Set<Integer> seen = new LinkedHashSet<>();
        List<Integer> result = List.copyOf(seen);

        for (Integer element : list) {
            seen.add(element);
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> originalList = List.of(3, 1, 2, 2, 3, 4);
        List<Integer> listWithoutDuplicates = removeDuplicates(originalList);

        System.out.println("List without duplicates: " + listWithoutDuplicates);
    }
}
