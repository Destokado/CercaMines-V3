package domini.estatCasella;

import domini.Casella;

public abstract class EstatCasella {
	
/** Al iniciar el joc totes les caselles han d�estar tapades 
 * i desmarcades. Aquest m�tode a de retornar un objecte de 
 * la classe que representa l�estat inicial de totes les caselles. */
	public static EstatCasella getEstatInicial() {
		//PENDENT IMPLEMENTAR
		return null; //RETORN QUE CAL REVISAR
	}
	
	/** M�tode abstracte que retorna un boole� que ser� cert si la 
	 * casella est� marcada com a possible mina i fals altrament.*/
	public abstract boolean getMarcadaPossibleMina();
	
	/** M�tode abstracte que retorna un boole� que ser� cert si la 
	 * casella est� destapada i fals altrament.*/
	public abstract boolean getDestapada();

	/** Els tres m�tode abstracte definits a continuaci� tenen com a
	 *  missi� canviar l'esta d'una casella. Per fer-ho primer comproven
	 *  que el canvi sigui possible, i si ho �s informen a la casella de
	 *  l�argument del nou estat mitjan�ant el m�tode setEstat() de la 
	 *  classe Casella..*/
	public abstract void destapar(Casella casella);
	public abstract void marcarPossibleMina(Casella casella);
	public abstract void desmarcarPossibleMina(Casella casella);
}
