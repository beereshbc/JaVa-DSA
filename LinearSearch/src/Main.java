import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String name = "Beereshkumar";
        char tar = 'S';
        boolean res = stringSearch(name,tar, 1, 8);
        System.out.println(res);

    }

    static boolean Search2(String str, char target){
        if (str.length() == 0){
            return false;
        }
        for (char ch : str.toCharArray()){
            if (ch == target){
                return true;
            }
        }
        return false;
    }

    static boolean stringSearch(String str, char target, int start, int end){
        if (str.length() == 0){
            return false ;
        }
        for (int i =start; i<end; i++){
            if (target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }




    static int linearSearch(int[] arr, int target){
        if (arr.length == 0) {
            return -1;
        }

        for ( int i =0; i<arr.length; i++){
            int current = arr[i];
            if (current == target){
                return current;
            }
        }
        return Integer.MAX_VALUE;
    }

}