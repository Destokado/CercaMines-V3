package domini.estatCasella;

import domini.Casella;

public class CasellaTapadaMarcada extends EstatCasella {

	@Override
	public	boolean getMarcadaPossibleMina() {
		//PENDENT IMPLEMENTAR
		return false; //RETORN QUE CAL REVISAR
	}

	@Override
	public	boolean getDestapada() {
		//IMPLEMENTAT
		return false; 
	}

	@Override
	public	void destapar(Casella casella) {
		//PENDENT IMPLEMENTAR
		EstatCasella destapada = new CasellaDestapada();
		casella.setEstat(destapada);
		
	}

	@Override
	public	void marcarPossibleMina(Casella casella) {
		//IMPLEMENTAT
		//NO CAL FER RES
	}

	@Override
	public	void desmarcarPossibleMina(Casella casella) {
		//IMPLEMENTAT
		EstatCasella tapadaDesmarcada = new CasellaTapadaDesmarcada();
		casella.setEstat(tapadaDesmarcada);
	}
}
