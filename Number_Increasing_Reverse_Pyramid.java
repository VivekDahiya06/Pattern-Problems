package Patterns;
import java.util.Scanner;
public class Number_Increasing_Reverse_Pyramid {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("Enter the no. of times to run the loop : ");
        int n = r.nextInt();
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}