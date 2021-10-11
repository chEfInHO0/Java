package com.bookstore;

import javax.swing.JOptionPane;

public class Livro {
	private String autor;
	private String titulo;
	private int id; 
	private String editora;
	private String edicao;
	private String stats;
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getEdicao() {
		return edicao;
	}
	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
	public String getStats() {
		return stats;
	}
	public void setStats(String stats) {
		this.stats = stats;
	}
	public void inserirDados() {
		String titulo = JOptionPane.showInputDialog("Titulo do Livro :  ");
		String autor = JOptionPane.showInputDialog("Autor do Livro :  ");
		String editora = JOptionPane.showInputDialog("Editora do Livro :  ");
		String edicao = JOptionPane.showInputDialog("Edi��o do Livro :  ");
		setTitulo(titulo);
		setAutor(autor);
		setEditora(editora);
		setEdicao(edicao);
		setStats("Dispon�vel");
	}
	public String info() {
		return "\nID: "+this.id+"\nTitulo: "+this.titulo+"\nAutor: "+this.autor+"\nEditora: "+this.editora+"\nEdi��o: "+this.edicao+"\nStatus atual: "+this.stats;
	}
}
