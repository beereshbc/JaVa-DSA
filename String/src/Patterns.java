public class Patterns {
    public static void main(String[] args) {
    pattern8(5);
    }

    static void  pattern1(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void  pattern2(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = n; col >=row; col--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=n ; col++) {

                System.out.print("* ");
            }
            System.out.println();

        }
    }

    static void pattern4(int n){
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(col+" ");

            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        int i = 0;
        for (int row = 1; row <=n*2 ; row++) {
            if (row > n){

                i++;
                for (int col = n-i; col >=1 ; col--) {
                    System.out.print("*");

                }

            } else {
                for (int col = 1; col <=row ; col++) {
                    System.out.print("*");
                }
            }
            System.out.println();

        }
    }



    static void pattern6(int n){
        int i=0;
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=n; col++) {
                if (col >= n-i){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            i++;
            System.out.println();
        }

    }

    static void pattern7(int n){
        int i = 1;
        int j = n-1;
        for (int row = 1; row <=2*n-1 ; row++) {
            for (int col = 1; col <=n ; col++) {
                if (row <= n){
                    if (col <= n-i){
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }

                } else {

                    if (col <= n-j){
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                    j--;
                }

            }

            i++;
            System.out.println();

        }
    }

    static void pattern8(int n){
        int originalN = n;
        n = 2*n;

        for (int row = 1; row <n; row++) {
            for (int col = 1; col <n ; col++) {
                int IndVal = originalN -Math.min(Math.min(row,col), Math.min(n -row, n-col))+1;

                        System.out.print(IndVal+ " ");



            }
            System.out.println();

        }

    }



}
