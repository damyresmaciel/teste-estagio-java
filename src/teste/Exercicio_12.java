package teste;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exercicio_12 {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa(1, "josé", "da silva", 42);
		Pessoa p2 = new Pessoa(4, "joão", "gonçalves", 21);
		Pessoa p3 = new Pessoa(3, "pedro", "garcia", 28);
		Pessoa p4 = new Pessoa(2, "matheus", "pinheiro", 21);

		List<Pessoa> pessoas = Arrays.asList(p1, p2, p3, p4);

		Collections.sort(pessoas, new comparePorIdade());

		for (Pessoa p : pessoas) {
			System.out.println(p.imprime());
		}
	}
}

class comparePorIdade implements Comparator<Pessoa> {
	public int compare(Pessoa a, Pessoa b) {
		if (a.getIdade() == b.getIdade()) {
			return a.getId() - b.getId();
		}
		return b.getIdade() - a.getIdade();
	}
}
