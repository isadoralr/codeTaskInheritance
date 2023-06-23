package model;
import interfaces.ICamareira;
import interfaces.ICozinheira;
import interfaces.IFaztudo;
import interfaces.IMensageiro;
import interfaces.IRecepcionista;
public class FazTudo extends Pessoa implements ICamareira,IRecepcionista,ICozinheira,IMensageiro,IFaztudo{

	public FazTudo(String nome, String telefone, String cpf) {
		super(nome, telefone, cpf);
	}

	@Override
	public void arrumarACama() {
		System.out.println("Eu arrumo as camas caso não tenha mais ninguém disponível.");
	}

	@Override
	public void limparQuarto() {
		System.out.println("Eu limpo os quartos caso não tenha mais ninguém disponível.");
	}

	@Override
	public void atender() {
		System.out.println("Eu atendo os clientes caso não tenha mais ninguém disponível.");
	}

	@Override
	public void falarIngles() {
		System.out.println("Eu posso falar inglês mal, caso não tenha mais ninguém disponível.");
	}

	@Override
	public void cozinhar() {
		System.out.println("Eu posso cozinhar mal, caso não tenha mais ninguém disponível.");
	}

	@Override
	public void limparCozinha() {
		System.out.println("Eu posso limpar a cozinha, caso não tenha mais ninguém disponível.");
	}

	@Override
	public void lavarLouça() {
		System.out.println("Eu posso ajudar a lavar a louça, caso não tenha mais ninguém disponível.");
	}

	@Override
	public void carregarBagagens() {
		System.out.println("Eu posso carregar as bagagens, caso não tenha ninguém disponível.");
	}

	@Override
	public void checarQuartos() {
		System.out.println("Eu posso checar as condições dos quartos e informar o gerente, caso não tenha ninguém disponível.");
	}
	
	@Override
	public void fazerManutenção() {
		System.out.println("Realizo manutenção nos quartos, verificando se algo está quebrado ou danificado, ou faço ajustes/mudanças no hotel todo.");
	}
	
	@Override
	public void consertar() {
		System.out.println("Conserto coisas quebradas, aparelhos, o que for necessário.");
	}
	
	@Override
	public void ajudarLimpeza(){
		System.out.println("Quando não tenho outras ocupações, ajudo na limpeza geral do hotel, onde for necessário ajuda.");
	}

	@Override
	public String toString() {
		return "|Faz-Tudo "+nome+"|";
	}
	
}
