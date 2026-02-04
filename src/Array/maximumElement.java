package Array;

import java.util.Scanner;

public class maximumElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("enter array: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();

        }
        int max=Integer.MIN_VALUE;
        for(int i=1; i<n; i++){
            if(arr[i]>max){
                max=arr[i];

            }
        }
        System.out.println(max);
    }
}
