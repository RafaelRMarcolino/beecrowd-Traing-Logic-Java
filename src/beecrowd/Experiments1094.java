package beecrowd;


import java.io.IOException;
import java.util.Scanner;

public class Experiments1094 {

    /**
     * Maria has just started as graduate student in a medical school and she's needing your help to
     * organize a laboratory experiment which she is responsible about. She wants to know, at the end
     * of the year, how many animals were used in this laboratory and the percentage of each type of
     * animal is used at all.
     * <p>
     * This laboratory uses in particular three types of animals: frogs, rats and rabbits. To obtain this
     * information, it knows exactly the number of experiments that were performed, the type and quantity
     * of each animal is used in each experiment.
     * <p>
     * Input
     * The first line of input contains an integer N indicating the number of test cases that follows.
     * Each test case contains an integer Amount (1 ≤ Amount ≤ 15) which represents the amount of animal
     * used and a character Type ('C', 'R' or 'S'), indicating the type of animal:
     * - C: Coelho (rabbit in portuguese)
     * - R: Rato (rat  in portuguese)
     * - S: Sapo (frog in portuguese)
     * <p>
     * Output
     * Print the total of animals used, the total of each type of animal and the percentual of each one in
     * relation of the total of animals used. The percentual must be printed with 2 digits after the decimal
     * point.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int qtd = 0, qtdR=1, qtdS=1, qtdC=1;

        System.out.println("Quantos teste deseja fazer ");
        int n = sc.nextInt();


        for (int i = 0; i <= n; i++) {

            System.out.println("Digite o animal ");

           String animal = sc.next().toUpperCase();

           char a = animal.charAt(0);
            int p = 0;
            switch (a) {

                case 'S':

                    qtdS += qtd;

                    break;

                case 'C':

                    qtdC += qtd;

                    break;

                case 'R':

                    qtdR += qtd;
                    break;

                default:
                    System.out.println("animal errado");
            }
        }
        System.out.println("valo de teste do coelho " + qtdC);
        System.out.println("valo de teste do rato " + qtdR);
        System.out.println("valo de teste do sapo " + qtdS);
    }}






