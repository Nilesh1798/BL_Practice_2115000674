import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class frequencycounter {

    public static Map<String, Integer> countFrequency(List<String> list) {
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String element : list) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }

        return frequencyMap;
    }

    public static void main(String[] args) {
        List<String> fruitList = List.of("apple", "banana", "apple", "orange");
        Map<String, Integer> frequencyMap = countFrequency(fruitList);

        System.out.println("Frequency of elements: " + frequencyMap);
    }
}
