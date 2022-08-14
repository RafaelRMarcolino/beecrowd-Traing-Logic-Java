package POO.loianeExercicios.banco;

import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Conta cl1 = new Conta("joel", 255, -10);

        System.out.println("**** Conta correte ********");
        System.out.println(cl1.toString());

        cl1.saque(100);

        saquedaConta(cl1, 1000);


        System.out.println("********* Conta Poupanca **************");

        ContaPoupanca cp2 = new ContaPoupanca("Maria", 4555, 10000);

        cp2.toString();
        cp2.saque(500);

        System.out.println(cp2.toString());

        saquedaConta(cp2, 200);

        sc.close();

    }

    public static void  saquedaConta(Conta cl1, double valor){
        if(cl1.saque(valor)){
            System.out.println("Saque efetuado com sucesso " + cl1.getLimite());
        }else {
            System.out.println("saldo inexistente" + cl1.getSaldo());
        }

        System.out.println(cl1.toString());

    }
}
