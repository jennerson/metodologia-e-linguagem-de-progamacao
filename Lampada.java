package br.com.jennerson;

public class Lampada {

		private boolean estaLigada = false;
		
		public void acender(){
			if(estaLigada == true){
				System.out.println("A lâmpada já está ascesa!");
			}else{
				this.estaLigada = true;
				System.out.println("Lâmpada foi ligada!");
			}
		}
		
		public void apagar(){
			if(estaLigada == false){
				System.out.println("A lâmpada já está apagada!");
			}else{
				this.estaLigada = false;
				System.out.println("Lâmpada foi apagada");
			}
		}

		public boolean isEstaLigada() {
			return estaLigada;
		}
		
		
}
