package atividade;

public class TestaCadastro extends CadastroPessoas{
	public static void main(String[] args) {
		Cliente cliente = new Cliente("Luísa Almeida", 15487852);
		Funcionario funcionario = new Funcionario("Pedro dos Santos", 1800);
		Gerente gerente = new Gerente("João da Silva", 2500,"Almoxarifado");
		cadastrapessoa(cliente.verDados());
		cadastrapessoa(funcionario.verDados());
		cadastrapessoa(gerente.verDados());
		imprimecadastro();
	// Fiz de outra forma, não consegui utilizar os objetos das outras classes como parâmetro do tipo Pessoa então fiz outro procedimento de dados, mas com retorno e utilizei como parâmetro. Não aprendi arraylist com objetos, muito menos com diferentes classes, foi passado o básico, fiz pergunta para o professor mas ele não respondeu (o que acontece toda vez).
	}
}
