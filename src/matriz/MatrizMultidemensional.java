package matriz;

import java.util.Scanner;

public class MatrizMultidemensional {
    public static void main(String[] args) {

        /** Escreva um programa para guardar dados de uma pesquisa feita de uma pesquisa feita com uma amostra
         * de pessoas da avenida mais movimentada da cidade onde voce mora.
         * A pesquisa consiste em pergubtar ao cidadao a quantidade e o nome de cada filho. Guade essas informações
         * em uma matrizde de forma que cada pessoa entrevistada oculpe somente o espaço necessario na memoria para
         * guardar os nome dos filhos.
         *Imprima a quantidade de pessoas entrevistadas a quantidade de pessoas entrevitadas e os seus respectivos nome
         * dos filhos
         * */


        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o numero de pessoas que serao entrevistados ");
        int numEntrevistado = sc.nextInt();

        String[][] nomesFilhos = new String[numEntrevistado][];

        for(int i=0; i<nomesFilhos.length; i++){
            System.out.println("Entre com a quantidade de filhos ");
            int qtdFihos = sc.nextInt();

            nomesFilhos[i] = new String[qtdFihos];

            for(int j=0; j<nomesFilhos[i].length;  j++){

                System.out.println("Digite o nome do filho " + (j + 1));

                nomesFilhos[i][j] = sc.next();
            }
        }


        for(int i=0; i<nomesFilhos[i].length;  i++){
            System.out.println("Pessoa " + i + "tem " + nomesFilhos[i].length + "filhos ");
            for(int j=0; j<nomesFilhos[i].length; j++){
                System.out.println(nomesFilhos[i][j]);
            }

        }
    }
}
