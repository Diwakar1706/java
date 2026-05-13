package sorting;
import java.util.Scanner;
public class bubblesort {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        bubble(arr,n);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
    static int[] bubble(int[] arr,int n){
        boolean swapped;
        for(int i=0;i<n-1; i++){
            swapped=false;// no of passes
            for(int j=0; j<n-1-i; j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    swapped=true;
                }
            }
            if(!swapped) break;

        }
        return arr;
    }
    static void swap(int[] arr ,int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
