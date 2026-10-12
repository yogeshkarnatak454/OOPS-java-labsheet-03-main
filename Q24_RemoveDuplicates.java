import java.util.Scanner;

public class Q24_RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be positive.");
        } else {
            int[] array = new int[n];
            int[] unique = new int[n];
            int uniqueCount = 0;

            for (int i = 0; i < n; i++) array[i] = sc.nextInt();

            for (int value : array) {
                boolean exists = false;
                for (int j = 0; j < uniqueCount; j++) {
                    if (unique[j] == value) {
                        exists = true;
                        break;
                    }
                }
                if (!exists) unique[uniqueCount++] = value;
            }

            System.out.print("Array without duplicates: ");
            for (int i = 0; i < uniqueCount; i++) System.out.print(unique[i] + " ");
            System.out.println();
        }
        sc.close();
    }
}
