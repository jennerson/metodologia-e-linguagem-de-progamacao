package br.com.jennerson;

public class Principal {

	public static void main(String[] args) {
		
		Interruptor pitoco = new Interruptor();
		pitoco.setLampada(new Lampada());
		pitoco.ligar();
	}
}
