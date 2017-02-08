package domini.estatCasella;

import domini.Casella;

public class CasellaDestapada extends EstatCasella {

	private boolean marcada;
	
	void setMarcada (boolean estaMarcada){
		this.marcada = estaMarcada;
	}
	
	@Override
	public boolean getMarcadaPossibleMina() {
		//PENDENT IMPLEMENTAR
		return false; //RETORN QUE CAL REVISAR
	}

	@Override
	public boolean getDestapada() {
		//PENDENT IMPLEMENTAR
		return false; //RETORN QUE CAL REVISAR
	}

	@Override
	public void destapar(Casella casella) {
		//PENDENT IMPLEMENTAR
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
