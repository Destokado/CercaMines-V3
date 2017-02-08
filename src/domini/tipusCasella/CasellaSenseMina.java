package domini.tipusCasella;

import domini.Casella;
import domini.Coordenada;

public class CasellaSenseMina extends Casella {
	
	//valor de l'atribut contingut que representarà que la casella no té cap mina al voltan
		private final int POS_BUIDA = 0;

	/** Al construir un objecte d'aquesta classe, cal inicialitzar 
	 * degudament els atributs heretats */
	public CasellaSenseMina(Coordenada coordenada) {
		super (null); //CAL REVISAR
		//PENDENT IMPLEMENTAR
	}

	//incrementa amb 1 el número de mines a prop
	protected void modificarVeiAmbMina() {		
		//PENDENT IMPLEMENTAR
	}

	@Override
	public boolean hiHaMina() {	
		//PENDENT IMPLEMENTAR
		return false;//RETURN QUE CAL REVISAR
	}

	@Override
	public boolean esBuida() {
		//PENDENT IMPLEMENTAR
		return false;//RETURN QUE CAL REVISAR
	}

	@Override
	public Casella collocarMina(Casella[] casellesVeines) {
		//PENDENT IMPLEMENTAR
		return null;//RETURN QUE CAL REVISAR
	}
}