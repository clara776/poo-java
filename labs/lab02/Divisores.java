package lab02;
import java.util.Scanner;

public class Divisores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print( "Digite um número ");
        var numero = scanner.nextInt();
        
        
        System.out.println("A quantidade de divisores de " + numero + " é " + contarDivisores(numero) + ".");
        
        scanner.close();
    }

    public static int contarDivisores(int n) {
        var quantidadeDivisores = 0;
        
    
        for (int i = 1; i <= n; i++) {
        
            if (n % i == 0) {
                quantidadeDivisores++;
            }
        }
        
        return quantidadeDivisores;
    }
}
