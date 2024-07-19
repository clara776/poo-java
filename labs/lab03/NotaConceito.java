package lab03;

import java.util.Scanner;

public class NotaConceito {
    public static void main(String[] args){
        var sc = new Scanner(System.in);
        System.out.print("Digite sua nota: ");
       int nota = sc.nextInt();

        if (nota>=90) {
            System.out.println("Conceito A");
        } else if (nota >= 80) {
            System.out.println("Conceito B");
        } else  if (nota >= 70) {
            System.out.println("Conceito C");
        } else if (nota >= 60) {
            System.out.println("Conceito D");
        } else if (nota >= 50) {
            System.out.println("Conceito E");
        } else if (nota < 50) {
            System.out.println("Conceito F");
        }
        System.out.print("Digite o conceito (A,B,C,D,E) ");
        var conceito = sc.next(); 
        switch (conceito){
            case "A" ->  System.out.println("Nota 100"); 
            case "B" ->  System.out.println("Nota 90"); 
            case "C" ->  System.out.println("Nota 80"); 
            default -> System.out.println("Conceito inválido! "); 
        }            
            sc.close();
    
    }

}