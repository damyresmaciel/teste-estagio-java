package teste;

import java.io.ObjectInputStream.GetField;

public class Exercicio_10 {

  public static void main(String[] args) {

    Pessoa p1 = new Pessoa(1, "josé", "da silva", 42);
    Pessoa p2 = new Pessoa(2, "joão", "gonçalves", 21);
    Pessoa p3 = new Pessoa(3, "pedro", "garcia", 28);
    Pessoa p4 = new Pessoa(4, "matheus", "pinheiro", 21);
    
    

    if (p1.getIdade() < 26) {
      System.out.println(p1.imprimirDados());
    }
    if (p2.getIdade() < 26) {
      System.out.println(p2.imprimirDados());
    }
    if (p3.getIdade() < 26) {
      System.out.println(p3.imprimirDados());
    }
    if (p4.getIdade() < 26) {
      System.out.println(p4.imprimirDados());
    }
  }

}
