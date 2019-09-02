package br.com.jennerson;

import java.util.Scanner;

public class ClasseLeitura {
	
	public static void main(String[] args) {
		
		int idade = 0;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe sua idade: ");
		idade = leitor.nextInt();
		
		if(idade>=18){
			System.out.println("Pode passar!!!");
		}else{
			System.out.println("Vai tirar a catinga do mijo!!!");
		}
	}
	
}
