package sorting;

public class mergesort {
    public static void merge_sort(int[] arr) {

        int n=arr.length;
        if(n<=1) return;
        int[] a=new int[n/2];
        int[] b=new int[n-n/2];
        for(int i=0; i<n/2; i++){
            a[i]=arr[i];
        }
        for(int i=0;i<n-n/2; i++) {
            b[i] = arr[i + n / 2];
        }
        merge_sort(a);
        merge_sort(b);
        merge(a,b,arr);

    }
    static void merge(int[] a, int[] b, int[] arr){
        int i = 0, j = 0, k = 0;
        while(i < a.length && j < b.length){
            if(a[i] < b[j]){
                arr[k] = a[i];
                i++;
            } else {
                arr[k] = b[j];
                j++;
            }
            k++;
        }
        while(i < a.length){
            arr[k] = a[i];
            i++;
            k++;
        }
        while(j < b.length){
            arr[k] = b[j];
            j++;
            k++;
        }
    }
    public static void print(int[] arr) {
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={20,56,36,72,26,86,379,9};
        print(arr);
        System.out.println();
        merge_sort(arr);
        print(arr);
    }
}
