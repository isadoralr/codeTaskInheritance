package app;

import java.math.BigDecimal;
import java.sql.Date;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import dao.PessoaDAO;
import modelo.Pessoa;

public class Principal {
	public static void main(String[] args) {

		SimpleDateFormat fd = new SimpleDateFormat("dd/MM/yyyy");
		NumberFormat fm = NumberFormat.getCurrencyInstance();
		Scanner sc = new Scanner(System.in);

		PessoaDAO pessoa = new PessoaDAO();

		System.out.println("==========MENU===========");
		System.out.println(
				"1. Incluir pessoa \n2. Alterar pessoa\n3. Excluir pessoa\n4. Listar pessoas\n5. Consultar pessoa\n6. Finalizar programa\nEscolha uma opção [1-6]\n-----------------------");
		int opcao = sc.nextInt();
		while (opcao != 6) {
			switch (opcao) {
			case 1:
				System.out.println("Insira o nome.");
				String nome = sc.next();
				System.out.println("Insira o salário.");
				BigDecimal salario = sc.nextBigDecimal();
				java.sql.Date dataCadastro = Date.valueOf(LocalDate.now());
				System.out.println("Você confirma?\n1.Sim\n2.Não\nEscolha uma opção [1-2]\n----------------------------------------");
				int opcao2 = sc.nextInt();
				switch (opcao2) {
				case 1:
					Pessoa pess = new Pessoa(null, nome, dataCadastro, salario);
					pessoa.adicionar(pess);
					break;
				case 2:
					System.out.println("Cancelando");
					break;
				}
				break;
			case 2:
				System.out.println("Digite o id");
				int id = sc.nextInt();
				Pessoa pess = new Pessoa();
				if (pessoa.buscarPorId(id) != null) {
					System.out.println(pessoa.buscarPorId(id));
					System.out.println("Escolha o campo para alterar, ou digite 4 para sair.\n-----------------");
					int opcao3 = sc.nextInt();
					pess.setNome_pessoa(pessoa.buscarPorId(id).getNome_pessoa());
					pess.setData_nascimento(pessoa.buscarPorId(id).getData_nascimento());
					pess.setSalario(pessoa.buscarPorId(id).getSalario());
					pess.setId_pessoa(pessoa.buscarPorId(id).getId_pessoa());
					switch (opcao3) {
					case 1:
						System.out.println("Digite o novo nome.\n-----------------");
						String nome2 = sc.next();
						pess.setNome_pessoa(nome2);								
						pessoa.alterar(pess);
						break;
					case 2:
						System.out.println("Digite a nova data de nascimento.\n-----------------");
						String dataNascimento = sc.next();
						try {
							long dataHora = fd.parse(dataNascimento).getTime();
							pess.setData_nascimento((new java.sql.Date(dataHora)));
							pessoa.alterar(pess);
						} catch (ParseException e) {
							System.out.println("Formato inválido! Formato é dd/mm/aaaa\n-----------------");
						}
						break;
					case 3:
						System.out.println("Digite o novo salário.");
						BigDecimal salario2 = sc.nextBigDecimal();
						pess.setSalario(salario2);
						pessoa.alterar(pess);
						break;
					case 4:
						System.out.println("Saindo...\n====================");
						break;
					default:System.out.println("Opção inválida. Saindo...\n==========================");
					}
				} else {
					System.out.println("Id não existente. Saindo.\n==========================");
					break;
				}
				break;
			case 3:
				System.out.println("Insira o id da pessoa que deseja apagar.\n----------------------------------------");
				int id2 = sc.nextInt();
				if (pessoa.buscarPorId(id2) != null) {
				pessoa.buscarPorId(id2);
				System.out.println("Você confirma a exclusão?\n1.Sim\n2.Não\nEscolha uma opção [1-2]\n----------------------------------------");
				int opcao4 = sc.nextInt();
				switch (opcao4) {
				case 1:pessoa.excluir(id2);
				case 2:System.out.println("Saindo...\n==========================");
				default:System.out.println("Opção inválida.");
				}
				}
				else {
					System.out.println("Id não existente. Saindo...\n==========================");
					break;
				}
				break;
			case 4:
				List<Pessoa> lista = pessoa.listarTodos();

				System.out.println("Lista de Pessoas");
				System.out.println("-----------------");

				for (Pessoa pessoas : lista) {
					System.out.println("Id.............: " + pessoas.getId_pessoa());
					System.out.println("Nome da pessoa.: " + pessoas.getNome_pessoa());
					System.out.println("Data nascimento: " + fd.format(pessoas.getData_nascimento()));
					System.out.println("Salário........: " + fm.format(pessoas.getSalario()));
					System.out.println();
				}
				break;
			case 5:
				System.out.println("Insira o id da pessoa que deseja buscar.\n-----------------------");
				int id3 = sc.nextInt();
				System.out.println(pessoa.buscarPorId(id3));
				break;
			default:System.out.println("Opção inválida.\n==========================");
			}
			System.out.println("\n===========MENU===========");
			System.out.println(
					"1. Incluir pessoa \n2. Alterar pessoa\n3. Excluir pessoa\n4. Listar pessoas\n5. Consultar pessoa\n6. Finalizar programa\nEscolha uma opção [1-6]\n-----------------------");
			opcao = sc.nextInt();
			
		}
		sc.close();
	}

}
