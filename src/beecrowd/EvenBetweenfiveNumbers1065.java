package beecrowd;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class EvenBetweenfiveNumbers1065 {

    /**Make a program that reads five integer values. Count how many of these values
     *  ​​are even and  print this information like the following example.
     Input
     The input will be 5 integer values.
     Output
     Print a message like the following example with all letters in lowercase, indicating how many even
     numbers were typed.
     **/


    //PSVM

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = 0, p = 0, n = 0;
        for(int i=0; i< 5; i++){

            System.out.println("digite um numero ");
            n = sc.nextInt();
            if(n %2 == 0){

                p ++;
            }
        }
        System.out.println(p + " Valore pares");
    }
}
