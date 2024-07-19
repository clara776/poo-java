package lab02;

import java.util.Scanner;

public class Entrada3 {

    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.println("Digite uma palavra:");
        var palavra = sc.next();

        System.out.println("A palavra digitada foi: " + palavra);

        sc.close();
    }
}

