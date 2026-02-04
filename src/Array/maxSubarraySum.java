package Array;

import java.util.Scanner;

public class maxSubarraySum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no.");
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        int maxSum=0;
        for(int i=0; i<n; i++){
            int sum=0;
            for(int j=i; j<n; j++){
                sum+=arr[j];
                maxSum=Math.max(sum,maxSum);

            }
        }
        System.out.println(maxSum);
    }
}
