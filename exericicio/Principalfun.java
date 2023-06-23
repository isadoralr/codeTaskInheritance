package exericicio;

public class Principalfun {

	public static void main(String[] args) {
		Tecnico tecnico = new Tecnico();
		Docente docente = new Docente();
		tecnico.setFuncao("vagabundo");
		tecnico.setNome("Pedro");
		tecnico.setSalario(2000);
		tecnico.setHoraextra(10);
		docente.setNivel(8);
		docente.setSalario(2500);
		docente.setTitulacao("Pobre");
		docente.setNome("Joao");
		System.out.println("O funcionario "+tecnico.getNome()+" que é "+tecnico.getFuncao()+", recebe:"+tecnico.Calcularsalario());
		System.out.println();
		System.out.println("O funcionario "+docente.getNome()+" que é "+docente.getTitulacao()+", recebe:"+docente.Calcularsalario());
		
	}

}
