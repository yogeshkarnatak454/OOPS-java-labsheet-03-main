import java.util.Scanner;

public class Q18_Search3DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][][] data = new int[2][2][2];

        System.out.println("Enter 8 elements for the 2x2x2 array:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++)
                    data[i][j][k] = sc.nextInt();

        System.out.print("Enter value to search: ");
        int target = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++)
                    if (data[i][j][k] == target) {
                        System.out.println("Found at index [" + i + "][" + j + "][" + k + "]");
                        found = true;
                    }

        if (!found) System.out.println("Element not found.");
        sc.close();
    }
}
