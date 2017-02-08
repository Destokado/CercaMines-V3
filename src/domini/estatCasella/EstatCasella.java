package domini.estatCasella;

import domini.Casella;

public abstract class EstatCasella {
	
/** Al iniciar el joc totes les caselles han d’estar tapades 
 * i desmarcades. Aquest mètode a de retornar un objecte de 
 * la classe que representa l’estat inicial de totes les caselles. */
	public static EstatCasella getEstatInicial() {
		//PENDENT IMPLEMENTAR
		return null; //RETORN QUE CAL REVISAR
	}
	
	/** Mètode abstracte que retorna un booleà que serà cert si la 
	 * casella està marcada com a possible mina i fals altrament.*/
	public abstract boolean getMarcadaPossibleMina();
	
	/** Mètode abstracte que retorna un booleà que serà cert si la 
	 * casella està destapada i fals altrament.*/
	public abstract boolean getDestapada();

	/** Els tres mètode abstracte definits a continuació tenen com a
	 *  missió canviar l'esta d'una casella. Per fer-ho primer comproven
	 *  que el canvi sigui possible, i si ho és informen a la casella de
	 *  l’argument del nou estat mitjançant el mètode setEstat() de la 
	 *  classe Casella..*/
	public abstract void destapar(Casella casella);
	public abstract void marcarPossibleMina(Casella casella);
	public abstract void desmarcarPossibleMina(Casella casella);
}
