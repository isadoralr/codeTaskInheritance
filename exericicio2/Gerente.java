package exericicio2;

public class Gerente extends Empregado {
	private String departamento;

	public Gerente(String departamento,float salario,String nome) {
		super();
		super.setNome(nome);
		super.setSalario(salario);
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Gerente [Departamento=" + getDepartamento() + ", Nome=" + getNome() + ", Salario="
				+ getSalario() + "]";
		//ou return super.
	}




	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
}
