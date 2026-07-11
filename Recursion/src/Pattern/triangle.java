package Pattern;

import java.util.Arrays;

public class triangle {

    static void main(String[] args) {

    }

    static void triPattern(int row, int col){
        if (row ==0){
            return;
        }
        if (row>col){
            System.out.print("* ");
            triPattern(row, col+1);
        } else {
            System.out.println();
            triPattern(row-1, 0);
        }
    }

    static void triangle2(int r, int c){
        if (r == c-1){
            return;
        }
        if (c < r){
            triangle2(r, c+1);
            System.out.print("*");

        } else {
            triangle2(r-1, 0);
            System.out.println();

        }
    }







}
