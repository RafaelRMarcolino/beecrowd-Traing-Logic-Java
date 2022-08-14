package ztreino;

public class Aluno {

    String nome;
    String matricula;
    String[] curso = new String[3];
    int[][] notas = new int[3][4];

    public Aluno() {

    }

    void toAluno() {
        System.out.println("Nome: " + nome);
        System.out.println("matricula: " + matricula);

        for (int i = 0; i < notas.length; i++) {
            System.out.println("materia " + curso[i]);
            for (int j = 0; j < notas.length; j++) {
                System.out.print( notas[i][j] + " ");
            }
            System.out.println();
        }

    }


    boolean aprovacao(int indice){
        int soma = 0;
        for (int i=0; i<notas[indice].length; i++){

                soma += notas[indice][i];
            }

        double media = soma / 4;

        if(soma > 7){
            return  true;
        }else {
            return false;
        }
    }


}
