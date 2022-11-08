package vetor;

import java.util.Random;
import java.util.Scanner;

public class ArrayFillIV1179_2 {

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
        Random random = new Random();

        int par[] = new int[5];
        int odd[] = new int[5];
        int resto[] = new int[5];
        int total[] = new int[15];

        int p = 0;
        int d = 0;
        int r = 0;

            for (int i = 0; i < total.length; i++) {

                total[i] = random.nextInt(99);
            }

            for (int i = 0; i < total.length; i++) {

                try {
                    if (p < total.length) {

                        if (total[i] % 2 == 0) {


                            par[p] = total[i];
                            System.out.println(par[p] + " par[]");
                            p++;
                        }
                    } else {

                        resto[r] = total[i];
                        System.out.println(resto[r] + " resto[]");
                        r++;

                    }


                } catch (ArrayIndexOutOfBoundsException exception) {

                    System.out.println("nao pode ser acessado");

                }


                try {
                    if (d < total.length) {

                        if (total[i] % 2 != 0) {

                            odd[d] = total[i];
                            System.out.println(odd[d] + " odd[]");
                            d++;
                        } else {

                            resto[r] = total[i];
                            System.out.println(resto[r] + " resto[]");
                            r++;
                        }
                    }
                } catch (ArrayIndexOutOfBoundsException exception) {

                    System.out.println("nao pode ser acessado");
                }
            }

        System.out.println(" Par");
            for (int x: par ){
                System.out.print(" par[] " + x);
            }

        System.out.println(" Impar");
            for (int y: odd ){
                System.out.print(" odd[] " + y);
            }

        System.out.println(" resto");
            for (int z: resto ){
                System.out.print(" resto[] " + z);
            }
    }}
