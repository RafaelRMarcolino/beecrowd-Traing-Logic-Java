package lambdas;

public class CalculoTeste {

    public static void main(String[] args) {

        Calculo calculo = new Soma();
        System.out.println(calculo.execultar(2, 3));

        calculo = new Multiplicador();
        System.out.println(calculo.execultar(2,3));

        Calculo2 calculo2 = (x, y) -> x * y;
        System.out.println(calculo2.legal());
        System.out.println(Calculo2.muitoLegal());
    }
}
