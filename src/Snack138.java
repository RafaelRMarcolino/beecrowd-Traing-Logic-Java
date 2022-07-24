
import java.util.Locale;
import java.util.Scanner;

public class Snack138 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String x  = ("code - specification  price");
        System.out.println(x.toUpperCase());
        System.out.println("1 - Cachorro Quente  R$ 4.00");
        System.out.println("1 - x-Salada         R$ 4.50");
        System.out.println("1 - x-Banco          R$ 4.00");
        System.out.println("1 - Torrada Simples  R$ 4.00");

        System.out.println("Fasa o pedido 1 2 ou 3");
        int ped = sc.nextInt();
        double valor = 0;
        if(ped == 1){
            valor = 4.50;
        }
        if(ped == 2){
            valor = 4.60;
        }
        if(ped == 3){
            valor = 4.70;
        }else{
            System.out.println("Obrigado ");
        }
        double dinheiro = 0;
        if(ped == 1){
            System.out.println("Cachorro Quente  R$ 4.50");
            System.out.println("quanto tem ");
            dinheiro = sc.nextDouble();
            double troco = valor - dinheiro;
            System.out.println("seu troco é " + troco + "Obrigado");


        }else if(ped >= 2){
            System.out.println("Cachorro x  R$ 4.60");
            System.out.println("quanto tem ");
            dinheiro = sc.nextDouble();
            double troco = valor - dinheiro;
            System.out.println("seu troco é " + troco + "Obrigado volte sempre");
        }
    }
}
