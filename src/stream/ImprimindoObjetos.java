package stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

    public static void main(String[] args) {

        List<String> aprovador = Arrays.asList("Ana", "pedor", "katia");

        System.out.println("for");
        for(int i = 0; i<aprovador.size(); i++){
            System.out.print(aprovador.get(i) + " ");
        }

        System.out.println();
        System.out.println("Each");
        for(String apro : aprovador){
            System.out.println(apro + " ");
        }

        System.out.println("\nUsndo Interator...");
        Iterator<String> it = aprovador.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("\nEscrevendo Stream");
        Stream<String> stream = aprovador.stream();
        stream.forEach(System.out::println);
    }
}
