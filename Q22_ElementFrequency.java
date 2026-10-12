import java.util.Scanner;

public class Q22_ElementFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be positive.");
        } else {
            int[] array = new int[n];
            boolean[] counted = new boolean[n];

            for (int i = 0; i < n; i++) array[i] = sc.nextInt();

            for (int i = 0; i < n; i++) {
                if (counted[i]) continue;
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (array[i] == array[j]) {
                        count++;
                        counted[j] = true;
                    }
                }
                System.out.println(array[i] + " appears " + count + " time(s).");
            }
        }
        sc.close();
    }
}
