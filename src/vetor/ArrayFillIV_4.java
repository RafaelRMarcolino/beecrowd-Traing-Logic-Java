package vetor;

import java.util.Scanner;

public class ArrayFillIV_4 {

    public static void main(String[] args) {

        /*In this problem you need to read 15 numbers and must put them into two different arrays: par
        if the number is even or impar if this number is odd. But  the size of each of the two arrrays
        is only 5 positions. So every time you fill one of two arrays, you must print the entire array
        to be able to use it again for the next numbers that are read. At the end, all remaining numbers
        of each one of these two arrays must be printed beggining with the odd array. Each array can be
        filled how many times are necessary.

        Input
        The input contains 15 integer numbers.

        Output
        Print the output like the following example.
         *
         */

        Scanner sc = new Scanner(System.in);

        int par[] = new int[5];
        int tamanho = 16;

        int odd[] = new int[tamanho];


        boolean stop = false;
        int i=0, x = 0, p=0, d=0  ;
        while (!stop){

            for (int j=0; j<15; j++){
                System.out.println("Digite 15 valores " + (j + 1));
                x = sc.nextInt();

                tamanho--;


                if(p < par.length){

                    if(x %2==0){

                        par[p] = x;
                        p++;
                    }
                    else if(x %2!=0){

                        odd[d] = x;
                        d++;
                    }

                }else if(tamanho > 0 ){

                    odd[d] = x;
                    d++;
                }else {

                    stop = true;
                    break;
                }
            }
        }
        for (int pars : par){
            System.out.println("par " + pars);
        }

        int menor = 0;
        for (int f=0; i<odd.length; f++){

            if (menor != odd[f] ) {
                System.out.println("odd " + odd[f]);

            }else {
                break;
            }
        }
    }

}
