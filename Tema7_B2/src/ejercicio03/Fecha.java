package ejercicio03;

/**
 * Clase Fecha que muestra la fecha actual, indica si el año es bisiesto o no y nos muestra el día siguiente
 * a la fecha ingresada.
 * 
 * @author ikloerzer
 *
 */
public class Fecha {

	/**
	 * Atributo privado de tipo entero referente al día.
	 */
	private int dia;
	
	/**
	 * Atributo privado de tipo entero referente a un mes.
	 */
	private int mes;
	
	/**
	 * atributo privado de tipo entero referente a un año.
	 */
	private int año;

	/**
	 * Constructor por defecto.
	 */
	public Fecha() {

	}

	/**
	 * Constructor por defecto con parámetros.
	 * @param dia
	 * @param mes
	 * @param año
	 */
	public Fecha(int dia, int mes, int año) {

		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}

	/**
	 * Método get del atributo día.
	 * @return dia.
	 */
	public int getDia() {
		return dia;
	}

	/**
	 * Método set del atributo día
	 * @param dia
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}

	/**
	 * Método get del atributo mes
	 * @return mes
	 */
	public int getMes() {
		return mes;
	}
	
	/**
	 * Método set del atributo mes
	 * @param mes
	 */
	public void setMes(int mes) {
		this.mes = mes;
	}

	/**
	 * Método get del atributo año
	 * @return año
	 */
	public int getAño() {
		return año;
	}
	
	/**
	 * Método set del atributo año
	 * @param año
	 */
	public void setAño(int año) {
		this.año = año;
	}

	/**
	 * Método que comprueba si un año es bisiesto.
	 * @return devuelve true si es bisiesto o false si no lo es.
	 */
	public boolean esBisiesto() {

		boolean bisiesto = false;

		if (getAño() % 4 == 0 || (getAño() % 100 == 0 && getAño() % 400 == 0)) {
			bisiesto = true;
		}

		return bisiesto;

	}

	/**
	 * Mátodo que indica si la fecha es correcta o no.
	 * @return devuelve true si la fecha es correcta y false si la fecha no es correcta.
	 */
	public boolean fechaCorrecta() {

		boolean fechaC = false;

		if (getDia() > 0 || getDia() <= 31) {

			if (getMes() == 2 && getDia() <= 29 && esBisiesto()) {

				fechaC = true;

			}

			if (getMes() <= 12 && getMes() > 0) {

				fechaC = true;
			}

			if (getAño() > 0) {

				fechaC = true;
			}

		}

		return fechaC;

	}

	/**
	 * Método que nos devuelve la fecha del día siguiente a la fecha ingresada.
	 */
	public void diaSiguiente() {

		this.dia++;

		if (getDia() >= 31 && getMes() != 02) {

			if (mes()) {

				this.dia = 01;
				this.mes++;

			} else {
				
				this.dia=1;
				this.mes++;
				
				if (getMes() > 12) {

					this.mes = 01;
					this.año++;
				}
			}

		} else if ((esBisiesto() && this.dia == 29 && this.mes == 02)) {

			this.dia = 01;
			this.mes = 03;

		} else if ((!esBisiesto() && this.dia == 29 && this.mes == 02)) {

			this.dia = 01;
			this.mes = 03;

		}

	}

	/**
	 * Método que comprueba si un mes tiene 30 o 31 días.
	 * @return false si los meses tienen 31 días y true si tienen 30 días.
	 */
	public boolean mes() {

		boolean mes = false;

		// Le decimos que los meses que sean de 31 días son false
		// y los que tienen 30 días son true.
		if (getMes() == 4 || getMes() == 6 || getMes() == 9 || getMes() == 11) {
			mes = true;
		}

		return mes;

	}

	/**
	 * Método que nos guarda toda la info en un string.
	 * @return mensaje tipo
	 */
	public String toString() {

		String formato = "0";
		String dia = String.valueOf(getDia());
		String mes = String.valueOf(getMes());
		String año = String.valueOf(getAño());
		String result;

		if (getDia() < 10) {

			dia = formato + String.valueOf(getDia());

		}

		if (getMes() < 10) {

			mes = formato + String.valueOf(getMes());
		}

		result = dia + "/" + mes + "/" + año;

		return result;
	}

}
