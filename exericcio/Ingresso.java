package exericcio;

public class Ingresso {

	private float valor = 100;

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	public String tString(){
		return "évei " + this.getValor();
	}
}
