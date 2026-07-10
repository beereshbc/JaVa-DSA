import java.util.ArrayList;

public class findTargetInArr {
    static void main(String[] args) {
            int[] arr = {13, 44, 65, 44,34};
            findTar(arr, 44);
            System.out.println(list);
        }
        static int index =0;
        static ArrayList<Integer> list = new ArrayList<>();
        static  void findTar(int[] arr, int target){
            if ( index==arr.length -1 ){
                return;
            }
            if (arr[index] == target){
                list.add(index);
                index++;
                findTar(arr, target);
            } else {
                index++;
                findTar(arr, target);
            }

        }

    }



