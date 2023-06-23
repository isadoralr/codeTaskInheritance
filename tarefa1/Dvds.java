package tarefa1;

public class Dvds extends Lojamae{
	private double duracao;

	
	@Override
	public String toString() {
		return super.toString()+" Duração:" + this.getDuracao() + " minutos |";
	}

	public double getDuracao() {
		return duracao;
	}

	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}

	public Dvds(String nome, double preco, double duracao) {
		super(nome, preco);
		this.duracao = duracao;
	}
	
	
}
