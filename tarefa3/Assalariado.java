package tarefa3;

public class Assalariado extends Empregado{
	private double salario;

	@Override
	public double vencimento() {
		return this.getSalario();
	}

	@Override
	public String toString() {
		return super.toString()+" Assalariado | Salário:" + salario + "|";
	}


	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Assalariado(String nome, String sobrenome, String cpf, double salario) {
		super(nome, sobrenome, cpf);
		this.salario = salario;
	}

}
