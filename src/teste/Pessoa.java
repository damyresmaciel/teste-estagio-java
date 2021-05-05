package teste;

public class Pessoa {

	private int id;
	private String nome;
	private String sobrenome;
	private int idade;

	public Pessoa(int id, String nome, String sobrenome, int idade) {
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String imprime() {
		return "id: " + this.getId() + ", Nome:  " + this.getNome() + ", Sobrenome: " + this.getSobrenome() + ", Idade: " + this.getIdade();
	}

	public String toString() {
		return "Olá, " + this.nome.substring(0, 1).toUpperCase().concat(this.nome.substring(1)) + " " + this.sobrenome;
	}

	public String imprimirDados() {
		return this.nome.substring(0, 1).toUpperCase().concat(this.nome.substring(1)) + " "
				+ this.sobrenome.substring(0, 1).toUpperCase().concat(this.nome.substring(1)) + " " + "com " + this.idade + " anos de idade.";
	}

}
