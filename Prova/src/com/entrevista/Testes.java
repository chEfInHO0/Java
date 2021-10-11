package com.entrevista;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Testes {
	public static void main(String [] args) throws ParseException{
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		Date dataALG = new Date();
		String alg = f.format(dataALG);
		Calendar c = Calendar.getInstance(); 
		c.setTime(dataALG); 
		c.add(Calendar.DATE, 7);
		Date dataDV = c.getTime();
		String dv = f.format(dataDV) ;
		System.out.println(alg);
		System.out.println(dv);
	}
	
}
