package ejercicio03;

import java.util.Scanner;

import ejercicio01.Hora;

public class Main {

	public static void main(String[] args) {
		

		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola.*/
										
		Scanner sc= new Scanner (System.in); 
		
		//Creamos el objeto.
		Fecha fecha= new Fecha();
										
		/*Le pediremos al usuario que introduzca los datos y los guardaremos en la 
		* variable correspondiente.*/
										
		System.out.print("Introduzca el día y pulse Intro: ");
		int dia= sc.nextInt();
		System.out.print("Introduzca el mes y pulse Intro: ");
		int mes= sc.nextInt();
		System.out.print("Introduzca el año y pulse Intro: ");
		int año= sc.nextInt();
		
		fecha.setDia(dia);
		fecha.setMes(mes);
		fecha.setAño(año);
		
	
		
		if (fecha.fechaCorrecta()) {
			System.out.println(fecha);
			
			
		} else {
			
			System.out.println("La fecha introducida no es válida.");
		}
		
		if (!fecha.esBisiesto()) {
			
			System.out.println("No es bisiesto.");
			
		} else {
			
			System.out.println("Es bisiesto.");
		}
		
		System.out.println("Si le añadimos un día resulta: ");
		
		fecha.diaSiguiente();
		
		System.out.println(fecha);
		

	}

}
