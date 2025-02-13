import java.util.*;

class circular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of petrol pumps: ");
        int n = scanner.nextInt();

        int[] petrol = new int[n];
        int[] distance = new int[n];

        for (int i = 0; i < n; i++) {
            petrol[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            distance[i] = scanner.nextInt();
        }

        int start = findStartingPump(petrol, distance, n);

        if (start == -1) {
            System.out.println("No valid tour possible");
        } else {
            System.out.println("Start from pump index: " + start);
        }
    }
    public static int findStartingPump(int[] petrol, int[] distance, int n) {
        int totalPetrol = 0, totalDistance = 0;
        int start = 0, surplus = 0;

        for (int i = 0; i < n; i++) {
            totalPetrol += petrol[i];
            totalDistance += distance[i];
            surplus += petrol[i] - distance[i];
            if (surplus < 0) {
                start = i + 1;
                surplus = 0;  
            }
        }

        if (totalPetrol >= totalDistance) {
            return start;
        } else {
            return -1;
        }
    }

   
}
