package lab04;

import java.util.Scanner;

public class Repeticoes1 {
    // java lab04/Repeticoes1.java
    public static void main(String[] args) {
        /**
         * while: Executa um bloco de código enquanto uma condição específica for
         * verdadeira.
         */
        var contador = 1;
        var sc = new Scanner(System.in);
        System.out.println(" Digite um número ");
        var numero = sc.nextInt();
        while (numero < 10) {
            System.out.print(numero + "X" + contador);
           System.out.print(numero * contador);
            numero += 1;
           
        }
    }
}
