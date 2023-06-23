package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.FabricaConexao;
import modelo.Pessoa;

public class PessoaDAO implements IPessoaDAO {
	private Connection conexao;
	
	@Override
	public List<Pessoa> listarTodos() {
		conexao = FabricaConexao.getConexao();
		List<Pessoa> lista = new ArrayList<>();
		
		try {
			String sql = "SELECT * FROM pessoa";
			PreparedStatement stmt = this.conexao.prepareStatement(sql);
			
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Pessoa p = new Pessoa();
				
				p.setId_pessoa(rs.getInt("id_pessoa"));
				p.setNome_pessoa(rs.getString("nome_pessoa"));
				p.setData_nascimento(rs.getDate("data_nascimento"));
				p.setSalario(rs.getBigDecimal("salario"));
				
				lista.add(p);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			FabricaConexao.fechaConexao();
		}
		return lista;
	}
	
	@Override
	public void adicionar(Pessoa p) {
		conexao = FabricaConexao.getConexao();
		
		try {
			String sql = "INSERT INTO pessoa (nome_pessoa, data_nascimento,salario) "
						 + " VALUES (?, ?, ?)";
			PreparedStatement stmt = this.conexao.prepareStatement(sql);
				
			stmt.setString(1, p.getNome_pessoa());
			stmt.setDate(2, p.getData_nascimento());
			stmt.setBigDecimal(3, p.getSalario());
			
			stmt.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			FabricaConexao.fechaConexao();
		}
	}

	@Override
	public void alterar(Pessoa p) {
		conexao = FabricaConexao.getConexao();
		
		try {
			String sql = "UPDATE pessoa SET nome_pessoa =?, data_nascimento=?, salario=? "
						 + " WHERE id_pessoa=?";
			
			PreparedStatement stmt = this.conexao.prepareStatement(sql);

			stmt.setString(1, p.getNome_pessoa());
			stmt.setDate(2, p.getData_nascimento());
			stmt.setBigDecimal(3, p.getSalario());
			stmt.setInt(4, p.getId_pessoa());
			
			stmt.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			FabricaConexao.fechaConexao();
		}
	}

	@Override
	public void excluir(Integer id) {
		conexao = FabricaConexao.getConexao();
		
		try {
			String sql = "DELETE FROM pessoa WHERE id_pessoa=?";
			
			PreparedStatement stmt = this.conexao.prepareStatement(sql);
			stmt.setInt(1, id);
			
			stmt.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			FabricaConexao.fechaConexao();
		}
	}

	@Override
	public Pessoa buscarPorId(Integer id) {
		conexao = FabricaConexao.getConexao();
		Pessoa p = null;
		
		try {
			String sql = "SELECT * FROM pessoa WHERE id_pessoa=?";
			
			PreparedStatement stmt = this.conexao.prepareStatement(sql);
			stmt.setInt(1, id);
			
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				p = new Pessoa();
				
				p.setId_pessoa(rs.getInt("id_pessoa"));
				p.setNome_pessoa(rs.getString("nome_pessoa"));
				p.setData_nascimento(rs.getDate("data_nascimento"));
				p.setSalario(rs.getBigDecimal("salario"));
			}
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			FabricaConexao.fechaConexao();
		}
		return p;
		
		
	}


}