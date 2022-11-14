package genericSetMaps.generics.application;

import java.util.HashMap;
public class Map {
    public static void main(String[] args) {

        // Codigo erro
       HashMap<Integer, String> usuarios = new HashMap<>();
        HashMap<String, String> map = new HashMap<>();


        usuarios.put(1, "Roberto");
        usuarios.put(20, "Ricardo");
        usuarios.put(1, "Rebeca");

        System.out.println(usuarios.size());

        map.put("user", "maria");
        map.put("phone", "287955662285");

        for(String key : map.keySet()) {
            System.out.println("Chave = " + key + ", Valor = " + map.get(key));
        }
    }
}
