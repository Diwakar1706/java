package conditional;

import java.util.Scanner;

public class isTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 3 side of triangle: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a+b>c && b+c>a && a+c>b){
            System.out.println("valid triangle");

        }else System.out.println("invalid triangle");
    }
}
