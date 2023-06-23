package exericicio2;

public class Vendedor extends Empregado {
 private Float comissão;
 private float salariosem;

 
 public Vendedor(float comissão,String nome,float salario) {
	super();
	super.setNome(nome);
	this.comissão = comissão;
	super.setSalario(salario);
}

public Float getComissão() {
	return comissão;
}

@Override
public String toString() {
	return "Vendedor [comissão="+ getComissão() + ", Nome=" + getNome()
			+ ", Salario=" + getSalario() + ", salario sem comissão= " + salariosem + "]";
}

public void setComissão(Float comissão) {
	this.comissão = comissão;
}
public float calcularSalario(){
	salariosem = super.getSalario();
	super.setSalario(super.getSalario()+this.getComissão()*super.getSalario()/100);
	return super.getSalario();
	
}
}
