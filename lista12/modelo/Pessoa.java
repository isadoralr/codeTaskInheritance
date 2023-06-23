package modelo;

import java.math.BigDecimal;
import java.sql.Date;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;

public class Pessoa {
	private Integer id_pessoa;
	private String nome_pessoa;
	private java.sql.Date data_nascimento;
	private BigDecimal salario;
	SimpleDateFormat fd = new SimpleDateFormat("dd/MM/yyyy");
	NumberFormat fm = NumberFormat.getCurrencyInstance();
	public Pessoa() { }
	
	public Pessoa(Integer id_pessoa, String nome_pessoa, Date data_nascimento, BigDecimal salario) {
		super();
		this.id_pessoa = id_pessoa;
		this.nome_pessoa = nome_pessoa;
		this.data_nascimento = data_nascimento;
		this.salario = salario;
	}

	public Integer getId_pessoa() {
		return id_pessoa;
	}

	public void setId_pessoa(Integer id_pessoa) {
		this.id_pessoa = id_pessoa;
	}

	public String getNome_pessoa() {
		return nome_pessoa;
	}

	public void setNome_pessoa(String nome_pessoa) {
		this.nome_pessoa = nome_pessoa;
	}

	public java.sql.Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(java.sql.Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Id................: " + id_pessoa + "\n1- Nome da pessoa.: " + nome_pessoa + "\n2- Data nascimento: "
				+ fd.format(data_nascimento) + "\n3- Salário........: " + fm.format(salario);
	}
}