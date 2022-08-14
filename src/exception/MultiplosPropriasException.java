package exception;

public class MultiplosPropriasException {

    public static void main(String[] args) {

        int [] numeos = {4, 8, 16, 32, 64, 128};
        int [] demon = {2, 1, 4, 8, 0};

        for(int i=0; i<numeos.length; i++){
            try {
                if (numeos[i] %2!=0){
                    //divisao
                  //  throw new Exception("Numero impar, divisao nao exata");
                    throw new DivisaoNaoExata(numeos[i], demon[i]);
                }
                System.out.println(numeos[i] + "/" + demon[i] + " = " + (numeos[i] / demon[i]));

            } catch (ArithmeticException | ArrayIndexOutOfBoundsException e ){
                System.out.println("Erro ao dividir por zero");
                e.printStackTrace();
            } catch (DivisaoNaoExata e) {
                throw new RuntimeException(e);
            }

            /** catch (Exception e) {
                System.out.println("Acontecu um erro");
                System.out.println(e.getMessage());
            }**/
        }
    }
}
