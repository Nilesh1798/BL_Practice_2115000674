import java.util.LinkedList;

public class nthfromend {

    public static Character findNthFromEnd(LinkedList<Character> list, int n) {
        int first = 0;
        int second = 0;

        while (n > 0) {
            first++;
            n--;
        }

        while (first < list.size()) {
            first++;
            second++;
        }

        return list.get(second);
    }

    public static void main(String[] args) {
        LinkedList<Character> linkedList = new LinkedList<>();
        linkedList.add('A');
        linkedList.add('B');
        linkedList.add('C');
        linkedList.add('D');
        linkedList.add('E');

        int n = 2;
        char result = findNthFromEnd(linkedList, n);

        System.out.println("Nth element from the end: " + result);
    }
}
