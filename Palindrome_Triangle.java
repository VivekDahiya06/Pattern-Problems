import java.util.Scanner;
public class Palindrome_Triangle {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.print("Enter the no. of times to run the loop : ");
        int n = r.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            for (int j = i + 1; j > 0; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }}
