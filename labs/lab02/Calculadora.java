package lab02; 
import java.util.Scanner;

public class Calculadora {

    public static void main() {
        System.out.println("Escolha uma operação:");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
    }

    public static double[] obterValores() {
        Scanner scanner = new Scanner(System.in);
        double[] valores = new double[2];
        boolean entradaValida = false;
        
        while (!entradaValida) {
            try {
                System.out.print("Digite o primeiro valor: ");
                valores[0] = Double.parseDouble(scanner.nextLine());
                System.out.print("Digite o segundo valor: ");
                valores[1] = Double.parseDouble(scanner.nextLine());
                entradaValida = true;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite valores numéricos válidos.");
            }
        }
        
        return valores;
    }

    public static void Calculadora(int opcao, double num1, double num2) {
        double resultado;
        switch (opcao) {
            case 1:
                resultado = num1 + num2;
                System.out.println("O resultado da adição é: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("O resultado da subtração é: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("O resultado da multiplicação é: " + resultado);
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                } else {
                    resultado = num1 / num2;
                    System.out.println("O resultado da divisão é: " + resultado);
                }
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        
        int opcao = 0;
        boolean opcaoValida = false;
        
        while (!opcaoValida) {
            try {
                System.out.print("Digite o número da opção desejada (1-4): ");
                opcao = Integer.parseInt(scanner.nextLine());
                if (opcao >= 1 && opcao <= 4) {
                    opcaoValida = true;
                } else {
                    System.out.println("Opção inválida. Por favor, escolha um número entre 1 e 4.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
            }
        }
        
        double[] valores = obterValores();
        Calculadora(opcao, valores[0], valores[1]);
    }
}
