package model;

import interfaces.ICamareira;
import interfaces.IRecepcionista;

public class Gerente extends Pessoa implements IRecepcionista, ICamareira {

	public Gerente(String nome, String telefone, String cpf) {
		super(nome, telefone, cpf);
	}

	@Override
	public void atender() {
		System.out.println("Atendo os clientes mais ou menos.");
	}
	
	@Override
	public void falarIngles() {
		System.out.println("Falo inglês muito bem!");
	}
	
	@Override
	public String toString() {
		return "|Gerente " + nome + "|";
	}

	@Override
	public void arrumarACama() {
		System.out.println("Posso arrumar camas, caso seja necessário.");
	}

	@Override
	public void limparQuarto() {
		System.out.println("Limpo os quartos, caso seja necessário.");
	}

	
}
