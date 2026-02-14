public class OrderOgnosticBS {

    public static void main(String[] args) {
        int[] arr = {16, 9, 6, 4, 1, 0, -2, -5, -23, -27, -34, -45, -66};
        int target = 1;
        int ans = OrderOgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int OrderOgnosticBS(int[] arr, int target){
       int start = 0;
       int end = arr.length-1;

       boolean isAsc = arr[start]<arr[end];
    while(start <=end){
    int mid = start + (end -start)/2;
    if (arr[mid] == target){
        return mid;
    }

    if (isAsc){
        if (target > arr[mid]){
            start = mid+1;
        } else {
            end = mid-1;
        }
    } else {
        if(target > arr[mid]){
            end = mid -1;
        } else {
            start = mid+1;
        }
    }
}
        return  -1;
    }

}
