import java.util.Arrays;

public class SearchIn2D {

    public static void main(String[] args) {
        int arr[][] = {
                {12, 1, -45, 24},
                {34, -23, 22, 3, 5},
                {11, 2, 14, 1, -1, 0},
                {5, 77}
        };

        int target = 77 ;
        int[] res = find2D(arr, target);
        System.out.println(Arrays.toString(res));
        System.out.println(Max(arr));

    }


    static int[] find2D(int[][] arr, int target){

        for (int row=0; row< arr.length; row++){
            for (int col=0; col<arr[row].length; col++){
                if (arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }

        return new int[]{-1, -1     };
    };

    static int Max(int[][] arr){
        int max =Integer.MIN_VALUE;

        for (int row=0; row< arr.length; row++){
            for (int col=0; col<arr[row].length; col++){
                if (arr[row][col] > max){
                    max = arr[row][col];

                }
            }
        }

        return  max;
    };


}

