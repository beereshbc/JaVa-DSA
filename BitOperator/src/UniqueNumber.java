public class UniqueNumber {

    static void main() {
        int[] arr = {2, 4, 3, 4, 3, 2, 6};
        System.out.println(Unique(arr));
    }

    static int Unique(int[] arr){
        int unique = 0;
        for (int n:arr){
            unique ^=n;
        }
            return unique;
    }

}
