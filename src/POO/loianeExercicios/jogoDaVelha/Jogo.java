package POO.loianeExercicios.jogoDaVelha;

public class Jogo {

    int linha;
    int coluna;

    public Jogo(){

    }

    public void velhaJogo(){
        int jogada = 1;
        boolean vencedor = false;

        while (!vencedor){

            if(jogada %2==0){
                System.out.println("jogador 1");
            }else {
                System.out.println("Jogador 2");
            }
        }

    }

}
