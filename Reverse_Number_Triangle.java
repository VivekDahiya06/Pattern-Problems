import java.util.Scanner;
public class Reverse_Number_Triangle {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.print("Enter the no. of times to run the loop : ");
        int n = r.nextInt();
        int x=1;
        for(int i=0; i<n; i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=x;j<=n;j++){
                System.out.print(j+" ");
            }
            x++;
            System.out.println();
        }
    }
}
