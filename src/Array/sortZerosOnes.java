package Array;

public class sortZerosOnes {
    public static void main(String[] args) {
        int[] arr={0,0,0,0,0,1,2,1,0,1,0,2,1,1};
        int n=arr.length;
        int countZeros=0;;
        int countOnes=0;
        int countTwos=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                countZeros++;
            }else if (arr[i]==1) {
                countOnes++;
            }else{
                countTwos++;
            }
        }
        for (int i = 0; i < countZeros; i++) {
            arr[i]=0;
        }
        for (int i = countZeros; i < n-countTwos; i++) {
            arr[i]=1;
        }
        for (int i = countZeros+countOnes; i < n; i++) {
            arr[i] = 2;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }

    }
}
