package beecrowd;

import java.util.Scanner;

public class AscendingandDescending1113 {

    public static void main(String[] args) {

        /**Read an undetermined number of pairs of integer values. Write a
         *  message for each pair indicating if this two numbers are in ascending
         *  or descending order.

         Input
         The input file contains several test cases. Each test case contains two integer
         numbers X and Y. The input will finished when X = Y.

         Output
         For each test case print “Crescente”, if the values X and Y are in ascending order,
         otherwise print “Decrescente”.
         */


        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas vezes deseja fazer o teste");
        boolean n = false;

        while (!n){

            System.out.println("Escreva dois numeros");
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(x == y){
                System.out.println("Fm do Prgrama");
                n = true;
            }else if(x > y){

                System.out.println("decrescente");
            }else {

                System.out.println("crescente");
            }
        }
    }
}
