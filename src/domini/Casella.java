package domini;

import domini.estatCasella.CasellaTapadaMarcada;
import domini.estatCasella.EstatCasella;
import domini.tipusCasella.CasellaAmbMina;
import domini.tipusCasella.CasellaSenseMina;

//cada objecte d'aquesta classe repreentarà una casella del taulell del joc
public abstract class Casella {
	
	//-1=mina, de 0 a 8=numero mines veines
	protected int contingut;		
	//indica en quina posició es troba la casella dins el taulell de joc
	protected Coordenada posicio;
	/*contindrà un dels tres estats d'una casella
	 * 1. Inicialment tapada i desmarcada
	 * 2. Tapada i marcada com a possible mina
	 * 3. Destapada */
	protected EstatCasella estat;

	public Casella(Coordenada coordenada) {
		//PENDENT IMPLEMENTAR
		contingut = 0;
		posicio = coordenada;
		estat= EstatCasella.getEstatInicial();
		
	}	
	
	//Retorna cert si la casella té una mina, i fals altrament
	public abstract boolean hiHaMina(); 
	
	//Retorna el contingut de la casella
	public int getContingut() {
		//Implementat
		return  this.contingut; 
	}

	//Retrona cert si la casella està destapada, fals altrament
	public boolean estaDestapada() {
		//PENDENT IMPLEMENTAR
		
		return false; //RETURN QUE CAL REVISAR
	}

	//Destapa la casella
	public void destapar() {
		//PENDENT IMPLEMENTAR
	}

	//Actualitza l'atribut possibleMina
	public void setPosibleMina(boolean marca) {
		//PENDENT IMPLEMENTAR
	}
	
	//Retorna si la casella està o no marcada
	public boolean estaMarcadaPosibleMina() {
		//IMPLEMENTAT
		return estat.getMarcadaPossibleMina(); 
	}
	
	//Retorna les coordenades de la casella
	public Coordenada getPosicio() {
		//IMPLEMENTAT
		return this.posicio; 
	}

	/*Retorna cert si la casella no té cap vei amb mina 
	 * ni ella conté una mina, altrament retorna fals.*/
	public abstract boolean esBuida();
	
	/*Actualitzar l'estat de la casella*/
	public void setEstat (EstatCasella nouEstat) {
		//IMPLEMENTAT
		estat= nouEstat;
	}
	
	/* Si la casella és de tipus CasellaSenseMina, aquest mètode creara 
	 * i retornarà un objecte de la classe CasellaAmbMina. 
	 * Altrament no ha de fer res de res*/
	public abstract Casella collocarMina(Casella[] casellesVeines);
	
	//Crea i retorna un objecte de la classe CasellaSenseMina
	public static Casella crearCasellaSenseMina(Coordenada coordenada) {
		//PENDENT IMPLEMENTAR
		return null; //RETURN QUE CAL REVISAR
	}		
}