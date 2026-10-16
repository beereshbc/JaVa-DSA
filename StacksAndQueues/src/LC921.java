import java.util.Stack;

public class LC921 {

    public int minAddToMakeValid(String s) {

        Stack<Character> stack = new Stack<>();
        int count = 0;

        for (char ch: s.toCharArray()){
            if (ch == '('){
                stack.push(ch);
            } else {
                if (!stack.isEmpty() && ch == ')'){
                    stack.pop();

                } else {
                    count = count + stack.size();
                }
            }
        }

        return count;

    }
}
