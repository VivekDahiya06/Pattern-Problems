package Patterns;
import java.util.Scanner;
public class Diamond{
    public static void main(String[] args){
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the no. of times to run the loop : ");
        int n=r.nextInt();
        if(n%2==0){//                        Pattern if the no. of loops are even
            for(int i=1;i<=n/2;i++){//       Loop to print upper part of Diamond
                for(int j=i;j<=n;j++){System.out.print(" ");}
                for(int j=1;j<=i;j++){System.out.print("*");}
                for(int j=2;j<=i;j++){System.out.print("*");}
                System.out.println();
            }
            for(int i=n/2;i>=1;i--){//       Loop to print lower part of Diamond
                for(int j=i;j<=n;j++){System.out.print(" ");}
                for(int j=1;j<=i;j++){System.out.print("*");}
                for(int j=2;j<=i;j++){System.out.print("*");}
                System.out.println();
            }}
        else {//                             Pattern if the no. of loops are odd
            for(int i=1;i<=(n/2)+1;i++){//   Loop to print upper part of Diamond
                for(int j=i;j<=n;j++){System.out.print(" ");}
                for(int j=1;j<=i;j++){System.out.print("*");}
                for(int j=2;j<=i;j++){System.out.print("*");}
                System.out.println();
            }
            for(int i=n/2;i>=1;i--){//       Loop to print lower part of Diamond
                for(int j=i;j<=n;j++){System.out.print(" ");}
                for(int j=1;j<=i;j++){System.out.print("*");}
                for(int j=2;j<=i;j++){System.out.print("*");}
                System.out.println();
            }}
    }}