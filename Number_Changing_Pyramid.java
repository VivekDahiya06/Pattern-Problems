import java.util.Scanner;
public class Number_Changing_Pyramid {
    public static void main(String[] args) {
        Scanner r= new Scanner(System.in);
        System.out.println("Enter the no. of times to run the loop : ");
        int n = r.nextInt();
        int x=1;
        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
        }
}}
