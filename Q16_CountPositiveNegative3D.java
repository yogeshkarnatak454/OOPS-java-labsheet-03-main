import java.util.Scanner;

public class Q16_CountPositiveNegative3D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positive = 0, negative = 0, zero = 0;

        System.out.println("Enter 8 elements for the 2x2x2 array:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++) {
                    int value = sc.nextInt();
                    if (value > 0) positive++;
                    else if (value < 0) negative++;
                    else zero++;
                }

        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zeros: " + zero);
        sc.close();
    }
}
