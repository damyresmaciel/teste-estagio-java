package teste;

public class Exercicio_04 {

  public static void main(String[] args) {
    
    System.out.println(removeNumero("teste 1 de 2 string 3 "));
  }
  public static String removeNumero(String frase) {
    return frase = frase.replaceAll("[0-9]+", "remove"); 
  }

}
