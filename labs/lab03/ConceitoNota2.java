package lab03;

import java.util.Scanner;

public class ConceitoNota {
    public static void main(String[] args){
        var sc = new Scanner(System.in);
        System.out.println(" Digite a nota (0-100): ")
        var nota = sc.nextInt();

        if (nota>=90 && nota <=100) {
            System.out.println("Conceito A");
        } else if (nota >= 80 && nota <= 90) {
            System.out.println("Conceito B");
        } else  if (nota >= 70 && nota <=80) {
            System.out.println("Conceito C");
        } else {
            System.out.println("Nota fora do intervalo");
        //} else if (nota >= 50) {
           // System.out.println("Conceito E");
       // } else if (nota < 50) {
           // System.out.println("Conceito F");

        //sc.close();
        //}
 //   }

        }
    }


       











    }

