package vetor;

import java.util.Scanner;

public class VetorExercicio1 {
    public static void main(String[] args) {

        /**Criar um vetor A com 5 elementos inteiros.Construir um vetor B de mesmo tipo e tamanho ecom os
         * "mesmos" elementos do vetor A, ou seja, B[i] = A[i]
         */

        Scanner sc = new Scanner(System.in);

        int [] A = new int[5];
        int [] B = new int[A.length];

        for(int i=0; i<A.length; i++){
            System.out.println("Entre com o vetor da posição " + i);
            A[i] = sc.nextInt();

            B[i] = A[i];
        }

      /**  for(int i=0; i<B.length; i++){
            System.out.println("Entre com o vetor da posição " + i);
            B[i] = A[i];
        } **/

        System.out.println("Vetor A = ");
        for(int i=0; i<A.length; i++){
            System.out.println(A[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor B = ");
        for(int i=0; i<B.length; i++){
            System.out.println(B[i] + " ");
        }
        System.out.println();

    }
}
