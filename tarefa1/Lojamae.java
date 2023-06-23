package tarefa1;

public abstract class Lojamae {
	private String nome;
	private double preco;
	
	@Override
	public String toString() {
		return "Nome: " + this.getNome() + " | Preço:" + this.getPreco()+"R$ |";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public Lojamae(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}
	
	
}
