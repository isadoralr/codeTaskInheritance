package dao;

import java.util.List;

import modelo.Pessoa;

public interface IPessoaDAO {
	void adicionar(Pessoa p);
	void alterar(Pessoa p);
	void excluir(Integer id);
	List<Pessoa> listarTodos();
	Pessoa buscarPorId(Integer id);
}