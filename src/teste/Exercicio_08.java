package teste;

import java.util.ArrayList;
import java.util.List;

public class Exercicio_08 {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa(1, "josé", "da silva", 42);
		Pessoa p2 = new Pessoa(2, "joão", "gonçalves", 21);
		Pessoa p3 = new Pessoa(3, "pedro", "garcia", 28);
		Pessoa p4 = new Pessoa(4, "matheus", "pinheiro", 21);

		List<Pessoa> pessoas = new ArrayList<>();

		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		pessoas.add(p4);

		for (Pessoa p : pessoas) {
			System.out.println(p.toString());
		}

	}
}
