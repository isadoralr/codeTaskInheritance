package atividade;

public class Cliente extends Pessoa{
	private int codigo;
	
	public void imprimeDados() {
		System.out.println("Nome do cliente: "+this.getNome()+"| Código:"+this.getCodigo());
	}
	public String verDados() {
		return "Nome do cliente: "+this.getNome()+" | Código: "+this.getCodigo();
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Cliente(String nome, int codigo) {
		super(nome);
		this.codigo = codigo;
	}
	
	
}
