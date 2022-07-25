package vetor;

import java.text.ParseException;
import java.util.Scanner;

public class VetorExercicios2 {
    public static void main(String[] args) throws ParseException {

        //Exercicio 2 Criar um vetor A e B com 8 elementos sendo que o B e multiplicado o  A por 2

        Scanner sc = new Scanner(System.in);
        int [] A = new int[8];
        int [] B = new int[A.length];

        for(int i=0; i<A.length; i++){
            A[i] = sc.nextInt();

            B[i] = A[i] * 2;
        }

        System.out.println("Vetor A ");
        for(int i=0; i<A.length; i++){
            System.out.print(A[i]+ " ");

        }

        for(int i=0; i<B.length; i++){
            System.out.print(B[i]+ " ");
        }
    }
}
