package genericSetMaps.generics.application;

import java.util.HashSet;
import java.util.Set;

public class HashConjunto {

    public static void main(String[] args){

        HashSet conjunto = new HashSet();

        Set<String> listaAprovados = new HashSet<>();
        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Lucas");
        listaAprovados.add("Pedro");


        for(String candidatos : listaAprovados){
            System.out.println(candidatos);
        }

        Set<Integer> nums = new HashSet<>();

        nums.add(1);
        nums.add(2);
        nums.add(120);
        nums.add(6);

        for(int n: nums){
            System.out.println(n);
        }


    }
}
