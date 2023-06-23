package atividade;

public class Funcionario extends Pessoa{
	private float Salario;
	

	public void imprimeDados() {
		System.out.println("Nome do funcionário: "+this.getNome()+" | Salário: R$"+this.getSalario()+" | Imposto: R$"+this.calculaImposto()+" | Salário com imposto: R$"+(this.calculaImposto()-this.getSalario()));
		
	}
	public String verDados() {
		return "Nome do funcionário: "+this.getNome()+" | Salário: R$"+this.getSalario()+" | Imposto: R$"+this.calculaImposto()+" | Salário com imposto: R$"+(this.getSalario()-this.calculaImposto());
		
	}
	public float calculaImposto() {
		return this.getSalario()*3/100;
	}
	
	public float getSalario() {
		return Salario;
	}
	public void setSalario(float salario) {
		Salario = salario;
	}
	public Funcionario(String nome, float salario) {
		super(nome);
		Salario = salario;
	}
	
	
}
