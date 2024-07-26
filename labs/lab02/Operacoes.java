package lab02;

import java.util.Scanner;
public class Operacoes {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
  }
     
    System.out.println("Escolha uma opção: ");  
    System.out.println(" 1- Somar: ");  
    System.out.println("2 - Subtrair: ");  
    System.out.println("3- Multiplicar: ");  
    System.out.println("4- Dividir: "); 

    System.out.println("Sua opção: ");
    var opcao = input.nextInt();

    switch(opcao) {
        case 1:
          System.out.println("soma");
          break;
          case 2:
          System.out.println("sbtração");
          break;
          case 3:
          System.out.println("multiplicação");
          break;
          case 4:
          System.out.println("divisão");
          break;
          case 0:
          System.exit(0);
          break;
          defaut:System.out.println("opção inválida");
  
    System.out.print("Digite o primeiro número ");
    int num_1 = input.nextInt();
    System.out.print("Digite o segundo número ");
  int num_2 = input.nextInt();
    System.out.println(num_1 + num_2);
    System.out.println(num_1 - num_2);
    System.out.println(num_1 * num_2);
    System.out.println(num_1 / num_2);
      }
        }
          