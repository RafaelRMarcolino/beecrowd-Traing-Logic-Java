package beecrowd;

import java.util.Scanner;

public class SumofConsecutiveOddNumbersII {

    public static void main(String[] args) {

        /**Read an integer N that is the number of test cases. Each test case is a line containing
         * two integer numbers X and Y. Print the sum of all odd values between them, not
         * including X and Y.
         Input
         The first line of input is an integer N that is the number of test cases that follow.
         Each test case is a line containing two integer X and Y.
         Output
         Print the sum of all odd numbers between X and Y.
         *
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero de teste");
        int n = sc.nextInt();
        int x = 0,  y = 0, suma = 0;

        System.out.println("Digite dois numeros");
        x = sc.nextInt();
        y = sc.nextInt();

        if (y > x) {
            for (int m = x+1; m <= y; m++) {
                if (suma % 2 != 0) suma += m;
                }
            }
         else {
            for (int j = y+1; j <= x; j++) {

                if (suma % 2 != 0) suma += j;
            }
        }
        System.out.println(suma + " X ");
    }
}