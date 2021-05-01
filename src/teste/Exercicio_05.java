package teste;

public class Exercicio_05 {

  public static void main(String[] args) {

    System.out.println(imprimeTexto("T35t3 d3 35t4g1o"));

  }

  public static String imprimeTexto(String texto) {
    return texto.replaceAll("4", "a").replaceAll("3", "e").replaceAll("1", "i")
        .replaceAll("5", "s");
  }
}
