package exception;

public class MultiplosStracktrace {

    public static void main(String[] args) {

        // faz ate o programa ser finalizado

        int [] numeos = {4, 8, 16, 32, 64, 128};
        int [] demon = {2, 0, 4, 8, 0};

        for(int i=0; i<numeos.length; i++){
            try {
                System.out.println(numeos[i] + "/" + demon[i] + " = " + (numeos[i] / demon[i]));

            } catch (Exception e){
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
