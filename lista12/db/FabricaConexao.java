package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {
		private static Connection conexao = null;
		
		private FabricaConexao() { }
		
		public static Connection getConexao() {
			try {
				String url = "jdbc:mysql://localhost/unoesc_trabalho_CRUD";
				String usuario = "root";
				String senha = "root";
				
				conexao = DriverManager.getConnection(url, usuario, senha);
				System.out.println("==============================\nConexão realizada com sucesso!\n==============================");
				
				return conexao;
			} catch (SQLException e) {
				throw new RuntimeException(e.getMessage());
			}
			
		}
		
		public static void fechaConexao() {
			if (conexao != null) {
				try {
					conexao.close();
				} catch (SQLException e) {
					throw new RuntimeException(e.getMessage());
				}
			}
		}
	}
