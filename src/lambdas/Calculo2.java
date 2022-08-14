package lambdas;

public interface Calculo2 {
    double execultar(double a, double b);

    default String legal(){
        return "legal";
    }

    static String muitoLegal(){
        return  "Muito Legal";
    }
}
