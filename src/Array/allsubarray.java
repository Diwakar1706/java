package Array;

import java.util.Scanner;

public class allsubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int x = 3;
        System.out.print("enter the size of array: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("enter elements ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxLength=0;

        for (int i = 0; i < n; i++) {
            int sum=0;
            for (int j = i; j < n; j++) {
                    sum += arr[j];
                    if (sum == x) {
                        int length = j - i + 1;
                        maxLength = Math.max(maxLength, length);

                    }



            }
        }
        System.out.println(maxLength);



    }
}
