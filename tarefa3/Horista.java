package tarefa3;

public class Horista extends Empregado{
	private double precohora,horastrabalhadas;

	@Override
	public double vencimento() {
		return this.getPrecohora()*this.getHorastrabalhadas();
	}
	
	@Override
	public String toString() {
		return super.toString()+" Horista | Preço hora: " + precohora + "R$ | Horas trabalhadas: " + horastrabalhadas + "| Salário: "+this.vencimento();
	}


	public double getPrecohora() {
		return precohora;
	}

	public void setPrecohora(double precohora) {
		this.precohora = precohora;
	}

	public double getHorastrabalhadas() {
		return horastrabalhadas;
	}

	public void setHorastrabalhadas(double horastrabalhadas) {
		this.horastrabalhadas = horastrabalhadas;
	}

	public Horista(String nome, String sobrenome, String cpf, double precohora, double horastrabalhadas) {
		super(nome, sobrenome, cpf);
		this.precohora = precohora;
		this.horastrabalhadas = horastrabalhadas;
	}

	
	
	
}
