package teste;

import java.util.Scanner;

public class Exercicio_02 {

  public static void main(String[] args) {
    System.out.println( recebePalavra());
  }
  
  public static StringBuffer inverte(String palavra) {
    StringBuffer inverso = new StringBuffer(palavra);
    return inverso.reverse();
  }

  public static String recebePalavra() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Entre com a palavra: ");
    String txt = scan.next();
    scan.close();
    return "A palavra " + txt + " ao contrário é: " + inverte(txt);
  }

}
