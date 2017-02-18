package domini.tipusCasella;

import domini.Casella;
import domini.Coordenada;
import domini.estatCasella.EstatCasella;

public class CasellaSenseMina extends Casella {
	
	//valor de l'atribut contingut que representar� que la casella no t� cap mina al voltan
		private final int POS_BUIDA = 0;

	/** Al construir un objecte d'aquesta classe, cal inicialitzar 
	 * degudament els atributs heretats */
	public CasellaSenseMina(Coordenada coordenada) {
		//IMPLEMENTAT
		super(coordenada); 
		
	}

	//incrementa amb 1 el n�mero de mines a prop
	protected void modificarVeiAmbMina() {		
		//PENDENT IMPLEMENTAR
		
		//IMPLEMENTAT?
		
		contingut++;
	}

	@Override
	public boolean hiHaMina() {	
		//IMPLEMENTAT
		//NO CAL FER RES
		return false;
	}

	@Override
	public boolean esBuida() {
		//IMPLEMENTAT
		return (contingut!= POS_BUIDA);
	}

	@Override
	public Casella collocarMina(Casella[] casellesVeines) {
		//PENDENT IMPLEMENTAR
		return null;//RETURN QUE CAL REVISAR
	}
}