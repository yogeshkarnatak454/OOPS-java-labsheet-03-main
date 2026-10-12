import java.util.Scanner;

public class Q06_CopyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be positive.");
        } else {
            int[] source = new int[n];
            int[] copy = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                source[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                copy[i] = source[i];
            }

            System.out.print("Copied array: ");
            for (int value : copy) System.out.print(value + " ");
            System.out.println();
        }
        sc.close();
    }
}
