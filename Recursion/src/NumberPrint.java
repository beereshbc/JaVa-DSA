public class NumberPrint {
   public static void main(String[] args) {
print1toN(5);
    }

    static void print(int n){
     if(n==0){
         return;
     }
        System.out.println(n);
     print(n-1);
    }

    static void print1toN(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
     print1toN(n-1);
        System.out.println(n);


}



}

