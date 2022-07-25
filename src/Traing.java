import java.util.Scanner;

public class Traing {

    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas entrevistadas? ");

        int numeroEntrevista = sc.nextInt();
        String [][] qtPessoas = new String[numeroEntrevista][];

        for(int i=0; i<qtPessoas.length; i++){

            System.out.println("Quantas criancas ?");
            int qtdCriancas = sc.nextInt();

            qtPessoas[i] =  new String[qtdCriancas];

            for (int j=0; j<qtPessoas[i].length; j++){

                System.out.println("nome das criancas ?" + (j + i));

                qtPessoas[i][j] = sc.next();
            }
        }

        for(int i=0; i<qtPessoas.length; i++){
            System.out.println("Pessoa "+ i  + " tem " + qtPessoas[i].length  + "filhos");
            for (int j=0; j<qtPessoas[i].length; j++){

                System.out.println(qtPessoas[i][j]);
            }
        }

        System.out.println("fim");

    }

}
