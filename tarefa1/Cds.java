package tarefa1;

public class Cds extends Lojamae{
	private int numfaixas;
	
	@Override
	public String toString() {
		return super.toString()+" Número de faixas:" + this.getNumfaixas() + " |";
	}

	public int getNumfaixas() {
		return numfaixas;
	}

	public void setNumfaixas(int numfaixas) {
		this.numfaixas = numfaixas;
	}

	public Cds(String nome, double preco, int numfaixas) {
		super(nome, preco);
		this.numfaixas = numfaixas;
	}
	
}
