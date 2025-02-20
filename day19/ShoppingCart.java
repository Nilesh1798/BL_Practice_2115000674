import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ShoppingCart {

    private Map<String, Double> priceMap = new HashMap<>();
    private Map<String, Double> insertionOrderMap = new LinkedHashMap<>();

    public ShoppingCart() {
        // Initialize with some product prices
        priceMap.put("Apple", 0.99);
        priceMap.put("Banana", 0.59);
        priceMap.put("Carrot", 0.39);
        priceMap.put("Date", 1.29);
    }

    public void addItem(String item) {
        if (priceMap.containsKey(item)) {
            insertionOrderMap.put(item, priceMap.get(item));
        } else {
            System.out.println("Item not available: " + item);
        }
    }

    public Map<String, Double> getItemsInInsertionOrder() {
        return new LinkedHashMap<>(insertionOrderMap);
    }

    public Map<String, Double> getItemsSortedByPrice() {
        return new TreeMap<>(insertionOrderMap);
    }

    public double getTotalPrice() {
        return insertionOrderMap.values().stream().mapToDouble(Double::doubleValue).sum();
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("Apple");
        cart.addItem("Banana");
        cart.addItem("Carrot");
        cart.addItem("Date");

        System.out.println("Items in Insertion Order: " + cart.getItemsInInsertionOrder());
        System.out.println("Items Sorted by Price: " + cart.getItemsSortedByPrice());
        System.out.println("Total Price: $" + cart.getTotalPrice());
    }
}
