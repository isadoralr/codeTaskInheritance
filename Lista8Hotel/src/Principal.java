import model.Cozinheira;
import model.FazTudo;
import model.Gerente;
import model.Mensageiro;
import model.Recepcionista;

public class Principal {
	public static void main(String[] args) {
		Recepcionista Luisa = new Recepcionista("Luísa Matos","(49)991254786", "022.332.547-12");
		System.out.println(Luisa.toString());
		Luisa.atender();
		Luisa.falarIngles();
		System.out.println("------------------------------------------------------------------------------------------------------------------------------");
		Gerente maria = new Gerente("Maria Silva","(49)991254665","215.325.845-14");
		System.out.println(maria.toString());
		maria.atender();
		maria.falarIngles();
		maria.arrumarACama();
		maria.limparQuarto();
		System.out.println("------------------------------------------------------------------------------------------------------------------------------");
		Cozinheira Lurdes = new Cozinheira("Lurdes Santos","(49)991274782","687.345.246-21");
		System.out.println(Lurdes.toString());
		Lurdes.cozinhar();
		Lurdes.lavarLouça();
		Lurdes.limparCozinha();
		System.out.println("------------------------------------------------------------------------------------------------------------------------------");
		Mensageiro Cleber = new Mensageiro("Cleber Prestes","(49)992548746","327.574.549-23");
		System.out.println(Cleber.toString());
		Cleber.carregarBagagens();
		Cleber.checarQuartos();
		System.out.println("------------------------------------------------------------------------------------------------------------------------------");
		FazTudo Joao = new FazTudo("João Souza","(49)991547862","548.564.566-12");
		System.out.println(Joao.toString());
		Joao.ajudarLimpeza();
		Joao.arrumarACama();
		Joao.atender();
		Joao.carregarBagagens();
		Joao.checarQuartos();
		Joao.consertar();
		Joao.cozinhar();
		Joao.falarIngles();
		Joao.fazerManutenção();
		Joao.lavarLouça();
		Joao.limparCozinha();
		Joao.limparQuarto();
		
	}
}
