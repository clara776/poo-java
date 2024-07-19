package lab03;

public class Condicionais2 {
    public static void main(String[] args){
        var nota = 70;
        if (nota >=90) {
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
    }
}
