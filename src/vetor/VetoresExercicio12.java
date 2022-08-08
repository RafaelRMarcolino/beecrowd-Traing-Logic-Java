package vetor;

import java.util.Scanner;

public class VetoresExercicio12 {

    /**Criar um vetor A com 10 elementos inteiros, impementar um programa que define e escreva a soma de todos
     * os elementos armanezados neste valor
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int []vet = new int[10];
        int soma = 0;

        for (int i = 0; i<vet.length; i++){

            System.out.println("escrea um numero ");
            vet[i] = sc.nextInt();

            soma += vet[i];

        }

        for (int i = 0; i<vet.length; i++){

            System.out.println("A = " + vet[i]);
        }
        System.out.println("Valores soma  = " + soma);
    }
}
