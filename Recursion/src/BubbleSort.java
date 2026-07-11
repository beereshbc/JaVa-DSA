import java.util.Arrays;

public class BubbleSort {
    static void main(String[] args) {
        int[] arr = {4,3,2,1};
        bubble(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr, int s, int e){
        if (e ==0){
            return;
        }
        if (s<e){
            if (arr[s]>arr[s+1]){
                int temp = arr[s];
                arr[s]= arr[s+1];
                arr[s+1] = temp;
                bubble(arr, s+1, e);
            }

        } else {
            bubble(arr, 0, e-1);
        }
    }
}
