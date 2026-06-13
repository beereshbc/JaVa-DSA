public class LC41 {

    public int firstMissingPositive(int[] nums) {

            int i = 0;
            while(i<nums.length){
                int correct = nums[i]-1;
                if(nums[i] > 0 && nums[i]<=nums.length && nums[i] != nums[correct]){
                    swap(nums, i, correct);
                } else {
                    i++;
                }

            }

            for(int index=0; index < nums.length; index++){
                if(nums[index] != index){
                    return index;
                }

            }
            return nums.length +1;
        };

        static void swap(int[] nums, int first, int second){
            int temp = nums[first];
            nums[first] = nums[second];
            nums[second] = temp;
        };
    }


