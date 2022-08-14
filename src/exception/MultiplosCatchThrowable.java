package exception;

public class MultiplosCatchThrowable {

    public static void main(String[] args) {

        int [] numeos = {4, 8, 16, 32, 64, 128};
        int [] demon = {2, 0, 4, 8, 0};

        for(int i=0; i<numeos.length; i++){
            try {
                System.out.println(numeos[i] + "/" + demon[i] + " = " + (numeos[i] / demon[i]));

            } catch (ArithmeticException e){
                System.out.println("Erro ao dividir por zero");
            }
            catch (Throwable e){
                System.out.println("Ocorreu um erro");
            }
            finally {
                System.out.println("Terminado o bloco");
            }

        }
    }
}
