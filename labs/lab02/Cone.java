package lab02;

import java.util.Scanner;

public class Cone {
   public static void main(String[] args) {
       System.out.println( "Informe o lado:");
       var sc = new Scanner(System.in);
       var lado = sc.nextInt();
       var altura =  sc.nextInt(); 
        var volume = Math.PI * Math.pow( lado,2) /4 /3 * altura; 

 System.out.println("O volume do cone é: " +(volume) );
 sc.close();
}
}