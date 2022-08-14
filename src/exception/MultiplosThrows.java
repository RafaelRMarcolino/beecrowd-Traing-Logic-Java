package exception;

import java.util.Scanner;

public class MultiplosThrows {

    public static void main(String[] args) {

        // faz ate o programa ser finalizado

        System.out.println("Entre com um numero decimal ");

        try {
            double num = leNumero();
            System.out.println("Voce digitou " + num);
        } catch (Exception e){
            System.out.println("Entrada invalida");
            e.printStackTrace();
        }
    }
    public static double leNumero() throws Exception{
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        return num;
    }
}