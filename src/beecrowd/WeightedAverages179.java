package beecrowd;

import java.lang.reflect.Array;
import java.util.Locale;
import java.util.Scanner;

public class WeightedAverages179  {

    /**Read an integer N, which represents the number of following test cases.
     *  Each test case consists of three floating-point numbers, each one with one digit
     *  after the decimal point. Print the weighted average for each of these sets of three numbers,
     *  considering that the first number has weight 2, the second number has weight 3 and the third
     *  number has weight 5.

     Input
     The input file contains an integer number N in the first line. Each N following line is a test
     case with three float-point numbers, each one with one digit after the decimal point.

     Output
     For each test case, print the weighted average according with below example.
     *
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas vezes quer fazer o teste minomo 3 ");
        int n =  sc.nextInt();

        double[][] mat = new double[n][3];


        double media = 0, media1 = 0, media2 = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++){

                System.out.println("digite");
            mat[i][j] = sc.nextDouble();

            }
        }

        for(int i=0; i<mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {

                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        media = (mat[0][0] + mat[0][1] + mat[0][2]) / 2;
        media1 = (mat[1][0] + mat[1][1] + mat[1][2]) / 2;
        media2 = (mat[2][0] + mat[2][1] + mat[2][2]) / 2;


        System.out.println( " media 1 " +media +   " \n media 2 " + media1 + " \n media3 " + media2 );

    }

}
