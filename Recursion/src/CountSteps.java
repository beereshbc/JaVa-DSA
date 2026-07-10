public class CountSteps {

  //1342. Number of Steps to Reduce a Number to Zero

    static void main(String[] args) {

        System.out.println(numberOfSteps(8));
    }

    static int numberOfSteps(int num){
        if (num  == 0){
            return 0;
        }
        if (num%2 == 0){
          return 1 +  numberOfSteps(num/2);
        } else {
            return 1 +  numberOfSteps(num-1);
        }
    }
}
