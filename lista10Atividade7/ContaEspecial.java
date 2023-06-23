package lista10Atividade7;

public class ContaEspecial extends ContaCorrente {
	private float limite;

	public ContaEspecial(float saldo, float limite) {
		super(saldo);
		this.limite = limite;
	}
	@Override
	public boolean sacar(float valor) {
		if (valor <= limite + this.saldo) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "ContaEspecial [limite=" + limite + "]";
	}
}
