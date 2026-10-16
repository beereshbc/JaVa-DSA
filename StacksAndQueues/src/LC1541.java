import java.util.Stack;

public class LC1541 {

    public int minInsertions(String s) {
        int open = 0;
        int close = 0;
        int count = 0;


        for (char ch: s.toCharArray()){
            if (ch == '('){
                open++;
                count = count+2;
                if ( open >= 1 && close >= 2){
                    close = close -2;
                    open = open -1;
                    count = count -2;
                }
            } else {
                close++;
                if (open >= 1 && close >=2){
                    open = open -1;
                    close = close -2;
                    count = count -2;
                }
            }
        }
        return count-close;
    }
}
