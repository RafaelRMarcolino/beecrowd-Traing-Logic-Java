package genericSetMaps.generics.application;

import java.util.HashSet;
import java.util.Set;

public class HashConjuntoSimples {

    public static void main(String[] args){

        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("Tamanha é " + conjunto.size());

        conjunto.add("Teste");
        conjunto.add('x');
        System.out.println("Tamanho é " + conjunto.size());

        conjunto.add("test");
        conjunto.add('x');

        System.out.println("Tamanh é " + conjunto.size());

        conjunto.add("teste");
        conjunto.add('x');

        System.out.println("Tamanho é " + conjunto.size());


        System.out.println(conjunto.remove("teste"));
        System.out.println(conjunto.remove("Teste"));
        System.out.println(conjunto.remove('x'));

        System.out.println("Tamnho é " + conjunto.size());

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        // conjunto.add(nums); // uniao entre conjuntos

        conjunto.retainAll(nums);
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);



    }
}
