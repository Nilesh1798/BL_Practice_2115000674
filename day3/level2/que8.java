import java.util.Scanner;
public class que8 {
    public static void main(String[] args) {
        Scanner sx = new Scanner(System.in);
        System.out.println("Provide age of 3");
        int a = sx.nextInt();
        int b = sx.nextInt();
        int c = sx.nextInt();
        System.out.println("Provide height of 3");
        int x = sx.nextInt();
        int y = sx.nextInt();
        int z = sx.nextInt();
        int youngestAge = Math.min(a, Math.min(b, c));
        String youngestFriend;

        if (youngestAge == a) {
            youngestFriend = "Amar";
        } else if (youngestAge == b) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }

        int tallestHeight = Math.max(x, Math.max(y, z));
        String tallestFriend;

        if (tallestHeight == x) {
            tallestFriend = "Amar";
        } else if (tallestHeight == y) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }
        System.out.println("The youngest friend is " + youngestFriend + " with age " + youngestAge + ".");
        System.out.println("The tallest friend is " + tallestFriend + " with height " + tallestHeight + " cm.");
    }
}

