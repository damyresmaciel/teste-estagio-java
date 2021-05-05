package teste;

public class Exercicio_03 {

  public static void main(String[] args) {
    imprimePalavras("Livros","Cadernos","Notebook","Canetas");
  }

  public static void imprimePalavras(String... nomes) {
    for (String palavra : nomes) {
      System.out.println(palavra);
    }
  }
}
