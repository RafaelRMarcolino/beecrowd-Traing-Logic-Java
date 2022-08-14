package exception;

public class MultiplosCatch {

    public static void main(String[] args) {

        int [] numeos = {4, 8, 16, 32, 64, 128};
        int [] demon = {2, 0, 4, 8, 0};

        for(int i=0; i<numeos.length; i++){
            try {
                System.out.println(numeos[i] + "/" + demon[i] + " = " + (numeos[i] / demon[i]));

            } catch (ArithmeticException e){
                System.out.println("Erro ao dividir por zero");
            }
            catch (ArrayIndexOutOfBoundsException r){
                System.out.println("Posição do array invalida");
            }

        }
//ArithmeticException
    }
}
