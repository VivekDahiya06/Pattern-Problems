import java.util.Scanner;
public class Zero_One_Triangle {
    public static void main(String[] args) {
        Scanner r= new Scanner(System.in);
        System.out.print("Enter the no. of times to run the loop : ");
        int n = r.nextInt();
        // 1 is printed whenever both i & j are even or both i & j are odd
        // 0 is printed for all the remaining places
        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                if((i%2==0&&j%2==0)||(!(i%2==0)&&!(j%2==0))){
                    System.out.print(1+" ");
                }
                else {
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
}
