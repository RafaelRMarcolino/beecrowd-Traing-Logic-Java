package vetor;

import java.util.Scanner;

public class VetoresExercicio11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int []vet = new int[10];
        int p = 0;

        for (int i = 0; i<vet.length; i++){

            System.out.println("escrea um numero ");
            vet[i] = sc.nextInt();

            if(vet[i] %2==0){
                p++;
            }
        }

        for (int i = 0; i<vet.length; i++){

            System.out.println("A = " + vet[i]);
        }

        System.out.println("Valores pares  = " + p);

    }
}


