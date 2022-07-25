package matriz;

import java.util.Random;
import java.util.Scanner;

public class MatrizExercicio2 {

    /**Gere e imprima uma matriz M 4x4 com valores aleatorios entre 0 - 100. Apos isso determine
     * o maior e o menor numero da valor da linha 5 e qual e o menor valor da linha 5 e qual e o maior
     * e menor valor da coluna 7.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] mat = new int[10][10];

        Random random = new Random();

        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat.length; j++){

                mat[i][j] = random.nextInt(100);
            }
        }


        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){

                System.out.print(mat[i][j] + " ");
            }
            System.out.println( );
        }

        int maiorL5 = 0;
        int menorL5 = 105;
        int lina5 = 0;
        for(int i=0; i<mat[lina5].length; i++){
            if(mat[lina5][i] >lina5){
                maiorL5 = mat[lina5][i];
            }
            if(mat[lina5][i] <menorL5){
                menorL5 = mat[lina5][i];
            }
        }

        System.out.println("Maior valor da linha 5 = " + maiorL5);
        System.out.println("Menor valor da linha 5 = " + menorL5);

        int maiorc7 = 0;
        int menor7 = 105;
        int col7 = 7;
        for(int i=0; i<mat.length; i++){
            if(mat[i][col7] > maiorc7){
                maiorc7 = mat[i][col7];
            }
            if(mat[i][col7] <menor7){
                maiorc7 = mat[i][col7];
            }
        }
        System.out.println("Maior valor da coluna 7 = " + maiorc7);
        System.out.println("Menor valor da coluna 7 = " + menor7);

    }

}
