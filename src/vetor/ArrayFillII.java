package vetor;

import java.util.Scanner;

public class ArrayFillII {

    /**Write a program that reads a number T and fill a vector N[1000] with the numbers from 0 to T-1
     * repeated times, like as the example below.

     Input
     The input contains an integer number T (2 ≤ T ≤ 50).

     Output
     For each position of the array N, print "N[i] = x", where i is the array position
     and x is the number stored in that position.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Informe um numero ");
        int n = sc.nextInt();

        int x[] = new int[100];
        int cont = 0;
        while (cont < x.length){
            for (int i=0; i < n; i++){

                x[cont] = i;
                cont++;
            }

        }

        for (int i=0; i < x.length; i++){


            System.out.println("N[" +i + "]= "+ x[i]);
        }


    }
}
