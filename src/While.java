
import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        int num = 0;
        int num2 = 1;
        int loop;
        int fibonacci;
        System.out.print(num2);

        for (loop = 1; loop <= 10; loop ++)
        {
            fibonacci = num + num2;
            num = num2;
            num2 = fibonacci;
            System.out.print(" " + fibonacci);
        }

    }
}


