import java.util.Scanner;

public class Traing {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros ");
        int [] var = new int[100];

        for(int i = 0; i < var.length; i ++){

            var[i] = i;
        }

        int p = 0;
        for (int i = 0; i < var.length; i ++){

            if(var[i] >= var[10] && var[i] <= 20){
                p++;
            }
        }
        System.out.println("soma dos pontos " + p);

        for(int i = 0; i < var.length; i ++){

            System.out.print(var[i] + " ");
        }
    }
}






