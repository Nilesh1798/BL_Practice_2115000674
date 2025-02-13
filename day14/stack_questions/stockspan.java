import java.util.Stack;

class stockspan {
    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int n = prices.length;
        stockSpan(prices, n);
    }
    public static void stockSpan(int[] prices, int n) {
        Stack<Integer> stack = new Stack<>();
        int[] span = new int[n];

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - stack.peek();
            }

            stack.push(i);
        }
        for (int s : span) {
            System.out.print(s + " ");
        }
    }
}
