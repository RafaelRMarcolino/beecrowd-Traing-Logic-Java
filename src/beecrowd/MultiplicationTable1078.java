package beecrowd;

import java.util.Scanner;

public class MultiplicationTable1078 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero que gostaria de ver na tabuada ");
        int n = sc.nextInt();

        int mult = 0;
        for(int i=1; i<= 10; i++){

            mult = n * i;
            System.out.println(n + " x "+ i + " = " + mult );
        }
    }
}
