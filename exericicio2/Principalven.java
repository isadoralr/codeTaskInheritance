package exericicio2;

public class Principalven {

	public static void main(String[] args) {
		Vendedor vendedor = new Vendedor(10,"Wilson",1500);
		Gerente gerente = new Gerente("Vendas",5000,"Joelson");
		vendedor.calcularSalario();
		System.out.println(gerente.toString());
		System.out.println(vendedor.toString());

	}

}
