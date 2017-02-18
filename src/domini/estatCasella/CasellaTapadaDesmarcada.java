package domini.estatCasella;

import domini.Casella;

public class CasellaTapadaDesmarcada extends EstatCasella {

	@Override
	public	boolean getMarcadaPossibleMina() {
		//IMPLEMENTAT
		//NO CAL FER RES
		return false; 
	}

	@Override
	public	boolean getDestapada() {
		//IMPLEMENTAT
		//NO CLA FER RES
		return false; 
	}

	@Override
	public	void destapar(Casella casella) {
		//PENDENT IMPLEMENTAR
		casella = new CasellaDestapada();
	}

	@Override
	public	void marcarPossibleMina(Casella casella) {
		//PENDENT IMPLEMENTAR
	}

	@Override
	public	void desmarcarPossibleMina(Casella casella) {
		//IMPLEMENTAT
		//NO CAL FER RES
	}
}
