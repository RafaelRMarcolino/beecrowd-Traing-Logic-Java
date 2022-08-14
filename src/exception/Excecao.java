package exception;

public class Excecao {

    public static void main(String[] args) {

        try{

            int [] mat = new int[2];
            mat[1] += 1;

        } catch (ArrayIndexOutOfBoundsException exception){

            System.out.println("nao pod eser acessado");

        }

        System.out.println("fim");

        //ArrayIndexOutOfBoundsException
    }
}
