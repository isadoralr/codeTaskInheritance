package atividade;

public class Gerente extends Funcionario{
	private String area;
	@Override
	public void imprimeDados() {
	this.imprimeDados();
	System.out.print(" | Área: "+this.getArea());
	}
	public String verDados() {
		return super.verDados()+" | Área: "+this.getArea() ;
		}

	@Override
	public float calculaImposto(){
		return this.getSalario()*5/100;
	}
	public Gerente(String nome, float salario, String area) {
		super(nome, salario);
		this.area = area;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
}
