import java.util.Scanner;
public class Left_Half_Pyramid {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.print("Enter the no. of times to run the loop : ");
        int n = r.nextInt();
        for(int i=0; i<n; i++){
            for(int j=n-1; j>i; j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
