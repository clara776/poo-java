package lab02;
import java.util.Scanner;

public class Divisores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print( "Digite um número ");
        var numero = scanner.nextInt();
        
        
        System.out.println("A quantidade de divisores de " + numero + " é  igual a " + Divisores(numero) + ".");
        
        scanner.close();
    }

    public static int Divisores(int n) {
        var Divisores = 0;
        
    
        for (int i = 1; i <= n; i++) {
        
            if (n % i == 0) {
                Divisores++;
            }
        }
        
        return Divisores;
    }
}
