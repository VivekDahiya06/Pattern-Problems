package Patterns;
import java.util.Scanner;
public class Hollow_hour_glass {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
        System.out.print("Enter the no. of times to run the loop : ");
    int n=s.nextInt();
        for(int i=n;i>=1;i--){
        for(int j=i;j<=n;j++){System.out.print(" ");}
        for(int j=1;j<=i;j++){
            if(i==n||j==1||j==i){System.out.print("* ");}
            else {System.out.print("  ");}
        }
        System.out.println();
    }
        for(int i=2;i<=n;i++){
        for(int j=i;j<=n;j++){System.out.print(" ");}
        for(int j=1;j<=i;j++){
            if(i==n||j==1||j==i){System.out.print("* ");}
            else{System.out.print("  ");}
        }
        System.out.println();
    }
}}