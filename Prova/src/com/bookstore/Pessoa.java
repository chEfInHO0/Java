package com.bookstore;

import javax.swing.JOptionPane; 

public class Pessoa {
	private String nome;
	private String cpf;
	private String endereco;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public void inserirDados() {
		String nome = JOptionPane.showInputDialog("Nome :  ");
		String cpf = JOptionPane.showInputDialog("CPF :  ");
		while (cpf.length() != 11) {
			JOptionPane.showMessageDialog(null, "Este CPF é inválida, tente novamente");
			cpf = JOptionPane.showInputDialog("CPF :  ");
		}
		String endereco = JOptionPane.showInputDialog("Endereço :  ");
		setNome(nome);
		setCpf(cpf);
		setEndereco(endereco);
	}
	public String info() {
		return "\nNome : "+this.nome+"\nCPF : "+this.cpf+"\nEndereço : "+this.endereco;
	}
}
