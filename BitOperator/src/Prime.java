public class Prime {
    static void main() {
        int end =20;
        for (int i = 2; i <end ; i++) {
            System.out.println(isPrime(i) ? i+" is prime" : i+" is Not Prime"  );

        }
    }

    static boolean isPrime(int n){
        if (n<=1){
            return false;
        }

        int c = 2;
        while (c*c<=n){
            if (n%c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}
