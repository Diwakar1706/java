package Array;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("enter array: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();

        }
        System.out.print(" enter target: ");
        int target=sc.nextInt();
        int found=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]==target){
                System.out.println("target is found at index "+i);
                found=1;
                break;
            }

        }
        if(found==0){
            System.out.println("target not found");
        }
    }
}
