package atividade;

public abstract class Pessoa {
	private String nome;
	
	public void imprimeDados() {
		
	};

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}


	
	
}
