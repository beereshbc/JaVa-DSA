public class CountO {
    static void main(String[] args) {
        System.out.println(CountofO(0, 0));
    }

   public static int CountofO(int n, int i){

        if (n==0){
           return i;
       }

        if (n%10 == 0){
        return     CountofO(n/10, i+1);
        }
      return   CountofO(n/10, i);

    }

}
