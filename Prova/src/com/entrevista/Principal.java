package com.entrevista;

import java.util.ArrayList;

public class Principal {
	static Perguntas p = new Perguntas();
	static ArrayList<Perguntas> listaPerguntas = new ArrayList<Perguntas>();
	public static void main(String [] args) {
		int c = 0;
		while(c < 2) {
			cadastroPergunta();
			c++;
		for (int i = 0;i<listaPerguntas.size();i++) {
			System.out.println(listaPerguntas.get(i).info());
		}
		}
	}
	public static void cadastroPergunta() {
		do {
			p.inserirDados();
			boolean v,vv;
			Perguntas perg = new Perguntas();
			if (listaPerguntas.size()== 0) {
				perg.setId(p.getId());
				perg.setDescricao(p.getDescricao());
				listaPerguntas.add(perg);
				break;
			}else {
				for (int i = 0;i<listaPerguntas.size();i++) {
					int a = listaPerguntas.get(i).getId();
					String b = listaPerguntas.get(i).getDescricao();
					v = b.equalsIgnoreCase(p.getDescricao());
					vv = a == p.getId();
					System.out.println(v+" "+vv);
					if (v == false ) {
						if (vv == false) {
							perg.setId(p.getId());
							perg.setDescricao(p.getDescricao());
							listaPerguntas.add(perg);
							i=0;
							break;
						}
					}
					if (v == true ) {
						if(vv == true) {
							System.out.println("Ja cadastrado");
							break;
						}
					}
					if (v == true) {
						if (vv == false) {
						System.out.println("Pergunta ja cadastrada");
						break;
						}
					}
					if (v == false) {
						if (v == true) {
						System.out.println("ID ja cadastrado");
						break;
						}
					}
				}
			}
			
	}while(p.getId() > 0);
		}
	}
