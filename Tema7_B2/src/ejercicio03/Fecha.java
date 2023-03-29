package ejercicio03;

public class Fecha {

	private int dia;
	private int mes;
	private int año;

	public Fecha() {

	}

	public Fecha(int dia, int mes, int año) {

		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public boolean esBisiesto() {

		boolean bisiesto = false;

		if (getAño() % 4 == 0 || (getAño() % 100 == 0 && getAño() % 400 == 0)) {
			bisiesto = true;
		}

		return bisiesto;

	}

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

	public void diaSiguiente() {

		this.dia++;

		if (getDia() >= 31 && getMes() != 02) {

			if (mes()) {

				this.dia = 01;
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

	public boolean mes() {

		boolean mes = true;

		// Le decimos que los meses que sean de 31 días son false
		// y los que tienen 30 días son true.
		if (getMes() == 4 || getMes() == 6 || getMes() == 9 || getMes() == 11) {
			mes = true;
		}

		return mes;

	}

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
