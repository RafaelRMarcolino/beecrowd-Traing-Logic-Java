
import java.util.Scanner;

public class Traing {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n=0, soma = 0, p = 0, resul = 0;
        for(int i=1; i<6; i++){

            n = sc.nextDouble();
            if(n > 0){

                p++;
                System.out.println(p + "p ");
                soma += n;
            }else {
                System.out.println("numero negativo");
            }
        }
        resul = soma / 2;


        System.out.println(p + " valores positivos");
        System.out.println(String.format("%.1f", soma));
    }
}


