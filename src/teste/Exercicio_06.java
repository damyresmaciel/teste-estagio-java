package teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio_06 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String nome, buscaNome;

    List<String> nomes = new ArrayList<String>();

    for (int i = 0; i < 10; i++) {
      System.out.print("Entre com o " + (i + 1) + "° nome: ");
      nome = scan.next();
      nomes.add(nome);
    }

    System.out.print("Qual nome você quer encontrar? ");
    buscaNome = scan.next();

    if (nomes.contains(buscaNome)) {
      System.out.println("ACHEI.");
    } else {
      System.out.println("NÃO ACHEI.");
    }
    
    scan.close();
  }
}
