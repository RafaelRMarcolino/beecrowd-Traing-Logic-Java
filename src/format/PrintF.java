package format;

public class PrintF {

    public static void main(String[] args) {

        System.out.printf("%s", "Ola mundo!");
        System.out.println();

        // imprimir tudo maiusculo
        System.out.printf("%S", "Ola, Mundo!");

        System.out.println();
        // minusculo
        System.out.printf("%c", 'c');
        System.out.println();
        //maiusculo
        System.out.printf("%C", 'c');

        System.out.println();
        System.out.printf("%n");

        int valor = 123456789;
        System.out.printf("%d", valor);


        double pontoFlutuante = 3.1456789;
        System.out.printf("%f", pontoFlutuante);

        System.out.println();

        // espaco entre as palavras
        String ola =  "Ola mundo!";
        System.out.printf("%20s", ola);

        System.out.println();

        // espaco entre as palavras
        System.out.printf("%-20s", ola);

        System.out.println();
        System.out.printf("%+d", valor);

        // com 15 numeros colocanod 0 no local aonde noa tem numero
        System.out.println();
        System.out.printf("%015d", valor);

        // com virgula
        System.out.println();
        System.out.printf("%,d", valor);


        // colocando virgulas
        System.out.println();
        System.out.printf("%.3f", pontoFlutuante);

        System.out.println();
        System.out.printf("%.2f", pontoFlutuante);

        System.out.println();
        System.out.printf("R$%10.2f", pontoFlutuante);

        testeMaisCompleto();
    }

    private static void testeMaisCompleto(){

        double[] precos = {10000, 123.54, 7843.567, 1, 4.56789};

        for (int i=0; i<precos.length; i++){
            System.out.printf("%s %02d: total de R$%,10.2f%n", "Item", i+1, precos[i] );
        }
    }
}
