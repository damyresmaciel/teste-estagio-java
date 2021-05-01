package teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio_07 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    List<Integer> numeros = new ArrayList<Integer>();

    int numero;
    for (int i = 0; i < 3; i++) {
      System.out.println("Entre com o número: ");
      numeros.add(numero = scan.nextInt());
    }
    if (populaArrayFibonacci().containsAll(numeros)) {
      System.out.println("Contém");
    }else {
      System.out.println("Não contém");
    }
    scan.close();
  }

  public static List<Integer> populaArrayFibonacci() {
    List<Integer> fibonacci = new ArrayList<>();
    for (int i = 0; i < 30; i++) {
      fibonacci.add(fibonacci(i));
    }
    return fibonacci;
  }

  public static int fibonacci(int num) {
    for (int i = 0; i < 100; i++) {
      if (num < 2) {
        return 1;
      }
    }
    return fibonacci(num - 1) + fibonacci(num - 2);
  }
  
}
