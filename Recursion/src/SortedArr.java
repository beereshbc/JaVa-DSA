public class SortedArr {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 8, 7, 9};
        System.out.println(isSorted(arr, 0));

    }

    static boolean isSorted(int[] arr, int index){
            if (arr.length - 1 ==index) {
                return true;
                }
        if (arr[index] < arr[index+1]){
           return arr[index] < arr[index+1] && isSorted(arr, index+1 );
        }
        return false;
    }
}
