package domini.estatCasella;

import domini.Casella;

public class CasellaDestapada extends EstatCasella {

	private boolean marcada;
	
	void setMarcada (boolean estaMarcada){
		this.marcada = estaMarcada;
	}
	
	@Override
	public boolean getMarcadaPossibleMina() {
		//IMPLEMENTAT
		return this.marcada; 
	}

	@Override
	public boolean getDestapada() {
		//IMPLEMENTAT
		return true; 
	}

	@Override
	public void destapar(Casella casella) {
		//IMPLEMENTAT
		
		//NO CAL FER RES
	}

	@Override
	public	void marcarPossibleMina(Casella casella) {
		//IMPLEMENTAT
		//NO CAL FER RES
	}

	@Override
	public	void desmarcarPossibleMina(Casella casella) {
		//IMPLEMENTAT
		//NO CAL FER RES
	}
}
