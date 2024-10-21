import java.util.Scanner;
public class Number_Increasing_Pyramid {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the no. of times to run the loop : ");
        int n = r.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
}
