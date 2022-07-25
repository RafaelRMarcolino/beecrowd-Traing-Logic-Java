package beecrowd;

import java.util.Scanner;

public class PositivesandAverage1064 {

    /**Read 6 values that can be floating point numbers.
     *  After, print how many of them were positive. In the next line, print the average of all positive
     *  values typed, with one digit after the decimal point.
     Input
     The input consist in 6 numbers that can be integer or floating point values. At least one number will be
     positive.
     Output
     The first output value is the amount of positive numbers. The next line should show the average ofthe
     positive values ​typed.
     *
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n=0, soma = 0, p = 0, resul = 0;
        for(int i=1; i<6; i++){

            n = sc.nextDouble();
            if(n > 0){

                p++;
                System.out.println(p + "p ");
                soma += n;
            }else {
                System.out.println("numero negativo");
            }
        }
        resul = soma / 2;

        System.out.println(p + " valores positivos");
        System.out.println(String.format("%.1f", soma));
    }
}
