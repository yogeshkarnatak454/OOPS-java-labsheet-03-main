import java.util.Scanner;

public class Q03_SumOf1DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be positive.");
        } else {
            int[] numbers = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                numbers[i] = sc.nextInt();
                sum += numbers[i];
            }
            System.out.println("Sum of elements: " + sum);
        }
        sc.close();
    }
}
