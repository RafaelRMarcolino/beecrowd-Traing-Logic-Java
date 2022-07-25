package vetor;

import java.text.ParseException;

public class Vetores {

    public static void main(String[] args) throws ParseException {

        double [] temperatura = new double[365];
        temperatura[0] = 31.2;
        temperatura[1] = 78.2;
        temperatura[2] = 56.2;
        temperatura[3] = 21.2;
        temperatura[4] = 33.2;

        System.out.println("Temperatura do dia " + temperatura[2]);

        //Tamnho do Array
        System.out.println("O tamnho do array " + temperatura.length);

        for(int i=0; i < temperatura.length; i++){
            System.out.println("O valor  da temperatura do dia " + (i+1) + " é: " + temperatura[i]);
        }

        //for melhorado
        for(double temp: temperatura){
            System.out.println(temp);
        }

        // vetor iniciando
        double [] notasDoAluno1 = {7, 8, 9, 10};
        double [][] notaDoAluno2 = {{7, 8, 9, 10}, {8, 6, 7, 10}};

        System.out.println("Out put da matriz notas do aluno2");
        for(int i=0; i<notaDoAluno2.length; i++){
            for (int j=0; j< notaDoAluno2[i].length; j++){
                System.out.println(notaDoAluno2[i][j] + " - ");
            }
            System.out.println();
        }





    }

}
