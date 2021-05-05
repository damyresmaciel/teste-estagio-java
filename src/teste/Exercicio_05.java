package teste;

public class Exercicio_05 {

	public static void main(String[] args) {
		System.out.println(imprimeTexto("T35t3 d3 35t4g1o"));
	}

	public static String imprimeTexto(String texto) {
		return texto.replace("4", "a").replace("3", "e").replace("1", "i").replace("5", "s");
	}
}
