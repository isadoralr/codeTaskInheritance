package lista10Atividade7;

public class TesteContaCorrente {

	public static void main(String[] args) {
		Cliente luis = new Cliente("Luís");
		ContaCorrente contaluis = new ContaCorrente(5000);
		luis.contas.add(contaluis);
		contaluis.depositar(1500);
		if (contaluis.sacar(6500) == true ) {
			System.out.println("Saque realizado.");
		}else {
			System.out.println("Saldo insuficiente.");
		}
	}

}
