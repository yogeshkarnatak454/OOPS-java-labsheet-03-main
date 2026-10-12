import java.util.Arrays;

public class Q29_SortJaggedArrayRows {
    public static void main(String[] args) {
        int[][] jagged = {
            {8, 3, 5},
            {9, 1},
            {7, 4, 6, 2}
        };

        for (int i = 0; i < jagged.length; i++) {
            Arrays.sort(jagged[i]);
        }

        System.out.println("Jagged array after sorting each row:");
        for (int[] row : jagged) {
            for (int value : row) System.out.print(value + " ");
            System.out.println();
        }
    }
}
