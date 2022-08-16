package POO.loianeExercicios.staticos;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("********* calculadora ***********");

        Metodos mc = new Metodos();

        System.out.println(Metodos.soma(10, 20));


    }
}
