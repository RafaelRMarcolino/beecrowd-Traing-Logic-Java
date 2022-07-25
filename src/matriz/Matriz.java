package matriz;

public class Matriz {
    public static void main(String[] args) {

        double[][] notasAlunos = new double[3][4];

        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 8;
        notasAlunos[0][2] = 6;
        notasAlunos[0][3] = 10;

        notasAlunos[1][0] = 8;
        notasAlunos[1][1] = 9;
        notasAlunos[1][2] = 10;
        notasAlunos[1][3] = 10;

        notasAlunos[2][0] = 9;
        notasAlunos[2][1] = 9;
        notasAlunos[2][2] = 8;
        notasAlunos[2][3] = 7;

        //mudando a nota do aluno
        notasAlunos[0][2] = 12;

        for(int i=0; i<notasAlunos.length; i++){
            for (int j=0; j<notasAlunos[i].length; j++){
                System.out.print(notasAlunos[i][j] + " - ");
            }
            System.out.println( );
        }


        System.out.println("Sistema de calcular a soma ");
        double soma;

        for(int i=0; i<notasAlunos.length; i++){

            soma = 0;
            for (int j=0; j<notasAlunos[i].length; j++){
                soma += notasAlunos[i][j];
            }
            System.out.println("Notas medias dos alunos " + i + " é = " + (soma/4));
        }





    }
}
