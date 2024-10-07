import java.util.Scanner;
public class Mirror_Image_Triangle {
    public static void main(String[] args) {
    Scanner r=new Scanner(System.in);
    int x=1;
    System.out.print("Enter the no. of times to run the loop : ");
    int n=r.nextInt();
    for(int i=n;i>=1;i--){
        for(int j=i;j<=n;j++){System.out.print(" ");}
        for(int j=x;j<=n;j++){System.out.print(j+" ");}
        System.out.println();
        x+=1;
    }
    for(int i=(n-1);i>=1;i--){
        for(int j=1;j<=i;j++){System.out.print(" ");}
        for(int j=i;j<=n;j++){System.out.print(j+" ");}
        System.out.println();
    }
}}
