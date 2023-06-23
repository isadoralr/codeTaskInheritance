package tarefa2;

public class Funcionarios {

	public static void main(String[] args) {
		Funciomae ne = new Funciomae("Roberto",215487);
		Funciomae ef = new Funciomae("Cláudio","Escola Laranjeira",278442);
		Funciomae eb = new Funciomae("Thiago","Escola Padre Luís",358784);
		Funciomae es = new Funciomae("Eduardo","Escola São Pedro","USP",487482);
		ne.informacoes(ne.getNome(), ne.getCodigo());
		ef.informacoes(ef.getNome(), ef.getEscola(), ef.getCodigo());
		eb.informacoes(eb.getNome(), eb.getEscola(), ef.getCodigo());
		es.informacoes(es.getNome(), es.getEscola(), ef.getUniversidade(), ef.getCodigo());
	}

}
