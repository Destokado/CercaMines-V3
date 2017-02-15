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
		return false; //RETORN QUE CAL REVISAR
	}

	@Override
	public	void destapar(Casella casella) {
		//PENDENT IMPLEMENTAR
		EstatCasella destapada = new CasellaDestapada();
		casella.setEstat(destapada);
		casella.set
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
