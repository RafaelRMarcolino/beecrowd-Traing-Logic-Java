package zTest;

public class Conta {


    // aula 33

    String nome;
    String conta;
    double saldo;

    double limite;

    public Conta(String nome, String conta, double saldo, double limite) {
        this.nome = nome;
        this.conta = conta;
        this.saldo = saldo;
        this.limite = limite;

    }

      void saque(double valor){
        if(saldo <= 0){
               limite -= valor;
               saldo -= valor;

            System.out.println("saque do cheque especial " + limite);


        }else {
            saldo -= valor;
            System.out.println("saque de " + valor);
            System.out.println("saldo " + saldo);
            System.out.println("limite " + limite);



        }

    }

    void extrado(){
        System.out.println("nome: " + nome);
        System.out.println("conta: " + conta);
        System.out.println("saldo: " + saldo);
        System.out.println("limite " + limite);
    }




}
