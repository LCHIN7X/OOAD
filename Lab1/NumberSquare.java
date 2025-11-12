import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number (1-20): ");
            int n = sc.nextInt();
            if (n < 1 || n > 20) {
                System.out.println("Wrong number range");
                break;
            }

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i == 1) {                    // first row
                        System.out.print(j + " ");
                    } else if (i == n) {             // last row (descending)
                        System.out.print((n - j + 1) + " ");
                    } else if (j == 1) {             // left edge
                        System.out.print(i + " ");
                    } else if (j == n) {             // right edge
                        System.out.print((n - i + 1) + " ");
                    } else {                         // inside
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }

        
    }
}
