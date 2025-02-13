
import java.util.*;

class slidingwindoe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        findMax(nums, n, k);
    }
    public static void findMax(int[] nums, int n, int k) {
        Deque<Integer> deque = new LinkedList<>();
        int[] result = new int[n - k + 1];

        for (int i = 0; i < n; i++) {
            if (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
                deque.pollLast();
            }
            deque.offerLast(i);
            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peekFirst()];
            }
        }
        System.out.print("Sliding Window Maximums: ");
        for (int max : result) {
            System.out.print(max + " ");
        }
    }

   
}
