class Solution {

    public static void main(String[] args) {
     int[]   nums = {12,345,2,6,7896,123234};
        System.out.println(findNumbers(nums));
        System.out.println(-22%2);
    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num:nums){
            if (even(num)){
                count ++;

            }
        }
        return count;
    }

    static boolean even(int num){
        int curDigit = digit(num);
        if (curDigit % 2 == 0){
            return true;
        }
        return false;
    }

    static int digit(int num){
        if (num<0){
            num = num*-1;
        }
        return (int)(Math.log10(num)+1);
    }

}