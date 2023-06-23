package exericicio;

public class Docente extends Funcionario {
	private Integer nivel;
	private String titulacao;
	
	public double Calcularsalario(){
		return this.getSalario()+ this.getNivel();
}

	public Integer getNivel() {
		return nivel;
	}

	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
}