package ztreino;

import java.util.Scanner;

public class Escola {

    /**
     * Escreva uma clase para representar um Aluno. Adicione atributos relacionados as caracteristicas de um aluno ,
     * como numero da matricula, curso que esta matriculado, nome de tres cursos, nota dos cursos.
     * Desenvolva um metodo para verificar se o aluno esta aprovado (Nota igual ou maior a 7) em uma determinada disciplina
     * Escreva um programa para testar a classe que pede as informações do aluno ao usuario e ao final informar o nome
     * da disciplina  mostra as notas se o aluno foi aprovado ou nao
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Aluno al = new Aluno();

        System.out.println("***** Escola ********");

        System.out.println("Nome: ");
        al.nome = sc.nextLine();

        System.out.println("Informe a matricula: ");
        al.matricula = sc.nextLine();


        System.out.println("Informe as materias ");
        for (int i=0; i< al.curso.length; i++){
            System.out.println("Informe o nome das materias " + (i + 1));
            al.curso[i] = sc.nextLine();
        }

        System.out.println("Informe as notas das materias ");
        for (int i=0; i< al.notas.length; i++) {
            System.out.println(" materia : " + al.curso[i]);
            for (int j = 0; j < al.notas[i].length; j++) {
                al.notas[i][j] = sc.nextInt();
            }
        }

        al.toAluno();

        for(int i=0; i< al.notas.length; i++){
            if(al.aprovacao(i)){
                System.out.println("Disciplina " + al.curso[i] + " foi aprovado");
            }else {
                System.out.println("Disciplina " + al.curso[i] + "foi reprovado");
            }
        }

    }
}
