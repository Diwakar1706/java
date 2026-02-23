package recursion;

public class basic {
    public static void main(String[] args) {
        System.out.println(nsum1(3));

    }

    //tail recursion(better)
    static void fn(int i, int n){
        if(i>n){
            return;
        }
        System.out.println(i);

        fn(i+1,n);

    }

    //head recursion (backtrack)
    static void fn1(int i, int n){
        if(i>n){
            return;
        }

        fn1(i+1,n);
        System.out.println(i);
    }


    //parameterised
    //sum of n by rec
    static void nsum(int n,int sum){
        if(n<1){
            System.out.println(sum);
            return;
        }
        nsum(n-1,sum+n);
    }

    //functional
    //sum of n by rec
    static int nsum1(int n ){
        if(n==0){
            return 0;
        }
        return n+nsum1(n-1);
    }


}
