package vetor;

public class MetodoVetor {

    public static void main(String[] args) {
        int[] vetor2 = {1, 2, 3, 4 , 5, 8 ,9, 10};

        System.out.println(soma(vetor2));

        //vargs
        System.out.println(soma(1, 20, 36, 10, 56, 2000, 9636355 , 1000 ));
    }

    static int soma(int [] vetor){
        int total = 0;

        for(int i=0; i<vetor.length; i++){
            total += vetor[i];
        }

        return total;
    }

    // usar os tres pontinho depois do tipo informa que pode receber inumeros valores
    static int soma(Integer... vetor){
        int total = 0;

        for(int i=0; i<vetor.length; i++){
            total += vetor[i];
        }

        return total;
    }

}
