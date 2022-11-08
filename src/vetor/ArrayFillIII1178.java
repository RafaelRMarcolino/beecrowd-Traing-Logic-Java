package vetor;

import java.util.Scanner;

public class ArrayFillIII1178 {

    public static void main(String[] args) {
        /* Read a number X. Put this X at the first position of an array N [100]. In each subsequent
        position (1 up to 99) put half of the number inserted at the previous position, according to
         the example below. Print all the vector N.

        Input
        The input contains a double precision number with four decimal places.

        Output
        For each position of the array N print "N[i] = Y", where i is the array position and Y is the
        number stored in that position. Each number of N[...] must be printed with 4 digits after the
        decimal point.
         */
        Scanner sc  =  new Scanner(System.in);

        System.out.println("Digite um numero ");
        double j = sc.nextDouble();

        double N[] = new double[100];
        N[0] = j;
        int i =0;
        double div = 0;

        boolean stop =  false;
        while ( i < 99 ){

            N[i] = j;
            div = j / 2;
            System.out.println("Div " + j);
            j = div;
            i++;
        }

        System.out.println();
        for (int l = 0; l < 99; l++){
            System.out.printf(String.format("N[" + l + "] = %.4f \n" ,  N[l]) );
        }
    }
}
