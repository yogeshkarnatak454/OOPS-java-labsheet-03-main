import java.util.Scanner;

public class Q14_InputDisplay3DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][][] data = new int[2][2][2];

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++) {
                    System.out.print("Enter element [" + i + "][" + j + "][" + k + "]: ");
                    data[i][j][k] = sc.nextInt();
                }

        for (int i = 0; i < 2; i++) {
            System.out.println("Layer " + (i + 1) + ":");
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) System.out.print(data[i][j][k] + "\t");
                System.out.println();
            }
        }
        sc.close();
    }
}
