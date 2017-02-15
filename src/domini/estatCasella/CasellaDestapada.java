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
		//PENDENT IMPLEMENTAR
		return true; //RETORN QUE CAL REVISAR
	}

	@Override
	public void destapar(Casella casella) {
		//PENDENT IMPLEMENTAR
		
		//NO CAL FER RES
	}

	@Override
	public	void marcarPossibleMina(Casella casella) {
		//PENDENT IMPLEMENTAR
	}

	@Override
	public	void desmarcarPossibleMina(Casella casella) {
		//PENDENT IMPLEMENTAR
	}
}
