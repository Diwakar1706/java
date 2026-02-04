package loops;
import java.util.Scanner;
public class whileloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no.");
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            System.out.println(i);
            i++;

        }
    }
}
