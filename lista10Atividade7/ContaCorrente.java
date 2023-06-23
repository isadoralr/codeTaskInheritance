package lista10Atividade7;

public class ContaCorrente {
	protected float saldo;

	public ContaCorrente() {
		super();
	}

	public ContaCorrente(float saldo) {
		super();
		this.saldo = saldo;
	}

	public void depositar(float valor) {
		this.saldo = this.saldo + valor;
		System.out.println("Depósito realizado.");
	}

	public boolean sacar(float valor) {
		if (valor <= saldo) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "ContaCorrente [saldo=" + saldo + "]";
	}

}
