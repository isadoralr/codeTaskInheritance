package tarefa3;

public class Empregadoprinc {

	public static void main(String[] args) {
		Assalariado assal = new Assalariado("João", "da Silva", "015.265.885-21", 2500);
		Comissionado com = new Comissionado("Pedro", "Gomes", "157.445.584-14", 20, 400);
		Horista hor = new Horista("Luísa", "Matos", "218.484.234-11", 40, 100);
		System.out.println(assal.toString());
		System.out.println(com.toString());
		System.out.println(hor.toString());
		
	}
}
