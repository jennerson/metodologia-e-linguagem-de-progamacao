package br.com.jennerson;

public class Interruptor {

	private Lampada lampada;
	
	public void exibirStatus(){
		System.out.println(getLampada().isEstaLigada());
	}

	public Lampada getLampada() {
		return lampada;
	}

	public void setLampada(Lampada lampada) {
		this.lampada = lampada;
	}
	
	public void ligar(){
		getLampada().acender();
		System.out.println("Luz");
		exibirStatus();
	}
	
	public void desligar(){
		getLampada().apagar();
		System.out.println("Escuridão");
		exibirStatus();
	}
}
