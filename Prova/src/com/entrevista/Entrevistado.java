package com.entrevista;

import java.util.Scanner;

public class Entrevistado {
	private String nome;
	private String endereco;
	private int numero;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void inserirDados(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Nome: ");
		String n = sc.nextLine();
		if (n.equalsIgnoreCase("sair")){
			setNome(n);
		}else {
			System.out.println("Endereço: ");
			String e = sc.nextLine();
			System.out.println("Numero: ");
			int num = sc.nextInt();
			setNome(n);
			setEndereco(e);
			setNumero(num);
		}
	}
	public String info() {
		return "#####"+"\nNome : "+this.nome +"\nEndereco : "+this.endereco +"\nNumero : "+this.numero+"\n#####"; 
	}
}
