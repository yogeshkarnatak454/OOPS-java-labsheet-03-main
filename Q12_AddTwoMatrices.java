import java.util.Scanner;

public class Q12_AddTwoMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];

        System.out.println("Enter 9 elements for the first matrix:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                a[i][j] = sc.nextInt();

        System.out.println("Enter 9 elements for the second matrix:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                b[i][j] = sc.nextInt();

        System.out.println("Sum matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) System.out.print((a[i][j] + b[i][j]) + "\t");
            System.out.println();
        }
        sc.close();
    }
}
