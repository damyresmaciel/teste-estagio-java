package teste;

import java.util.Arrays;
import java.util.List;

public class Exercicio_11 {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa(1, "josé", "da silva", 42);
		Pessoa p2 = new Pessoa(2, "joão", "gonçalves", 21);
		Pessoa p3 = new Pessoa(3, "pedro", "garcia", 28);
		Pessoa p4 = new Pessoa(4, "matheus", "pinheiro", 21);

		List<Pessoa> pessoas = Arrays.asList(p1, p2, p3, p4);

		for (Pessoa p : pessoas) {
			if (p.getIdade() < 30) {
				System.out.println(p.imprimirDados());
			}
		}

	}

}
