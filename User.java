package br.com.jennerson;

import java.sql.Time;
import java.util.Calendar;

public class User {
	String nome;
	Calendar ano = Calendar.getInstance();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void retornaIdade(int nasc) {
		int anoat = ano.get(Calendar.YEAR);
		int idade = anoat - nasc;
		
		System.out.println("Idade : "+ idade);
	}
	
	
}
