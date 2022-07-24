package beecrowd;

import java.util.Scanner;

public class EvenNumbers159 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 100000;
        int j = 0;
        int soma = 0;
        int resultado = 0;
        while (n != 0) {

            System.out.println("escreva um numero ");
            n = sc.nextInt();


            if (n < 0) {
                j++;

                System.out.println("numeronegativo");

            } else {
                System.out.println("numero positivo ");
            }
            soma = j + soma;

        }
         resultado = soma;
    }
}

