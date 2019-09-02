package br.com.jennerson;

import java.util.Scanner;

public class LendoVariaveis {
	
	public static void main(String[] args) {
		
		String nome = "Jennerson Barbosa";
		int idade = 27;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe seu nome: ");
		nome = leitor.nextLine();
		
		System.out.println("Informe sua idade: ");
		idade = leitor.nextInt();
		
		System.out.println(nome +" - "+idade);
	}
}
