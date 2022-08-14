package POO.loianeExercicios.banco;

import java.util.Calendar;

public class ContaPoupanca extends Conta {

    public Integer diaRendimento;

    public ContaPoupanca(String nome, Integer conta, double saldo) {
        super(nome, conta, saldo);
    }

    public boolean calcularNovoSaldo(double taxaDerendimento){

        Calendar hoje = Calendar.getInstance();
        if(diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)){
            this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaDerendimento));
            return true;
        }else {
            return false;
        }
    }


    @Override
    public String toString() {
        return "Conta Poupanca" +
                " nome: " + getNome() + '\'' +
                ", conta: " + getConta() +
                ", saldo: " + getSaldo() +
                " limite: " + getLimite();
    }
}
