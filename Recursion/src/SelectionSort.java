import java.util.Arrays;

public class SelectionSort {
    static void main(String[] args) {
 int[] arr = {4,3,2,1};
        selectionSort(arr, 0, arr.length, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr, int s, int e, int max) {
    if (e==0){
        return;
    }
    if (s<e){
        if (arr[s]>arr[max]){
            selectionSort(arr, s+1, e, s);
        } else {
            selectionSort(arr, s+1, e, max);
        }
    } else {
        int temp = arr[max];
        arr[max] = arr[e-1];
        arr[e-1] = temp;
        selectionSort(arr, 0, e-1,0);
    }

    }
}
