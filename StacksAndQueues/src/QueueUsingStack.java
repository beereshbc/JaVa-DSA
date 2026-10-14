import java.util.Stack;

public class QueueUsingStack {

    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStack(){
        first = new Stack<>();
        second = new Stack<>();
    }

    public void add(int item){
        first.push(item);
    }

    public int peek() throws Exception{
        if (!first.isEmpty()){
            second.push(first.pop());
        }

        int peeked = second.pop();
        while (!second.isEmpty()){
            first.push(peeked);
        }
        return peeked;
    }

    public int remove() throws Exception{
        if (!first.isEmpty()){
           second.push(first.pop());
        }

        int removed = second.pop();
        while (!second.isEmpty()){
            first.push(removed);
        }
        return removed;
    }

}
