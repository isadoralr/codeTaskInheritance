package model;

import interfaces.IRecepcionista;

public class Recepcionista extends Pessoa implements IRecepcionista {

	public Recepcionista(String nome, String telefone, String cpf) {
		super(nome, telefone, cpf);
	}

	@Override
	public void atender() {
		System.out.println("Recebo clientes no hotel.");
	}

	@Override
	public void falarIngles() {
		System.out.println("Falo inglês básico.");
	}

	@Override
	public String toString() {
		return "|Recepcionista "+nome+"|";
	}

}
