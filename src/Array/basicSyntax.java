package Array;

import java.util.Scanner;

public class basicSyntax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("enter elements :");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();

        }
        System.out.println("output is :");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
