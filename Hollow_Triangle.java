import java.util.Scanner;
public class Hollow_Triangle {
    public static void main(String[] args) {
    Scanner r=new Scanner(System.in);
    System.out.print("Enter the no. of times to run the loop : ");
    int n=r.nextInt();
    int x=1;
    for(int i=n;i>=1;i--){
        for(int j=x;j<n;j++){System.out.print(" ");}
        for(int j=i;j<=n;j++){
            if((j==i||j==n)||i==1){System.out.print("* ");}
            else{System.out.print("  ");}
        }
        System.out.println();
        x+=1;
    }
}}
