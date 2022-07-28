package beecrowd;

import java.util.Scanner;

public class Interval2_1072 {

    /** Read an integer N. This N will be the number of integer numbers X that will be read.
     Print how many these numbers X are in the interval [10,20] and how many values are out of this interval.
     Input
     The first line of input is an integer N (N < 10000), that indicates the total number of test cases.
     Each case is an integer number X (-107 < X < 107).
     */

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

       System.out.println("Quantos numeros ");
    int n = sc.nextInt();

    int []var = new int[n];

    int in = 0, out = 0;
        for(int i=0; i < var.length; i++){
        System.out.println("digite um valor");
        var[i] = sc.nextInt();
        if(var[i] >= 10 && var[i] <= 20){
            in ++;
        }else{
            out ++;
        }
    }
        for(int i=10; i < var.length; i++){

        System.out.print(var[i] + " ");
    }

        System.out.println("entrada " + in);
        System.out.println("saida " + out);
}
}
