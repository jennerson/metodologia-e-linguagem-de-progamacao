package br.com.jennerson;

public class Lampada {

		private boolean estaLigada = false;
		
		public void acender(){
			if(estaLigada == true){
				System.out.println("A l�mpada j� est� ascesa!");
			}else{
				this.estaLigada = true;
				System.out.println("L�mpada foi ligada!");
			}
		}
		
		public void apagar(){
			if(estaLigada == false){
				System.out.println("A l�mpada j� est� apagada!");
			}else{
				this.estaLigada = false;
				System.out.println("L�mpada foi apagada");
			}
		}

		public boolean isEstaLigada() {
			return estaLigada;
		}
		
		
}
