package loop;

import java.util.Locale;
import java.util.Scanner;

public class Lista {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int sum= 0;
        while (i != 0){

            sum = sum + i;
            i = sc.nextInt();
            System.out.println(sum + "soma");
        }

        System.out.println(sum);

    }
}


