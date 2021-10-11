package com.bookstore;


import javax.swing.JFrame;

public class Login {
	public static Menu m = new Menu();
	public static Testes frame = new Testes();
	static String user = frame.userTextField.getText();
	static String pass = frame.passwordField.getText();
    public static void menu(){
        Testes frame = new Testes();
        frame.setTitle("Validação de Usuário");
        frame.setVisible(true);
        frame.setBounds(300,250,400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        
		
    }
    public static void main(String[] args) {
    	menu();
    }
}