import java.util.Scanner;

public class NumberSquareIncrement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            if (n < 1 || n > 20) {
                System.out.println("Wrong number range");
                break;
            }

            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < n; j++) {
                    int num = i + j * n;  // pattern logic
                    System.out.printf("%-3d", num);
                }
                System.out.println();
            }
            System.out.println();
        }

        sc.close();
    }
}
