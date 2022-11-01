package enums;

public class Calculadora {


    enum Operacoes{

        SOMA("+") {
            @Override
            public double execultaroperacao(double x, double y) {
                return x + y;
            }
        },
        SUBTRAIR("-") {
            @Override
            public double execultaroperacao(double x, double y) {
                return x - y;
            }
            }, MULTIPLICAR("*"){
            @Override
            public double execultaroperacao(double x, double y) {
                return x * y;
            }
        }, DIVIDIR("/") {
            @Override
            public double execultaroperacao(double x, double y) {
                return x / y;
            }
        };


        private String simbolo;

        public String getSimbolo() {
            return simbolo;
        }

        public void setSimbolo(String simbolo) {
            this.simbolo = simbolo;
        }

        Operacoes(String s) {
        }

        public abstract double execultaroperacao(double x, double y);

            public String toString(){
                return this.simbolo;
            }


    }


    public static void main(String[] args) {

        double x = 2.0;
        double y = 3.0;

        for(Operacoes op : Operacoes.values()){
            System.out.println(x + " ");
            System.out.println(op.toString() + " ");
            System.out.println(y + " ");
            System.out.println(op.execultaroperacao(x, y));

        }

    }

}
