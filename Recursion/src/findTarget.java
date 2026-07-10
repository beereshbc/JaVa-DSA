public class findTarget {
    static void main(String[] args) {

        int[] arr = {13, 44, 65, 44,34};
        System.out.println(findTar(arr, 44));

    }
    static int index =0;
    static  int findTar(int[] arr, int target){
        if (arr.length -1 == index){
          return  index = -1;
        }
        if (arr[index] != target){
            index++;
            findTar(arr, target);
        }
        return index;
    }

}
