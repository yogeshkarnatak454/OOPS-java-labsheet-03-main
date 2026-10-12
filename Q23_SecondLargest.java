import java.util.Scanner;

public class Q23_SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Enter at least two elements.");
        } else {
            int[] array = new int[n];
            for (int i = 0; i < n; i++) array[i] = sc.nextInt();

            int largest = Integer.MIN_VALUE;
            int second = Integer.MIN_VALUE;
            for (int value : array) {
                if (value > largest) {
                    second = largest;
                    largest = value;
                } else if (value > second && value < largest) {
                    second = value;
                }
            }

            if (second == Integer.MIN_VALUE) {
                System.out.println("No distinct second-largest element exists.");
            } else {
                System.out.println("Second-largest distinct element: " + second);
            }
        }
        sc.close();
    }
}
