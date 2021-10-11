package com.bookstore;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

public class Menu {
	static SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
	static Pessoa p = new Pessoa();
	static ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
	static ArrayList<String> listaCadastro = new ArrayList<String>();
	static Livro l = new Livro();
	static ArrayList<Livro> listaLivros = new ArrayList<Livro>();
	static ArrayList<String> listaCadastroLivro = new ArrayList<String>();
	static Aluguel a = new Aluguel();
	static ArrayList<String> listaAlugados = new ArrayList<String>();
	static ArrayList<Aluguel> listaAluguel = new ArrayList<Aluguel>();
	static ArrayList<String> listaCadastroAlg = new ArrayList<String>();
	public static void app() throws ParseException {
		int option = Integer.parseInt(JOptionPane.showInputDialog(null, "[0] - SAIR \n[1] - Cadastrar Pessoa \n[2] - Consultar Pessoa \n[3] - Cadastrar Livro \n[4] - Consultar Livro \n[5] - Alugar Livro "
				+ "\n[6] - Relatorio dos Alugados \n[7] - Devolução","Menu",JOptionPane.INFORMATION_MESSAGE));
		while(option != 0) {
			switch (option) {
			case 0:
				break;
			case 1:
				cadastroPessoa();
				break;
			case 2:
				consultaPessoa();
				break;
			case 3:
				cadastroLivro();
				break;
			case 4:
				consultaLivros();
				break;
			case 5:
				alugarLivro();
				break;
			case 6:
				relatorioAlugados();
				break;
			case 7:
				devolucaoLivro();
				break;
			default:
				JOptionPane.showMessageDialog(null, "OP INVALIDA");
				break;
			}
			option = Integer.parseInt(JOptionPane.showInputDialog(null, "[0] - SAIR \n[1] - Cadastrar Pessoa \n[2] - Consultar Pessoa \n[3] - Cadastrar Livro \n[4] - Consultar Livro \n[5] - Alugar Livro "
					+ "\n[6] - Relatorio dos Alugados \n[7] - Devolução","Menu",JOptionPane.INFORMATION_MESSAGE));	
			}
	}
	public static void cadastroPessoa() {
		int controle = 0;
		boolean vvv;
		p.inserirDados();
		Pessoa pessoa = new Pessoa();
		if (listaPessoas.size() == 0){
			
		}else {
			for (int c = 0;c<listaPessoas.size();c++){
				vvv = p.getCpf().equalsIgnoreCase(listaPessoas.get(c).getCpf());
				if(vvv == true){
					controle++;
					JOptionPane.showMessageDialog(null, "Pessoa já foi cadastrado");
				}else {
				}
			}
		}
		if (p.getNome().equalsIgnoreCase("sair")){
			
		}else {
			if (controle == 0){
				pessoa.setNome(p.getNome());
				pessoa.setEndereco(p.getEndereco());
				pessoa.setCpf(p.getCpf());
				listaPessoas.add(pessoa);
				JOptionPane.showMessageDialog(null, "Entrevistado Cadastrado");
			}else {
				
			}
		}
	}
	public static void consultaPessoa() {
		int controle = 0;
		String nome = JOptionPane.showInputDialog("Nome para a pesquisa:  ");
		if (nome.equals("0")){
			controle ++;
			listaCadastro = new ArrayList<String>();
			for (Pessoa p : listaPessoas) {
				String cad = p.info();
				listaCadastro.add(cad);
			}
			JOptionPane.showMessageDialog(null, String.join(",", listaCadastro));
			}
		for (int c = 0; c< listaPessoas.size();c++){
			if (nome.equalsIgnoreCase(listaPessoas.get(c).getNome())) {
				controle++;
				JOptionPane.showMessageDialog(null, listaPessoas.get(c).info());
			}
		}
		if (controle == 0){
			JOptionPane.showMessageDialog(null, "Cliente não cadastrado");
		}
	}
	public static void cadastroLivro() {
		int controle = 0;
		if (listaLivros.size() == 0){
			int id = 0;
			l.setId(id);
		}else {
			int id = listaLivros.size();
			l.setId(id);
		}
		boolean vv,vvv;
		l.inserirDados();
		Livro livro = new Livro();
		if (listaLivros.size() == 0){
			
		}else {
			for (int c = 0;c<listaLivros.size();c++){
				vv = l.getEdicao().equalsIgnoreCase(listaLivros.get(c).getEdicao());
				vvv = l.getEditora().equalsIgnoreCase(listaLivros.get(c).getEditora());
				if(vv== true && vvv == true){
					controle++;
					JOptionPane.showMessageDialog(null, "Livro já foi cadastrado");
				}else {
				}
			}
		}
		if (l.getTitulo().equalsIgnoreCase("sair")){
			
		}else {
			if (controle == 0){
				livro.setAutor(l.getAutor());
				livro.setId(l.getId());
				livro.setTitulo(l.getTitulo());
				livro.setEditora(l.getEditora());
				livro.setEdicao(l.getEdicao());
				livro.setStats(l.getStats());
				listaLivros.add(livro);
				JOptionPane.showMessageDialog(null, "Livro Cadastrado");
			}else {
				
			}
		}
	}
	public static void consultaLivros() {
		int controle = 0;
		String titulo = JOptionPane.showInputDialog("Titulo do Livro para a pesquisa:  ");
		if (titulo.equals("0")){
			controle ++;
			listaCadastroLivro = new ArrayList<String>();
			for (Livro l : listaLivros) {
				String cad = l.info();
				listaCadastroLivro.add(cad);
			}
			JOptionPane.showMessageDialog(null, String.join(",", listaCadastroLivro));
			}
		for (int c = 0; c< listaLivros.size();c++){
			if (titulo.equalsIgnoreCase(listaLivros.get(c).getTitulo())) {
				controle++;
				JOptionPane.showMessageDialog(null, listaLivros.get(c).info());
			}
		}
		if (controle == 0){
			JOptionPane.showMessageDialog(null, "Livro não cadastrado");
		}
	}
	public static void alugarLivro() throws ParseException {
		//cpf,id livro,data do emprestimo,data de devolucao
		int controle = 0;
		System.out.println("1");
		String cpf = JOptionPane.showInputDialog("Cpf da Pessoa :  ");
		System.out.println("2");
		String n = JOptionPane.showInputDialog("ID do Livro :  ");
		System.out.println("3");
		int num = Integer.parseInt(n);
		System.out.println("4");
		while (cpf.length() != 11) {
			System.out.println("5");
			JOptionPane.showMessageDialog(null, "Este CPF é inválida, tente novamente");
			System.out.println("6");
			cpf = JOptionPane.showInputDialog("CPF :  ");
			System.out.println("7");
		}
		System.out.println("8");
		for (int d = 0;d < listaPessoas.size();d++) {
			System.out.println("9");
			if(listaPessoas.get(d).getCpf().equals(cpf)) {	
				System.out.println("10");
				for (int b = 0;b < listaLivros.size();b++) {
					System.out.println("11");
					if (listaLivros.get(b).getId() == num) {
						System.out.println(listaLivros.get(b).getId());
						System.out.println(n);
						break;
					}
				}
			}else {
				controle++;
			}
		}for (int a = 0;a < listaAluguel.size();a++) {
			if (listaAluguel.get(a).getCpf().equals(cpf)){
				controle++;
			}else {
				break;
			}
		}
						if (controle == 0){
							for (int b = 0;b < listaLivros.size();b++) {
								System.out.println("11");
								if (listaLivros.get(b).getId() == num) {
									listaLivros.get(b).setStats("Emprestado");
								}
							}
							System.out.println("23");
							System.out.println(cpf);
							Date dataALG = new Date();
							String alg = f.format(dataALG);
							Calendar c = Calendar.getInstance(); 
							c.setTime(dataALG); 
							c.add(Calendar.DATE, 7);
							Date dataDV = c.getTime();
							String dv = f.format(dataDV) ;
							a.setEmprestimo("Em andamento");
							a.setCpf(cpf);
							a.setId(num);
							Aluguel algu = new Aluguel();
							algu.setEmprestimo(a.getEmprestimo());
							algu.setCpf(a.getCpf());
							algu.setId(a.getId());
							listaAluguel.add(algu);
							listaAlugados.add("\nCPF : "+cpf);
							listaAlugados.add("\nID : "+ l.getId());
							listaAlugados.add("\nData do Aluguel: " + alg);
							listaAlugados.add("\nData para Devolução: " + dv);
							listaAlugados.add("\nSituação: "+a.getEmprestimo());
							JOptionPane.showMessageDialog(null, "Aluguel Efetivado");
						}else {
							JOptionPane.showMessageDialog(null, "Cliente já possui um aluguel em aberto");
						}
	}
	public static void relatorioAlugados() {
			int controle = 0;
			String cpf = "0";
			listaCadastroAlg = new ArrayList<String>();
			if (cpf.equals("0")){
				controle ++;
				listaCadastroAlg.add(String.join(",", listaAlugados));
				}
				JOptionPane.showMessageDialog(null, String.join(",", listaCadastroAlg));
			if (controle == 0){
				JOptionPane.showMessageDialog(null, "Livro não cadastrado");
			}
		}
	public static void devolucaoLivro() {
		int controle = 0;
		String cpf = JOptionPane.showInputDialog("CPF do cliente :  ");
		for (int b = 0;b < listaAluguel.size();b++) {
			if (listaAluguel.get(b).getCpf().equals(cpf)){
				controle++;
				int id = listaAluguel.get(b).getId();
				for (int d = 0;d < listaLivros.size();d++) {
					if (id == listaLivros.get(d).getId()){
						listaLivros.get(d).setStats("Disponível");
					}
				}
			}
		}if (controle == 0){
			JOptionPane.showMessageDialog(null, "Nenhuma reserva realizada neste cpf");
		}else {
			JOptionPane.showMessageDialog(null, "Devolução concluida");
		}
	}
}

