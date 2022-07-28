package beecrowd;

import java.util.Scanner;

public class EvenSquare1073 {
    /**
     *Read an integer N. Print the square of each one of the even values from 1 to N including N if it is
     *  the case.
     * Input
     * The input contains an integer N (5 < N < 2000).

     * Output
     * Print the square of each one of the even values from 1 to N, as the given example.
     * Be carefull! Some language automaticly print 1e+006 instead 1000000. Please configure your program
     * to print the correct format setting the output precision.
     **/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero ");
        int n = sc.nextInt();
        int p = 0;
        for (int i = 0; i < n; i++) {

            p = i;
            if (i % 2 == 0) {
                System.out.println("raiz quadrada " + Math.sqrt(p));
            }
        }

    }
}
