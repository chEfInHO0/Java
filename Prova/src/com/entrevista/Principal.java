package com.entrevista;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class Principal {
	static SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
	static Scanner sc = new Scanner(System.in);
	static Perguntas p = new Perguntas();
	static ArrayList<Perguntas> listaPerguntas = new ArrayList<Perguntas>();
	static Entrevistado e = new Entrevistado();
	static ArrayList<Entrevistado> listaEntrevistados = new ArrayList<Entrevistado>();
	static Registro r = new Registro();
	static ArrayList<Registro> listaRegistros = new ArrayList<Registro>();
	static ArrayList<String> listaRespostas = new ArrayList<String>();
	public static void main(String [] args) throws ParseException {
		System.out.println("[0] - Sair \n[1] - Cadastro de Entrevistado \n[2] - Cadastro de Perguntas "
				+ "\n[3] - Cadastro de Respostas \n[4] - Consulta de Entrevistados \n[5] - Consulta de Perguntas "
				+ "\n[6] - Relatório de Entrevistas");
		int c = sc.nextInt();
		while(c != 0) {
			switch(c) {
			case 0 :
				System.out.println("Volte Sempre!");
				break;
			case 1 :
				System.out.println("#####");
				System.out.println("Cadastro de Entrevistado");
				System.out.println("#####");
				cadastroEntrevistado();
				break;
			case 2:
				System.out.println("#####");
				System.out.println("Cadastro de Perguntas");
				System.out.println("#####");
				cadastroPergunta();
				break;
			case 3:
				System.out.println("#####");
				System.out.println("Cadastro de Respostas");
				System.out.println("#####");
				if (listaEntrevistados.size() == 0) {
					System.out.println("Ainda não há nenhum entrevistado cadastrado");
					System.out.println("Tente Novamente com a opção 1");
					break;	
				}else if (listaPerguntas.size() == 0) {
					System.out.println("Ainda não há nenhuma pergunta cadastrada");
					System.out.println("Tente Novamente com a opção 2");
					break;	
				}else{
					responderPerguntas();
					break;	
				}
			case 4:
				System.out.println("#####");
				System.out.println("Consulta de Entrevistados");
				System.out.println("#####");
				if (listaEntrevistados.size() == 0) {
					System.out.println("Ainda não há nenhum entrevistado cadastrado");
					System.out.println("Tente Novamente com a opção 1");
					break;	
				}else {
					consultaEntrevistado();
					break;
				}
			case 5:
				System.out.println("#####");
				System.out.println("Consulta de Perguntas");
				System.out.println("#####");
				if (listaPerguntas.size() == 0) {
					System.out.println("Ainda não há nenhuma pergunta cadastrada");
					System.out.println("Tente Novamente com a opção 2");
					break;	
				}else {
					consultaPerguntas();
					break;
				}
			case 6:
				System.out.println("#####");
				System.out.println("Relatório de Entrevistas");
				System.out.println("#####");
				if (listaEntrevistados.size() == 0) {
					System.out.println("Ainda não há nenhum entrevistado cadastrado");
					System.out.println("Tente Novamente com a opção 1");
					break;	
				}else if (listaPerguntas.size() == 0) {
					System.out.println("Ainda não há nenhuma pergunta cadastrada");
					System.out.println("Tente Novamente com a opção 2");
					break;	
				}else {
					relatorioEntrevistas();
					break;
				}
			default:
				System.out.println("Opção inválida");
			}
			System.out.println("[0] - Sair \n[1] - Cadastro de Entrevistado \n[2] - Cadastro de Perguntas "
					+ "\n[3] - Cadastro de Respostas \n[4] - Consulta de Entrevistados \n[5] - Consulta de Perguntas "
					+ "\n[6] - Relatório de Entrevistas");
			c = sc.nextInt();
		}
	}
	public static void cadastroPergunta() {
		do {
			int controle = 0;
			Perguntas perg = new Perguntas();
			if (listaPerguntas.size() == 0){
				int id = 0;
				p.setId(id);
			}else {
				int id = listaPerguntas.size();
				p.setId(id);
			}
			p.inserirDados();
				for (int c = 0;c<listaPerguntas.size();c++){
					if (p.getDescricao().equalsIgnoreCase(listaPerguntas.get(c).getDescricao())) {
						controle++;
						System.out.println("Pergunta ja adicionada");
					}else {
						
				}
				}
			if (p.getDescricao().equalsIgnoreCase("sair")){
				
			}else if (controle == 0){
				perg.setId(p.getId());
				perg.setDescricao(p.getDescricao());
				listaPerguntas.add(perg);
			}else {
				
			}
	}while(!p.getDescricao().equalsIgnoreCase("sair"));
	}
	public static void consultaPerguntas() {
		for(Perguntas p : listaPerguntas){
			   System.out.println(p.info());
			}
	}
	public static void cadastroEntrevistado() {
		do {
			int controle = 0;
			boolean v,vv,vvv;
			System.out.println("Digite 'sair' para encerrar o cadastro de Entrevistado");
			e.inserirDados();
			Entrevistado entrevistado = new Entrevistado();
			if (listaEntrevistados.size() == 0){
				
			}else {
				for (int c = 0;c<listaEntrevistados.size();c++){
					v = e.getNome().equalsIgnoreCase(listaEntrevistados.get(c).getNome());
					vv = e.getEndereco().equalsIgnoreCase(listaEntrevistados.get(c).getEndereco());
					vvv = e.getNumero() == listaEntrevistados.get(c).getNumero();
					if(v == true && vv == true && vvv == true){
						controle++;
						System.out.println("Entrevistado já cadastrado");
					}else {
					}
				}
			}
			if (e.getNome().equalsIgnoreCase("sair")){
				
			}else {
				if (controle == 0){
					entrevistado.setNome(e.getNome());
					entrevistado.setEndereco(e.getEndereco());
					entrevistado.setNumero(e.getNumero());
					listaEntrevistados.add(entrevistado);
					System.out.println("Entrevistado Cadastrado");
				}else {
					
				}
			}
		}while(!e.getNome().equalsIgnoreCase("sair"));
	}
	public static void consultaEntrevistado() {
		int controle = 0;
		System.out.println("Digite a rua para a pesquisa de Entrevistados (0 para mostrar todos os entrevistados / digite 'sair' para encerrar a busca)");
		String option = sc.next();
		do {
			
			if (option.equals("0")){
				for(Entrevistado e : listaEntrevistados){
					   System.out.println(e.info());
				}
			}else if(!option.equals("0")) {
				for (int c = 0;c<listaEntrevistados.size();c++){
					if(listaEntrevistados.get(c).getEndereco().equalsIgnoreCase(option)) {
						System.out.println(listaEntrevistados.get(c).info());
					}else {
						controle++;
					}
				}
				if (controle == listaEntrevistados.size()) {
					System.out.println("Nenhum Entrevistado cadastrado neste endereço");
				}else {
				}
			}
			System.out.println("Digite a rua para a pesquisa de Entrevistados (0 para mostrar todos os entrevistados)");
			option = sc.next();
	}while(!option.equalsIgnoreCase("sair"));
	}
	public static void responderPerguntas() throws ParseException {
		int controle = 0;
		r.inserirDados();
		Registro reg = new Registro();
		for (int c = 0;c<listaEntrevistados.size();c++){ 
			if (listaEntrevistados.get(c).getNome().equalsIgnoreCase(r.getNome())){
				for (int i = 0;i<listaPerguntas.size();i++){ 
					if (controle >= listaPerguntas.size()) {
					}else {
						String rua = listaEntrevistados.get(c).getEndereco();
						int numero = listaEntrevistados.get(c).getNumero();
						String a = rua +" "+ numero;
						r.setRua(a);
						String perg = listaPerguntas.get(i).getDescricao();
						System.out.println(perg);
						System.out.println("Resposta: ");
						String resp = sc.next();
						while(!resp.equalsIgnoreCase("sim") && !resp.equalsIgnoreCase("nao")) {
							System.out.println("Resposta Invalida [sim / nao]");
							System.out.println("Resposta: ");
							resp = sc.next();
						}
						String f = perg+"\n"+resp;
						listaRespostas.add(f);
						controle++;
					}
				}
				
			}else {
				
			}
		}
		if (controle == 0){
			System.out.println("Nome não encontrado no cadastro");
		}else {
			reg.setNome(r.getNome());
			reg.setRua(r.getRua());
			reg.setResp(listaRespostas);
			listaRespostas = new ArrayList<String>();
			reg.setDataEntrevista(r.getDataEntrevista());
			listaRegistros.add(reg);
		}
	}
	public static void relatorioEntrevistas() throws ParseException {
		System.out.println("Informe a data para a busca");
		String d = sc.next();
		Date data = f.parse(d);
		for (int a = 0;a<listaRegistros.size();a++){
			if (listaRegistros.get(a).getDataEntrevistaSTR().equals(f.format(data))){
				System.out.println("#####");
				System.out.println(listaRegistros.get(a).info());
				for (int b = 0;b<listaRegistros.get(a).getResp().size();b++){
					System.out.println(listaRegistros.get(a).getResp().get(b));
				}
				System.out.println("#####");
			}
		}
	}
}