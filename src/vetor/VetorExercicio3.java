package vetor;

import java.util.Scanner;

public class VetorExercicio3 {
    /**
     *
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int []A = new int[15];
        int []B = new int[A.length];

        for(int i=0; i<A.length; i++){

            System.out.println("Digite um valor" + i);
            A[i] = sc.nextInt();

            B[i] = A[i] * A[i];
        }

        for(int i=0; i<A.length; i++){
                System.out.print(" A " + A[i]);
                System.out.print(" B " + B[i]);
            }
            System.out.println();
        }
}
