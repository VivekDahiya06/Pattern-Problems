import java.util.Scanner;
public class Number_Triangle {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("Enter the no. of times to run the loop : ");
        int n = r.nextInt();
        int x=1;
        for(int i=0; i<n; i++){        //Loop to print the pattern
            for(int j=i; j<n; j++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print(x+" ");
            }
            System.out.println();
            x++;
        }
    }
}
