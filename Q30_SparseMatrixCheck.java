import java.util.Scanner;

public class Q30_SparseMatrixCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        if (rows <= 0 || cols <= 0) {
            System.out.println("Dimensions must be positive.");
        } else {
            int zeros = 0;
            int nonZeros = 0;
            System.out.println("Enter matrix elements:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    int value = sc.nextInt();
                    if (value == 0) zeros++;
                    else nonZeros++;
                }
            }

            System.out.println("Zero elements: " + zeros);
            System.out.println("Non-zero elements: " + nonZeros);
            if (zeros > nonZeros) {
                System.out.println("The matrix is sparse.");
            } else {
                System.out.println("The matrix is not sparse under the given definition.");
            }
        }
        sc.close();
    }
}
