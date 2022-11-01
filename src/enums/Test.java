package enums;

public class Test {

    public static void main(String[] args) {

        DiadaSemana dia  = DiadaSemana.SABADO;

        System.out.printf(dia.toString());

        DiadaSemana[] d = DiadaSemana.values();

        for(DiadaSemana day : DiadaSemana.values()){

            System.out.print(" " + day);
        }
    }
}
