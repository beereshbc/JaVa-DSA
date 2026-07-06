public class Fibonacci {

    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 7, 8, 9, 12, 14, 17, 35, 57, 78};
        int target = 2;
        System.out.println(BS(arr, target, 0, arr.length-1));
    }

    static int Febo(int n){
        if (n<2){
            return n;
        }

        return Febo(n-1)+Febo(n-2);
    }


    //Binary Search using Recursion

    static int BS(int[] arr, int target, int s, int e){
        if (s>e){
            return -1;
        }
        int m = s+(e-s)/2;
        if (target ==arr[m]){
            return m;
        }
        if (target<arr[m]){
          return   BS(arr, target, s, m-1);
        }

        return BS(arr, target, m+1, e);
    }


}
