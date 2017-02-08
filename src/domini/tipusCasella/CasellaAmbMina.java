package domini.tipusCasella;

import domini.Casella;
import domini.Coordenada;

public class CasellaAmbMina extends Casella {
	
	//valor de l'atribut contingut que representar� que la casella cont� una mina
	private final int MINA = -1;

	/** Al construir un objecte d'aquesta classe, cal inicialitzar degudament els atributs
	 * heretats i informar a les caselles veines que incrementin el seu valor mitjan�ant el 
	 * m�tode modificarVeinsNovaMina()*/
	public CasellaAmbMina(Coordenada coordenada, Casella[] casellesVeines) {
		super (null); //CAL REVISAR
		//PENDENT IMPLEMENTAR
	}
	
	@Override
	public boolean hiHaMina() {
		//PENDENT IMPLEMENTAR
		return false; //RETORN QUE CAL REVISAR
	}

	@Override
	public boolean esBuida() {
		//PENDENT IMPLEMENTAR
		return false; //RETORN QUE CAL REVISAR
	}

	@Override
	public Casella collocarMina(Casella[] casellesVeines) {
		//PENDENT IMPLEMENTAR
		return null; //RETORN QUE CAL REVISAR
	}

	/*Cada cop que es col�loca una mina en una casella, cal informar 
	 * a tos els seus veins que no tinguin mina, que hi ha un nou vei amb mina.*/
	private void modificarVeinsNovaMina(Casella[] veins) {			
		//PENDENT IMPLEMENTAR
	}	
}