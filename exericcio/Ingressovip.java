package exericcio;

public class Ingressovip extends Ingresso{

	private float valoradicional;

	public float getValoradicional() {
		return valoradicional;
	}

	public void setValoradicional(float valoradicional) {
		this.valoradicional = valoradicional;
	}
	
	public float valoringresso() {
		return this.getValor() + this.getValoradicional(); 
	}
	public String toString(){
		return valoringresso() + "bunda";
	}
}
