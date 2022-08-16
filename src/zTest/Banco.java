package zTest;

import java.util.Scanner;

public class Banco {

    /**
     * Escreva uma clase para representar um Aluno. Adicione atributos relacionados as caracteristicas de um aluno ,
     * como numero da matricula, curso que esta matriculado, nome de tres cursos, nota dos cursos.
     * Desenvolva um metodo para verificar se o aluno esta aprovado (Nota igual ou maior a 7) em uma determinada disciplina
     * Escreva um programa para testar a classe que pede as informações do aluno ao usuario e ao final informar o nome
     * da disciplina  mostra as notas se o aluno foi aprovado ou nao
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("***** Banco ********");


        Conta c1 = new Conta("polo", "2554", -10.00, 500);

        c1.extrado();
        System.out.println();

        System.out.println("Gostiaria de sacart quanto ");
        double saque = sc.nextDouble();
        c1.saque(saque);


        c1.extrado();
    }
}
