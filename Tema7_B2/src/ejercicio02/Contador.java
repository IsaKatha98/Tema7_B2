package ejercicio02;

/**
 * Clase contador 
 * @author ikloerzer
 *
 */
public class Contador {

	/**
	 * Atributo de tipo entero.
	 */
	private int cont;
	
	/**
	 * Constructor por defecto, inicializando el contador a 0.
	 */
	public Contador() {

		this.cont = 0;
	}

	/**
	 * Constructor por defecto con parámetros, donde el atributo tiene que ser mayor o igual a 0.
	 * @param cont
	 */
	public Contador(int cont) {
		if (cont >= 0) {

			this.cont = cont;
		}

	}

	/**
	 * Constructor copia
	 * @param objCont
	 */
	public Contador(Contador objCont) {

		this.cont = objCont.cont;
	}

	/**
	 * Método get del atributo contador.
	 * @return cont
	 */
	public int getCont() {

		return cont;
	}

	/**
	 * Método set del contador, donde el parámetro tiene que ser mayor o igual que 0.
	 * @param cont
	 */
	public void setCont(int cont) {

		if (cont >= 0) {
			this.cont = cont;
		}
	}
	
	/**
	 * Método que incrementa en uno el contador.
	 */
	public void incrementar () {
		
		this.cont++;
	 
	}
	
	/**
	 * Método que decrementa en una unidad el contador. Si el contador llegará a un resultado
	 * menor que 0, se dejaría como 0.
	 */
	public void decrementar () {
		
		this.cont--;
		
		if (this.cont<0) {
			this.cont=0;
		}
	}

}
