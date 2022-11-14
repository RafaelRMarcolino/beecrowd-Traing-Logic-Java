package genericSetMaps.generics.application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class MapExercicioVotos {
    public static void main(String[] args) {

        /* cirado um registro csv C:\temp\

        arquivo: registro.csv

                Alex Blue, 15
                Maria Green, 22
                Bob Brown, 21
                Alex Blue, 30
                Bob Brown, 15
                Maria Green, 27
                Maria Green, 22
                Bob Brown, 15
                Alex Blue, 31
         */

        Scanner sc = new Scanner(System.in);


        HashMap <String, Integer> map = new HashMap<>();

        System.out.println("Digite o caminho do arquivo ");
        // C:\temp\registro.csv.txt

        String path = sc.next();


        // ler um arquivo
        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
            while (line != null){

                //processar a linha
                // System.out.println(line);   teste 1

                // com espaco por ocnta do arquivo
                String[] fields = line.split(", ");

                String name = fields[0];
                Integer votes = Integer.parseInt(fields[1]);

                if(map.get(name) == null){
                    map.put(name, votes);
                }else{
                    map.put(name, votes + map.get(name));
                }

               // map.put(name, votes); teste 2

                line = br.readLine();

            }
            for(String key: map.keySet()){
                System.out.println(key +  ": " + map.get(key));
            }


        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());

        }
    }
}