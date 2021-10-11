package com.bookstore;

import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;

import javax.swing.*; 

public class Testes extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Container container=getContentPane();
	JLabel infoLabel=new JLabel("Login Biblioteca");
	JLabel userLabel=new JLabel("Usuário");
	JLabel passwordLabel=new JLabel("Senha");
	JTextField userTextField=new JTextField();
	JTextField passwordField=new JTextField();
	JButton loginButton=new JButton("LOGIN");
	public Testes() {
		//Calling methods inside constructor.
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
	}
	public void setLayoutManager()
	   {
	       container.setLayout(null);
	   }
	   public void setLocationAndSize()
	   {
	       //Setting location and Size of each components using setBounds() method.
		   infoLabel.setFont(new Font("Serif", Font.BOLD, 20) );
		   infoLabel.setBounds(130,50,170,30);
	       userLabel.setBounds(50,150,100,30);
	       passwordLabel.setBounds(50,220,100,30);
	       userTextField.setBounds(130,150,150,30);
	       passwordField.setBounds(130,220,150,30);
	       loginButton.setBounds(150,300,100,30);
	 
	 
	   }
	   public void addComponentsToContainer()
	   {
	      //Adding each components to the Container
		   container.add(infoLabel);
	       container.add(userLabel);
	       container.add(passwordLabel);
	       container.add(userTextField);
	       container.add(passwordField);
	       container.add(loginButton);
	   }
	 
	   public void addActionEvent() {
	        loginButton.addActionListener(this);
	    }
	 
	 
	   @Override
	    public void actionPerformed(ActionEvent e) {
	        //Coding Part of LOGIN button
	        if (e.getSource() == loginButton) {
	            String userText;
	            String pwdText;
	            userText = userTextField.getText();
	            pwdText = passwordField.getText();
	            if (userText.equalsIgnoreCase("admin") && pwdText.equalsIgnoreCase("admin")) {
	                JOptionPane.showMessageDialog(this, "Login Successful");
	                userTextField = new JTextField();
	                dispose();
	                try {
						Menu.app();
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
	                
	            } else {
	                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
	                userTextField.setText("");
	                passwordField.setText("");
	            }
	 
	        }
	 
	        
	    }
	   }
	 
	 