package com.entrevista;

import java.util.Scanner;

public class Perguntas {
	private int id;
	private String descricao;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void inserirDados() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ID: ");
		int id = sc.nextInt();
		if (id < 0){
			setId(id);
		}else {
			System.out.println("Descrição: ");
			String desc = sc.next();
			setId(id);
			setDescricao(desc);
		}
	}
	public String info() {
		return "ID: "+this.id+" "+"Pergunta: "+ this.descricao;
	}
}
