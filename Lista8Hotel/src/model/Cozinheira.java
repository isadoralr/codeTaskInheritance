package model;
import interfaces.ICozinheira;
public class Cozinheira extends Pessoa implements ICozinheira{

	public Cozinheira(String nome, String telefone, String cpf) {
		super(nome, telefone, cpf);
	}

	@Override
	public void cozinhar() {
		System.out.println("Eu cozinho muito bem.");
	}

	@Override
	public void limparCozinha() {
		System.out.println("Eu limpo a cozinha.");
	}

	@Override
	public void lavarLouça() {
		System.out.println("Eu lavo a louça muito bem.");
	}

	@Override
	public String toString() {
		return "|Cozinheira "+nome+"|";
	}
	
}
