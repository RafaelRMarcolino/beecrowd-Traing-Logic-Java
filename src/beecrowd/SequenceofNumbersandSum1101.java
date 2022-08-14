package beecrowd;

import java.util.Scanner;

public class SequenceofNumbersandSum1101 {

    public static void main(String[] args) {

        /**
         * Read an undetermined number of pairs values M and N (stop when any of these values is less
         * or equal to zero). For each pair, print the sequence from the smallest to the biggest (including both)
         * and the sum of consecutive integers between them (including both).
         *
         * Input
         * The input file contains pairs of integer values M and N. The last line of the file contains a number
         * zero or negative, or both.
         *
         * Output
         * For each pair of numbers, print the sequence from the smallest to the biggest and the sum of these
         * values, as shown below.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("escreva dois numerose");

        int x = sc.nextInt();
        int y = sc.nextInt();

        int diminuir = 0;

        while (x > 0 && y > 0){

            if(x > y) {

                diminuir = x;
                System.out.println(diminuir + "diminuir");
                x = y;
                System.out.println(x + "x");
                y = diminuir;
                System.out.println("y " + y);

                System.out.println("diminuir " + diminuir + " x " + x + " y " + y);

            } // if

            for (int i=0; i< x; i++){
                System.out.println(i + " ");
                diminuir += i;
            } //for

            System.out.println("sum = " + diminuir);

            x = sc.nextInt();
            y = sc.nextInt();

        }
    }

}
