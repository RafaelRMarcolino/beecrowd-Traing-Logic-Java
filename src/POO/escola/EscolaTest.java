package POO.escola;

import java.util.Arrays;
import java.util.Scanner;

public class EscolaTest {

    /**
     * Escreva uma clase para representar um Aluno. Adicione atributos relacionados as caracteristicas de um aluno ,
     * como numero da matricula, curso que esta matriculado, nome de tres cursos, nota dos cursos.
     * Desenvolva um metodo para verificar se o aluno esta aprovado (Nota igual ou maior a 7) em uma determinada disciplina
     * Escreva um programa para testar a classe que pede as informações do aluno ao usuario e ao final informar o nome
     * da disciplina  mostra as notas se o aluno foi aprovado ou nao
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Aluno al1 = new Aluno();


        System.out.println("Entre com o nome do aluno ");
        String nome = sc.nextLine();
        al1.setNome(nome);

        System.out.println("Entre com o matricula do aluno ");
        String matricula = sc.nextLine();
        al1.setMatricula(matricula);

        System.out.println("Entre com o disciplina do aluno ");
        //al1.disciplina = new String[3];
        for (int i = 0; i < al1.disciplina.length; i++) {

            System.out.println("Digite a materia" + (i + 1));
            al1.disciplina[i] = sc.nextLine();
        }


        System.out.println("Entre com o disciplina do aluno ");


        for (int i = 0; i < al1.notas.length; i++) {
            System.out.println("Obtendo as disciplinas " + al1.disciplina[i]);
            for (int j = 0; j < al1.notas[i].length; j++) {

                System.out.print("Digite a nota " + (i + 1));
                al1.notas[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        al1.mostrarInfo();

        for(int i=0; i<al1.notas.length; i++){
            if(al1.verificarAprovado(i)){
                System.out.println("Disciplina " + al1.disciplina[i] + " - foi aprovado ");
            }else {
                System.out.println("Disciplina " + al1.disciplina[i] + " - foi reprovado ");
            }
        }
    }
}
