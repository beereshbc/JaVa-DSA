import java.util.HashSet;

public class NC217 {

   public static void main(String[] args) {
        int[] arr = {1,2,3,4};
       System.out.println(containsDuplicate(arr));
    }
    static boolean containsDuplicate(int[] nums) {
       HashSet <Integer> seenNumber = new HashSet<>();

       for(int num : nums){
           if (seenNumber.contains(num)){
               return true;
           }
           seenNumber.add(num);
       }
       return false;

    }

}
