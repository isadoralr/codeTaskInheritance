package lista10Atividade7;

import java.util.ArrayList;

public class Cliente {
	private String nome;
	public Cliente() {};
	
	public ArrayList<ContaCorrente> contas = new ArrayList<ContaCorrente>();

	public Cliente(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + "]";
	}
}
