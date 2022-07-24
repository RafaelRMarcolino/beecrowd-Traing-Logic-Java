package beecrowd; /**

 Peter is organizing an event in his University. The event will be in April month, beginning and finishing
 within April month. The problem is: Peter wants to calculate the event duration in seconds, knowing obviously
 the begin and the end time of the event.
 You know that the event can take from few seconds to some days, so, you must help Peter to compute the total
 time corresponding to duration of the event.

 Input
 The first line of the input contains information about the beginning day of the event in the format: “Dia xx”.
 The next line contains the start time of the event in the format presented in the sample input. Follow 2 input
 lines with same format, corresponding to the end of the event.

 Output
 Your program must print the following output, one information by line, considering that if any information is
 null for example, the number 0 must be printed in place of W, X, Y or Z:

 W dia(s)
 X hora(s)
 Y minuto(s)
 Z segundo(s)

 Obs: Consider that the event of the test case have the minimum duration of one minute. “dia” means day,
 “hora” means hour, “minuto” means minute and “Segundo” means second in Portuguese.

**/
import java.util.Scanner;

public class EventTime1061 {

    public static void main(String[] args)  {

         Scanner sc = new Scanner(System.in);
      int totalDias = 0, totalDeHoras = 0, totalMinutos = 0, totalsegudos = 0;
      System.out.println("Digite o dia que inicia ");
      String [] SdialInicial = sc.nextLine().split(" ");

        System.out.println("Digite a hora final com o formato (hh:mm:ss) ");
        String [] SHoraInicial = sc.nextLine().replaceAll(" ", "").split(":");

      System.out.println("Digite o dia que final ");
      String [] SdiaFinal = sc.nextLine().split(" ");

      System.out.println("Digite a hora final com o formato (hh:mm:ss) ");
      String [] ShoraFinal = sc.nextLine().replaceAll(" ", "").split(":");

      int diaInicial = Integer.parseInt(SdialInicial[0]);
      int horaInicial = Integer.parseInt(SHoraInicial[0]);
      int minutoInicial = Integer.parseInt(SHoraInicial[1]);
      int segundoInicial = Integer.parseInt(SHoraInicial[2]);

      int diaFinal = Integer.parseInt(SdiaFinal[0]);
      int horaFinal = Integer.parseInt(ShoraFinal[0]);
      int minutoFinal = Integer.parseInt(ShoraFinal[1]);
      int segundoFinal = Integer.parseInt(ShoraFinal[2]);

      if(segundoFinal < segundoInicial){
        totalsegudos += (60 - segundoInicial) + segundoFinal;
        totalMinutos --;
      }else if (segundoFinal > segundoInicial){
        totalsegudos += segundoFinal - segundoInicial;
      }else {
        totalsegudos = 0;
      }

      if(minutoFinal < minutoInicial){
        totalMinutos += (60 - minutoInicial) + minutoFinal;
        totalDeHoras --;
      }else if (minutoFinal > minutoInicial){
        totalMinutos += minutoFinal - minutoInicial;
      }else {
        totalMinutos = 0;
      }

      if(horaFinal < horaInicial){
        totalDeHoras += (60 - horaInicial) + horaFinal;
        totalDias --;
      }else if (horaFinal > horaInicial){
        totalDeHoras += horaFinal - horaInicial;
      }else {
        totalDeHoras = 0;
      }


      if (diaFinal < diaInicial) {
        totalDias += (30 - diaInicial) + diaFinal;
      } else if (diaFinal > diaInicial) {
        totalDias += diaFinal - diaInicial;
      } else {
        totalDias = 0;
      }

        System.out.println(diaInicial + " Dia inicial");
        System.out.println(horaInicial + " Hora inicial");

        System.out.println(minutoInicial + " Minuto inicial");
        System.out.println(segundoInicial + " segundo inicial" );
        System.out.println(diaFinal + " dia final");
        System.out.println(horaFinal + " Hora final");
        System.out.println(minutoFinal + " minuto final");
        System.out.println(segundoFinal + " segundo final");

      System.out.println( );
      System.out.println("Resultado");

      System.out.println(totalDias + " dia(s)");
      System.out.println(totalDeHoras + " hora(s)");
      System.out.println(totalMinutos + " minuto(s)");
      System.out.println(totalDeHoras + " segundo(s)");
    }

}
