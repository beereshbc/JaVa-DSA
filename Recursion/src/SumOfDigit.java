public class SumOfDigit {
    static void main(String[] args) {
        System.out.println(SoD(1));

    }
    static int SoD(int n){
        if (n<=0){
            return 0;
        }
        return SoD(n/10) + n%10;
    }
}
