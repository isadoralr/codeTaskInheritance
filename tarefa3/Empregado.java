package tarefa3;

public abstract class Empregado {
	private String nome,sobrenome,cpf;
	public abstract double vencimento();
	
	
	@Override
	public String toString() {
		return nome +" "+ sobrenome + " | CPF:" + cpf + " |";
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public Empregado(String nome, String sobrenome, String cpf) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
	}
	
	
}
