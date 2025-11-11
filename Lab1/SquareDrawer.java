import java.util.Scanner;

public class SquareDrawer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter an integer >0 and <21: ");
            int n = sc.nextInt();

            if (n < 1 || n > 20) {
                System.out.println("Wrong number range");
                break;
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }

        sc.close();
    }
}
