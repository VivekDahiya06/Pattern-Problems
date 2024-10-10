package Patterns;
import java.util.Scanner;
public class Rhombus {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("Enter the no. of times to run the loop : ");
        int n = r.nextInt();
        for(int i=0;i<n; i++){
            for(int j=i; j<n; j++){
                System.out.print(" ");
            }
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
