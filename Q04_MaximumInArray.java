import java.util.Scanner;

public class Q04_MaximumInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be positive.");
        } else {
            int[] numbers = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                numbers[i] = sc.nextInt();
            }

            int max = numbers[0];
            for (int number : numbers) {
                if (number > max) max = number;
            }
            System.out.println("Maximum element: " + max);
        }
        sc.close();
    }
}
