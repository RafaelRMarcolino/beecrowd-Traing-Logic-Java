import java.util.Arrays;
import java.util.Scanner;

public class Traing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("***** Jogo da Velha ******");

        System.out.println("jogador 1 = X");
        System.out.println("Jogador 2 = 0");

        int [][] jogoVelha = new int[3][3];
        boolean ganhador = false;

        char letra;

        int jogada = 1, linha = 0, coluna = 0;

        while (!ganhador){

            if(jogada %2!=0){

                System.out.println("Vez do jogador 1 escolha de (1- 3)");
                letra = 'x';

            }else {
                System.out.println("Vez do jogador 2 escolha de (1- 3)");
                letra = '0';

            }


            boolean linhaInvalida =  false;
            while (!linhaInvalida){

                    linha = sc.nextInt();
                    if(linha >= 0 && linha <= linha){
                        System.out.println("Linha invalida");
                    }else {
                        linhaInvalida = true;

                    }
            }

            boolean colunanvalida =  false;
            while (!colunanvalida){

                coluna = sc.nextInt();
                if(coluna >= 0 && coluna <= coluna){
                    System.out.println("Linha invalida");
                }else {
                    colunanvalida = true;
                }
            }


            coluna --;
            linha --;
            if(jogoVelha[linha][coluna] == 'x' || jogoVelha[linha][coluna] == '0'){
                System.out.println("Psição existente tente outra");
            }else {
                jogoVelha[linha][coluna] += letra;
            }



            System.out.println("fim");


                jogada++;
        }


    }
}











