package POO.loianeExercicios.banco;

public class Conta {

   private String nome;
   private Integer conta;
   private double saldo;

    private double limite;

    public Conta(String nome, Integer conta, double saldo) {
        this.nome = nome;
        this.conta = conta;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getConta() {
        return conta;
    }

    public void setConta(Integer conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double deposito(double valor){
        return  saldo = getSaldo() + valor;
    }

    public boolean saque(double valor){
            if((saldo - valor) >= 0){
                saldo -= valor;
                return  true;
            }else {
                saqueLimite(valor);
                return false;
            }
    }

    public boolean saqueLimite(double valor){
        if(saldo <= 0){

            limite -= valor;
            saldo -= limite;
            return true;
        }
        else{
            return  false;
        }

    }
    @Override
    public String toString() {
        return "Cliente" +
                " nome: " + nome + '\'' +
                ", conta: " + conta +
                ", saldo: " + saldo +
                " limite: " + limite;
    }
}
