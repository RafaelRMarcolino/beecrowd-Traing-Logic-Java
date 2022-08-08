package matriz;

import java.util.Scanner;

public class MatrizExercicio6 {

    /** Faça um programa para jogar o jogo da velha. O Pragama deve permitir que os dois jogadores
     * façam uma partida do jogo da velha, usando o computador para ver o tabulheiro. Cada jogador vai alternando
     * informando a posição onde deseja colocar a sua a sua peça ('O' ou 'X'). O programa deve inpedir jogadas
     * invalidas e determinar automaticamente quando o jogo terminou e quem foi o vencedor (Jogador1 e Jogador2)
     * A cada nova jornada o programa deve atualizar a situação do tabuleiro na tela
     */

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        char [][]jogoVelha = new char[3][3];

        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = 0");

        boolean ganhador = false;
        char sinal;
        int jogada = 1, linha = 0, coluna = 0;

        while (!ganhador){

            if(jogada %2==0){

                System.out.println("Vez do jogador 1 escolha a coluna entre (1 - 3)");
                sinal = 'X';
            }else {
                System.out.println("Vez do jogador 1 escolha a coluna entre (1 - 3)");
                sinal = '0';
            }

            boolean linhaInvalida = false;
            while (!linhaInvalida){
                System.out.println("Entre com a linha (1, 2 ou 3)");
                linha = sc.nextInt();
                if(linha >= 1 && linha <=3){
                    linhaInvalida = true;
                }else {
                    System.out.println("Entrada invalida tente novamente");
                }
            }

            boolean colunaInvalida = false;
            while (!colunaInvalida){
                System.out.println("Entre com a coluna (1, 2 ou 3)");
                coluna = sc.nextInt();
                if(coluna >= 1 && coluna <=3){
                    colunaInvalida = true;
                }else {
                    System.out.println("Entrada invalida tente novamente");
                }
            }

            coluna--;
            linha--;
            if(jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == '0'){
                System.out.println("Posição existente tente outra");
            }else {
                jogoVelha[linha][coluna] = sinal;
                jogada ++;
            }


            for(int i =0; i< jogoVelha.length; i++){
                for(int j =0; j< jogoVelha[i].length; j++){

                    System.out.print(jogoVelha[i][j] + " | ");
                }
                System.out.println();
            }

            if((jogoVelha[0][0] == 'X' && jogoVelha[0][1] == 'X' && jogoVelha[0][2] == 'X') || //linha 1
                    (jogoVelha[1][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[1][2] == 'X') || //linha 2
                    (jogoVelha[2][0] == 'X' && jogoVelha[2][1] == 'X' && jogoVelha[2][2] == 'X') || //linha 3
                    (jogoVelha[0][0] == 'X' && jogoVelha[1][0] == 'X' && jogoVelha[2][0] == 'X') || // coluna 1
                    (jogoVelha[0][1] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][1] == 'X') || // coluna 2
                    (jogoVelha[0][2] == 'X' && jogoVelha[1][2] == 'X' && jogoVelha[2][2] == 'X') || // coluna 3
                    (jogoVelha[0][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][2] == 'X')  // diagonal
            ){
                ganhador = true;
                System.out.println("Parabens o jogador 1 ganhou");

            } else if ((jogoVelha[0][0] == '0' && jogoVelha[0][1] == '0' && jogoVelha[0][2] == '0') || //linha 1
                    (jogoVelha[1][0] == '0' && jogoVelha[1][1] == '0' && jogoVelha[1][2] == '0') || //linha 2
                    (jogoVelha[2][0] == '0' && jogoVelha[2][1] == '0' && jogoVelha[2][2] == '0') || //linha 3
                    (jogoVelha[0][0] == '0' && jogoVelha[1][0] == '0' && jogoVelha[2][0] == '0') || // coluna 1
                    (jogoVelha[0][1] == '0' && jogoVelha[1][1] == '0' && jogoVelha[2][1] == '0') || // coluna 2
                    (jogoVelha[0][2] == '0' && jogoVelha[1][2] == '0' && jogoVelha[2][2] == '0') || // coluna 3
                    (jogoVelha[0][0] == '0' && jogoVelha[1][1] == '0' && jogoVelha[2][2] == '0')  // diagonal
            ) {
                ganhador = true;
                System.out.println("Parabens o jogador 2 ganhou");

            } else if (jogada > 9) {
                ganhador = true;
                System.out.println("Ninguem ganhou essa partida");
                
            }

        }



        sc.close();
    }
}
