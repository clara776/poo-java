package lab03;

import java.util.Scanner;

public class Condicionais3 {
    // Execute no terminal
    // java lab03/Condicionais3.java
    public static void main(String[] args) {
        /**
         * O switch em Java é uma estrutura de controle que permite avaliar a igualdade
         * de uma variável ou expressão com uma lista de valores possíveis (case) e
         * executar um bloco de código correspondente ao valor que coincide.
         * 
         * As expressões case usam a sintaxe -> introduzida no Java 14, o que permite 
         * ma escrita mais compacta quando o código associado a
         * um case é simples
         */
        var sc = new Scanner(System.in);
        System.out.println("Digite o material do seu lixo:");
        var copo = sc.next();
        switch (copo) {
            case "comida", "bebida" -> System.out.println("Jogue na lixeira marrom");
            case "plástico" -> System.out.println("Jogue na lixeira vermelha");
            case "metal" -> System.out.println("Jogue na lixeira amarelo");
            case "vidro" -> System.out.println("Jogue na lixeira verde");
        }
        sc.close();
    }
}
