package vetor;

import java.util.Scanner;

public class ArrayFillIV1179 {

    /* In this problem you need to read 15 numbers and must put them into two different arrays:
     par if the number is even or impar if this number is odd. But  the size of each of the
     two arrrays is only 5 positions. So every time you fill one of two arrays, you must print
     the entire array to be able to use it again for the next numbers that are read. At the end,
     all remaining numbers of each one of these two arrays must be printed beggining with the odd
     array. Each array can be filled how many times are necessary.

    Input
    The input contains 15 integer numbers.

    Output
    Print the output like the following example.

     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int par[] = new int[5];
        int odd[] = new int[5];

        int p = 0;
        int d = 0;

        boolean stop = false;
        while (!stop){
            System.out.println("Digite um numero (0 para )");
            int x = sc.nextInt();

            if(x == 0){
                stop = true;
                break;
            }

            if(x %2== 0){

                par[p] = x;
                System.out.println("par[" + p + "] = " + par[p]);
                p++;

                if(p > par.length - 1 ){
                    System.out.println();
                    for(int pars : par){
                        System.out.println("par[ ] = " + pars );
                    }
                    p = 0;
                }
            }

            if(x %2!= 0){

                odd[d] = x;
                System.out.println("odd[" + d + "] = " + odd[d]);
                d++;


                if(d > odd.length - 1 ){
                    System.out.println();
                    for(int odds : odd){
                        System.out.println("odd[ ] = " + odds );
                    }
                    d = 0;
                }
            }
        }
        System.out.println("Fim do programa");
    }
}
