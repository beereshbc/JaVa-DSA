public class factorial {
  public static void main(String[] args) {
      System.out.println(fact(5));
    }
    static int fact(int n){
       if (n==1){
           return n;
       }
       int res = n;
      res = res*fact(n-1);
      return  res;

    };
}
