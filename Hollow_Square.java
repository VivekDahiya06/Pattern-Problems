package Patterns;
import java.util.Scanner;
public class Hollow_Square {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        System.out.println("Enter the no. of times to run the loop : ");
        int n = r.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0; j<n; j++){             //loop to print the pattern
                if(i==0||i==(n-1)||j==0||j==(n-1)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
