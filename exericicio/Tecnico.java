package exericicio;

public class Tecnico extends Funcionario {
	private String funcao;
	private double horaextra;
	
	public double Calcularsalario(){
		return this.getSalario() + this.getHoraextra();

}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public double getHoraextra() {
		return horaextra;
	}

	public void setHoraextra(double horaextra) {
		this.horaextra = horaextra;
	}
}
