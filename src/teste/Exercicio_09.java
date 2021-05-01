package teste;

public class Exercicio_09 {

  public static void main(String[] args) {

    Pessoa p1 = new Pessoa(1, "josé", "da silva", 42);
    Pessoa p2 = new Pessoa(2, "joão", "gonçalves",21);
    Pessoa p3 = new Pessoa(3, "pedro", "garcia", 28);
    Pessoa p4 = new Pessoa(4,"matheus", "pinheiro",21);
    
    int soma= p1.getIdade() + p2.getIdade() +p3.getIdade() +p4.getIdade();
    
    System.out.println(soma);
    
    
  }

}
