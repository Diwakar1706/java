package Array;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,9,8};
        for (int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        for(int i=0; i<arr.length/2; i++){
            int j=arr.length-1-i;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;



        }
        for (int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
