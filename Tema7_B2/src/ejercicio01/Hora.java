package ejercicio01;

public class Hora {

	//Declaramos los atributos con private.
	/**
	 * 
	 */
	private int hora;
	
	/**
	 * 
	 */
	private int min;
	
	/**
	 * 
	 */
	private int seg;
	
	/**
	 * 
	 */
	//Constructor por defecto.
	public Hora() {
		
	}
	
	/**
	 * 
	 * @param hora
	 * @param min
	 * @param seg
	 */
	//Constructor con parámetros.
	public Hora (int hora, int min, int seg) {
		
		this.hora=hora;
		this.min=min;
		this.seg=seg;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getHora () {
		
		return hora;
	}
	
	/**
	 * 
	 * @param hora
	 */
	public void setHora(int hora) {
		if (hora>=0&&hora<=23) {
			
			this.hora=hora;
		}
		
	}
	
	/**
	 * 
	 * @return
	 */
	public int getMin () {
		
		return min;
	}
	
	/**
	 * 
	 * @param min
	 */
	public void setMin (int min) {
		if (min>=0&&min<=59) {
			
			this.min=min;
			
		}
		
	}
	
	/**
	 * 
	 * @return
	 */
	public int getSeg () {
		
		return seg;
	}
	
	/**
	 * 
	 * @param seg
	 */
	public void setSeg (int seg) {
		
		if (seg>=0&&seg<=59) {
			
			this.seg=seg;
		}
		
	}
	
	/**
	 * 
	 * @param incremento
	 */
	public void incrementaSegundos(int incremento) {
		
		//Creamos un bucle que se ejecute hasta el incremento marcado, una vez por bucle. Añadimos un segundo.
		for (int i=1; i<=incremento; i++) {		
				
			this.seg++;
			
			//Al aplicar el incremento de un segundo, en el caso de que sean mayores de 59, tendrán valor 0 y se incrementa 1 min.
			if (this.seg>59) {
					
				this.seg=0;
				this.min++;
				
				//Al aplicar el incremento de un minuto, en el caso de que sea mayor que 59, tendrá valor 0 y se incrementa 1 hora.
				if ( this.min>59) {
						
					this.min=0;
					this.hora++;
					
					//En el caso de se sobrepase las 23 horas, estas pasarán a valer 0.
					if (this.hora>23) {
							
						this.hora=0;	
					}
				}
					
			}
						 
		} 
		
	}
	
	/**
	 * 
	 */
	public void muestraHora () {
		
		System.out.println("Esta es la hora: "+getHora()+":"+getMin()+":"+getSeg());
		
		
	}
	
} 

