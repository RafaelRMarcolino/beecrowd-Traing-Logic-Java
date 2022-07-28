package beecrowd;

import java.util.Scanner;

public class Remaining2_1075 {
    /**
     * Read an integer N. Print all numbers between 1 and 10000, which divided by N will give the rest = 2.
     * Input
     * The input is an integer N (N < 10000)
     * Output
     * Print all numbers between 1 and 10000, which divided by n will give the rest = 2, one per line.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numer de testes ");
        int N = sc.nextInt();

        for(int i = 0; i<= N; i++){

            if(i %2==0){
                System.out.println("numero " + i + " e dividido por 2");
            }

        }


    }
}
