package enums;

public enum DiadaSemana {
    SEGUNDA(2), TERCA(3), QUARTA(4),
    QUINTA(5), SEXTA(6),
    SABADO(7), DOMINGO(1);

    private int valor;

    DiadaSemana(int valor){
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }


}
