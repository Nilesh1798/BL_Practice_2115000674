import java.util.*;

class Node {
    int key, value;
    Node next;

    Node(int key, int value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}

class CustomHashMap {
    private static final int SIZE = 10;
    private Node[] buckets;

    public CustomHashMap() {
        buckets = new Node[SIZE];
    }

    private int getHash(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int index = getHash(key);
        Node newNode = new Node(key, value);
        
        if (buckets[index] == null) {
            buckets[index] = newNode;
        } else {
            Node curr = buckets[index];
            while (curr.next != null) {
                if (curr.key == key) {
                    curr.value = value;
                    return;
                }
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    public Integer get(int key) {
        int index = getHash(key);
        Node curr = buckets[index];
        
        while (curr != null) {
            if (curr.key == key) {
                return curr.value;
            }
            curr = curr.next;
        }
        return null;
    }

    public void remove(int key) {
        int index = getHash(key);
        Node curr = buckets[index], prev = null;

        while (curr != null) {
            if (curr.key == key) {
                if (prev == null) {
                    buckets[index] = curr.next;
                } else {
                    prev.next = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }
}

public class CustomHashMapTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomHashMap map = new CustomHashMap();

        map.put(1, 100);
        map.put(2, 200);
        map.put(3, 300);

        System.out.println("Value for key 2: " + map.get(2));

        map.remove(2);
        System.out.println("After removing key 2, value: " + map.get(2));
    }
}