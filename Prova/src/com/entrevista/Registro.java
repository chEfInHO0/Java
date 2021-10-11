package com.entrevista;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Registro {
	private String nome;
	private String rua;
	private ArrayList<String> resp;
	private Date dataEntrevista = new Date();
	SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public Date getDataEntrevista() {
		return dataEntrevista;
	}
	public String getDataEntrevistaSTR() {
		return f.format(dataEntrevista);
	}
	public void setDataEntrevista(Date dataEntrevista) {
		this.dataEntrevista = dataEntrevista;
	}
	public void inserirDados() throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nome do Entrevistado para a busca: ");
		String n = sc.nextLine();
		if (n.equalsIgnoreCase("sair")){
			setNome(n);
		}else {
			setNome(n);
			setDataEntrevista(dataEntrevista);
		
	}
}
	public ArrayList<String> getResp() {
		return resp;
	}
	public void setResp(ArrayList<String> listaRespostas) {
		this.resp = listaRespostas;
	}
	public String info() {
		return "Nome: " + this.nome + "\nEndereco: " + this.rua + "\nData: " + this.getDataEntrevistaSTR();
	}
}