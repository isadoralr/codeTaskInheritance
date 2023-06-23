package tarefa1;

public class Livros extends Lojamae{
	private String autor;

	
	@Override
	public String toString() {
		return super.toString()+" Autor:" + this.getAutor() + " |";
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Livros(String nome, double preco, String autor) {
		super(nome, preco);
		this.autor = autor;
	}
	
}
