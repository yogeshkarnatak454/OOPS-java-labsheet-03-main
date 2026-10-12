import java.util.Scanner;

public class Q21_RotateArrayLeft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be positive.");
        } else {
            int[] array = new int[n];
            for (int i = 0; i < n; i++) array[i] = sc.nextInt();

            int first = array[0];
            for (int i = 0; i < n - 1; i++) array[i] = array[i + 1];
            array[n - 1] = first;

            System.out.print("Array after left rotation: ");
            for (int value : array) System.out.print(value + " ");
            System.out.println();
        }
        sc.close();
    }
}
