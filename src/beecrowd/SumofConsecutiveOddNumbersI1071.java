package beecrowd;

import java.util.Scanner;

public class SumofConsecutiveOddNumbersI1071 {

    /**
     * Leia dois valores inteiros X e Y. Imprima a soma de todos os valores ímpares entre eles.
     *
     * Entrada
     * O arquivo de entrada contém dois valores inteiros.
     * Resultado
     * O programa deve imprimir um número inteiro. Esse número é a soma de todos os valores ímpares
     * entre os dois valores de entrada que devem caber em um número inteiro.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i = -1;
        int somaImparX = 0, somaImparY = 0, soma = 0, x = 0, y = 0;
        while (i != 0) {
            System.out.println( "/////////////////////////////////////s");
            System.out.println("deseja contina {s} se nao aperte {n}");
            i = sc.nextInt();

            System.out.println("Digite um valor X ");
            x = sc.nextInt();

            System.out.println("Digite um valor Y ");
            y = sc.nextInt();

            if (x % 2 == 1) {
                somaImparX += x;
            }
            if (y % 2 == 1) {

                somaImparY += y;
            }
            soma = somaImparX + somaImparY;
        }
        System.out.println("soma dos numeros impar " + soma);

    }
}

