package matriz;

import java.util.Scanner;

public class MatrizExcericio3 {

     /** Capture do teclado valores para preenchimento de uma matriz M 3X3. Apos a captura imprima a ,
      * atriz criada e encontre a quantidade de numeros pares, a quantidade de numeros impares
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] mat = new int[3][3];

        int n = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.println("mprima o valorda coluna ");
                mat[i][j] = sc.nextInt();

            }

        }

        int qtdPar = 0, qtdImpar = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(mat[i][j] %2==0){
                    qtdPar ++;
                }else{
                    qtdImpar ++;
                }
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {

                System.out.print(mat[i][j] + " ");
            }
            System.out.println( );
        }

        System.out.println("numeros de par " + qtdPar);
        System.out.println("numeros de par " + qtdImpar);
    }
}

