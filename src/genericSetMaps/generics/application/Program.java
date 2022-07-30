package genericSetMaps.generics.application;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PrintServices ps = new PrintServices();

        System.out.println("How many values ? ");
        int n = sc.nextInt();

        for(int i=0; i < n; i++){
            int value = sc.nextInt();
            ps.addvalue(value);
        }

        ps.print();
        System.out.println("First: " + ps.first());

        sc.close();
    }
}
