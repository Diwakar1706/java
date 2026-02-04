package conditional;

import java.util.Scanner;

public class grateinNumberNestedifElse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 3 no.: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println(a+"greter");
            }else System.out.println(c+"greater");
        }else{
            if(b>c){
                System.out.println(b+"grater");
            }else System.out.println(c+"greter");
        }
    }
}
