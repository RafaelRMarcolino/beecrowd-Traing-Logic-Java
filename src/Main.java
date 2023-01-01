
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> map = new HashMap<>();

        System.out.println("Digite o caminho do arquivo ");

        String path =  sc.next();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
            while (line != null){

                System.out.println(line);

                line = br.readLine();
            }

        }catch (Exception e){
            System.out.println("Erro ao achar o arquivo");
        }

    }
}
