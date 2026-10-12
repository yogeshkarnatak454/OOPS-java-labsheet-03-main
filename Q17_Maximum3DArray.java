import java.util.Scanner;

public class Q17_Maximum3DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        System.out.println("Enter 8 elements for the 2x2x2 array:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++) {
                    int value = sc.nextInt();
                    if (value > max) max = value;
                }

        System.out.println("Maximum element: " + max);
        sc.close();
    }
}
