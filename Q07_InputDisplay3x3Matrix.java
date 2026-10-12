import java.util.Scanner;

public class Q07_InputDisplay3x3Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix:");
        for (int[] row : matrix) {
            for (int value : row) System.out.print(value + "\t");
            System.out.println();
        }
        sc.close();
    }
}
