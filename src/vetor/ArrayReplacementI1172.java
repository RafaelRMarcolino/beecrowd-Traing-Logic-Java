package vetor;

import java.util.Scanner;

public class ArrayReplacementI1172 {

    public static void main(String[] args) {
        /**
         * Read an array X[10]. After, replace every null or negative number of X ​by 1.
         * Print all numbers stored in the array X.
         *
         * Input
         * The input contains 10 integer numbers. These numbers ​​can be positive or negative.
         *
         * Output
         * For each position of the array, print "X [i] = x", where i is the position of the
         * array and x is the number stored in that position.
         */

        Scanner sc = new Scanner(System.in);

        int[] x = new int[10];

        for(int i=0; i < x.length; i++){
            System.out.println();
            int n = sc.nextInt();
            if(n < 0){  
                n = 1;
            }
            x[i] = n;
        }

        for (int i=0; i < x.length; i++){
            System.out.println("x["+i+"]= "+ x[i]);
        }
    }
}
