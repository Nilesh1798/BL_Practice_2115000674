import java.util.ArrayList;
import java.util.List;

public class ListRotator {

    public static List<Integer> rotateList(List<Integer> list, int positions) {
        int size = list.size();
        List<Integer> rotatedList = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            rotatedList.add(list.get((i + positions) % size));
        }

        return rotatedList;
    }

    public static void main(String[] args) {
        List<Integer> originalList = List.of(10, 20, 30, 40, 50);
        int rotateBy = 2;

        List<Integer> rotatedList = rotateList(originalList, rotateBy);
        System.out.println("Rotated List: " + rotatedList);
    }
}
