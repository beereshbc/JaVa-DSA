import java.util.Arrays;

public class GameOfTwoStacks {



    private static int twoStacks(int x, int[] a, int[] b, int sum, int count){

        if (sum>x){
            return count-1;
        }

        if (a.length == 0 || b.length == 0){
            return  count-1;
        }

        int ans1 = twoStacks(x, Arrays.copyOfRange(a, 1, a.length), b, a[0] + sum, count+1 );
        int ans2 = twoStacks(x, a, Arrays.copyOfRange(b, 1, b.length), b[0] + sum, count+1 );

        return Math.max(ans1, ans2);


    }

}
