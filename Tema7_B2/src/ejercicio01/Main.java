package ejercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola.*/
										
		Scanner sc= new Scanner (System.in); 
		
		//Creamos el objeto.
		Hora reloj= new Hora();
										
		/*Le pediremos al usuario que introduzca los datos y los guardaremos en la 
		* variable correspondiente.*/
										
		System.out.print("Introduzca el número de horas y pulse Intro: ");
		int hora= sc.nextInt();
		System.out.print("Introduzca el número de minutos y pulse Intro: ");
		int min= sc.nextInt();
		System.out.print("Introduzca el número de segundos y pulse Intro: ");
		int seg= sc.nextInt();
		
		//Pasamos los valores de las variables a la clase de las funciones.
		reloj.setHora(hora);
		reloj.setMin(min);
		reloj.setSeg(seg);
		
		reloj.muestraHora();
		
		//Preguntamos por el incremento que queremos hacer.
		System.out.print("Introduzca el incremento de segundos y pulse Intro: ");
		int incremento= sc.nextInt();
		
		reloj.incrementaSegundos(incremento);
		
		reloj.muestraHora();

	}

}
