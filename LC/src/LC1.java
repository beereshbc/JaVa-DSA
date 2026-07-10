import java.util.ArrayList;
import java.util.Arrays;

public class LC1 {
    static void main() {
int[] arr = {2,7,11,15};
int target = 9;

        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    static int[] twoSum(int[] nums, int target){
        for (int i = 0; i <= nums.length-1 ; i++) {
            for (int j = i+1; j <=nums.length-1 ; j++) {
                if (nums[i]+nums[j] == target){
                    return new int[]{i, j};
                }

            }

        }
        return new int[]{};
    }

}
