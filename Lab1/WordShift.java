import java.util.Scanner;

public class WordShift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = sc.nextLine().toUpperCase();

        int len = input.length();

        
        char[] letters = input.toCharArray();

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
               
                System.out.print(letters[(i + j) % len]);
            }
            System.out.println();
        }

        sc.close();
    }
}
