import java.util.Scanner;
public class que7 {
    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false;  
        } else if (age >= 18) {
            return true;   
        } else {
            return false; 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentVoteChecker checker = new StudentVoteChecker();
        int[] ages = new int[10];  
        System.out.println("Enter the ages of 10 students:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();  
        }

        for (int i = 0; i < 10; i++) {
            if (checker.canStudentVote(ages[i])) {
                System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + ") is eligible to vote.");
            } else {
                System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + ") is not eligible to vote.");
            }
        }

        scanner.close();
    }
}

