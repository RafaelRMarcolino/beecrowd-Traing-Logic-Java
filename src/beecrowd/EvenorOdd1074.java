package beecrowd;

import java.util.Scanner;

public class EvenorOdd1074 {
    /**Read an integer value N. After, read these N values and print a message for each value saying if this
     *  value is odd, even, positive or negative. In case of zero (0), although the correct description would
     *  be "EVEN NULL", because by definition zero is even, your program must print only "NULL", without quotes.
     Input
     The first line of input is an integer N (N < 10000), that indicates the total number of test cases.
     Each case is a integer number X (-107 < X <107)..
     Output
     For each test case, print a corresponding message, according to the below example. All messages must be
     printed in uppercase letters and always will have one space between two words in the same line.
     *
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas vezes quer fazer o teste ");
        int n = sc.nextInt();

        int p = 0, m = 0;
        for(int i =1; i<= n; i++){

            System.out.println("Digite um numero ");
            int x = sc.nextInt();
            if(x == 0){
                System.out.println("Numero nulo");
            }
            if(x %2==0 && x >= 0){


                System.out.println("Numero par positivo");
            }
            if(x %2== 0 && x < 0){


                System.out.println("Numero par negativo " );

            }if(x %2!=0 && x > 0){


                System.out.println("Numero impar positivo" );
            }
            if(x %2!=0 && x < 0){

                System.out.println("Numero impar negativo" );
            }
        }
        System.out.println("fim");
    }


}
