package tarefa3;

public class Comissionado extends Empregado{
	private double totalvenda,taxacomissao;

	@Override
	public double vencimento() {
		return this.getTaxacomissao()*this.getTotalvenda();
	}

	@Override
	public String toString() {
		return super.toString()+" Comissionado | Total de vendas: " + totalvenda + " | Taxa de comissão: " + taxacomissao + "R$ | Salário: "+this.vencimento();
	}

	public double getTotalvenda() {
		return totalvenda;
	}

	public void setTotalvenda(double totalvenda) {
		this.totalvenda = totalvenda;
	}

	public double getTaxacomissao() {
		return taxacomissao;
	}

	public void setTaxacomissao(double taxacomissao) {
		this.taxacomissao = taxacomissao;
	}

	public Comissionado(String nome, String sobrenome, String cpf, double totalvenda, double taxacomissao) {
		super(nome, sobrenome, cpf);
		this.totalvenda = totalvenda;
		this.taxacomissao = taxacomissao;
	}
	
	
}
