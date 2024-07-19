package lab02;

public class Piramide {
    public static void main(String[] args) {
      var lado = Float.parseFloat(args[0]);
      
      var altura= Float.parseFloat(args[1]);
      var volume = lado * lado  * altura /3;

      System.out.println(" O volume da pirâmide será: " + Math.round(volume));

    }
}
