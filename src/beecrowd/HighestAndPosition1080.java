package beecrowd;

import java.util.Random;

public class HighestAndPosition1080 {

    /**
     *Read 100 integer numbers. Print the highest read value and the input position.
     * Input
     * The input file contains 100 distinct positive integer numbers.
     * Output
     * Print the highest number read and the input position of this value, according to the given example.
     */


    public static void main(String[] args) {

        Random random = new Random();

        int [][]mat = new int[50][50];


        for(int i=0; i<mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {

                mat[i][j] = random.nextInt(1000);
            }
        }

        int maior = 0, n = 0;
        for(int i=0; i<mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {

                System.out.print(mat[i][j] + " ");

                if(mat[i][j] > maior){
                    maior = mat[i][j];

                }
            }
            System.out.println();
        }
        System.out.println("maior " + maior);
    }
}
