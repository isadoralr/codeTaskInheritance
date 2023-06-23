package tarefa2;

public class Funciomae {
	private String nome,escola,universidade;
	private double codigo;
	
	public void informacoes(String nome,double codigo) {
		System.out.println(this.getNome()+" | "+this.getCodigo());
	}
	public void informacoes(String nome, String escola, double codigo) {
		System.out.println(this.getNome()+" | "+this.getEscola()+" | "+this.getCodigo());
	}
	public void informacoes(String nome, String escola, String universidade, double codigo){
		System.out.println(this.getNome()+" | "+this.getEscola()+" | "+this.getUniversidade()+" | "+this.getCodigo());
	}
	
	public String getEscola() {
		return escola;
	}

	public void setEscola(String escola) {
		this.escola = escola;
	}

	public String getUniversidade() {
		return universidade;
	}

	public void setUniversidade(String universidade) {
		this.universidade = universidade;
	}

	public Funciomae(String nome, double codigo) {
		super();
		this.nome = nome;
		this.codigo = codigo;
	}

	public Funciomae(String nome, String escola, double codigo) {
		super();
		this.nome = nome;
		this.escola = escola;
		this.codigo = codigo;
	}

	public Funciomae(String nome, String escola, String universidade, double codigo) {
		super();
		this.nome = nome;
		this.escola = escola;
		this.universidade = universidade;
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Funciomae(String nome) {
		super();
		this.nome = nome;
	}

	public double getCodigo() {
		return codigo;
	}

	public void setCodigo(double codigo) {
		this.codigo = codigo;
	}
	
}
