package teste;

public class Exercicio_01 {

	public static void main(String[] args) {
		String comparacao = comparaPalavra("oculos", "oculos");
		System.out.println(comparacao);
	}

	public static String comparaPalavra(String palavra1, String palavra2) {
		if (palavra1.length() > palavra2.length()) {
			return "A palavra " + palavra1 + " é maior. ";
		}
		if (palavra1.length() < palavra2.length()) {
			return "A palavra " + palavra2 + " é maior. ";
		}
		return "As palavras tem o mesmo tamanho. ";
	}
}
