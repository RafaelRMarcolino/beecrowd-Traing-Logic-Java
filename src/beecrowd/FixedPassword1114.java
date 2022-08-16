package beecrowd;

import java.util.Scanner;

public class FixedPassword1114 {

    public static void main(String[] args) {
        /**
         * Write a program that keep reading a password until it is valid.
         * For each wrong password read, write the message "Senha inválida".
         * When the password is typed correctly print the message "Acesso Permitido"
         * and finished the program. The correct password is the number 2002.
         *
         * Input
         * The input file contains several tests cases. Each test case contains only an integer number.
         *
         * Output
         * For each number read print a message corresponding to the description of the problem.
         */

        Scanner sc = new Scanner(System.in);
        String password = "2002";
        boolean pass = false;

        while (!pass){

          String  word = sc.nextLine();

            if(word.equals(password)){

                System.out.println("senha exata");
                pass = true;

            }else {

                System.out.println("acesse negado");
            }
        }
    }
}
