package model;
import interfaces.IMensageiro;
public class Mensageiro extends Pessoa implements IMensageiro{

	public Mensageiro(String nome, String telefone, String cpf) {
		super(nome, telefone, cpf);
	}
	@Override
	public void carregarBagagens() {
	System.out.println("Carrego as bagagens dos clientes para os quartos, após serem recepcionados.");
	}
	@Override
	public void checarQuartos() {
	System.out.println("Verifico as condições dos quartos para certificar que estão em boas condições para receber clientes. Caso não estejam, comunico o gerente.");
	}
	@Override
	public String toString() {
		return "|Mensageiro " + nome + "|";
	}
	
}
