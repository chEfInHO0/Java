package com.bookstore;


public class Aluguel {
	//cpf,id livro,data do emprestimo,data de devolucao
	private String emprestimo;
	private String cpf;
	private int id;
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmprestimo() {
		return emprestimo;
	}
	public void setEmprestimo(String emprestimo) {
		this.emprestimo = emprestimo;
	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
}
	}