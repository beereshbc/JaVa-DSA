public class FindMin {

    public static void main(String[] args) {
        int[] arr = {2, 13, -14, 6, 35, 12 -4, 56, 36};
        System.out.println(min(arr));

    }

    static int min(int[] arr){
        int min = arr[0];
        for (int i=1; i<arr.length; i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

}
