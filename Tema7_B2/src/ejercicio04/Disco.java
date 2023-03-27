package ejercicio04;

import java.lang.reflect.Array;

public class Disco {
	
	private String codigo="LIBRE";
	private String autor="";
	private String titulo="";
	private String genero="";
	private int duracion;
	
	
	public Disco() {
		super();
	}

	public Disco(String codigo, String autor, String titulo, String genero, int duracion) {
		this.codigo=codigo;
		this.autor = autor;
		this.titulo = titulo;
		this.genero = genero;
		this.duracion = duracion;
	}
	
	/**
	 * Cosntructor copia
	 * 
	 * @param d
	 */
	public Disco (Disco d) {	
		this.codigo=d.codigo;
		this.autor = d.autor;
		this.titulo = d.titulo;
		this.genero = d.genero;
		
		if (duracion>0) {
			this.duracion = d.duracion;
		}
		
	}
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo (String codigo) {
		this.codigo=codigo;
	}
	
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		if (duracion>0) {
			this.duracion = duracion;
		}
		
		
	}

	public String toString() {
		
		String result;
		
		result= "Disco [código= "+ this.codigo+"\n"+
				"autor="+ this.autor  +"\n"+
				", titulo=" + this.titulo  +"\n"+
				", género=" + this.genero +"\n"+
				", duración=" + this.duracion + "]\n";
		
		return result;
	}
	
	
	public void listado (Disco[] array) {
		
		for (Disco disco: array) {
			if (!disco.getCodigo().equals("LIBRE")){
				System.out.println(disco);//Se imprime cuando el código es distinto de LIBRE.
			}
		}
	}
	
	public void nuevoDisco (Disco[] array, int contador) {
		

		String codigo, autor, titulo, genero;
		int duracion;
		

		codigo=String.valueOf(contador);
		array[contador].setAutor(codigo);
		
		Main.sc.nextLine();
		System.out.println("Introduzca el autor del disco: ");
		autor=Main.sc.nextLine();
		
		System.out.println("Introduzca el título del disco: ");
		titulo=Main.sc.nextLine();
		
		System.out.println("Introduzca el género del disco: ");
		genero=Main.sc.nextLine();
		
		System.out.println("Introduzca la duración del disco: ");
		duracion=Main.sc.nextInt();
		
		array[contador]=new Disco(codigo, autor, titulo, genero, duracion);
		
		
	}
	
	public int posicionLibre(Disco[] array) {
		
		int posicion=0;
		
		while(posicion<array.length&&!array[posicion].getCodigo().equals("LIBRE")) {
			
			posicion++;
		}
		
		//En caso de que no encuentre ninguno libre, la posicion será igual que el tamaño
		//del array y por ello le damos un valor negativo.
		if (posicion==array.length) {
			
			posicion=-1;
		}
		
		return posicion;
	}
	
	public void modificarDisco(Disco[] array) {
		
		String autor, titulo, genero;
		int duracion, codigo;
		
		System.out.println("Introduzca el codigo del disco que quiere modificar: ");
		codigo=Main.sc.nextInt();

		if (!array[codigo].getCodigo().equals("LIBRE")) {
			
			Main.sc.nextLine();
			System.out.println("Introduzca el autor del disco: ");
			autor=Main.sc.nextLine();
			
			System.out.println("Introduzca el título del disco: ");
			titulo=Main.sc.nextLine();
			
			System.out.println("Introduzca el género del disco: ");
			genero=Main.sc.nextLine();
			
			System.out.println("Introduzca la duración del disco: ");
			duracion=Main.sc.nextInt();
			
		}
		
	}
	
	public void borrar (Disco[] array) {
		

	}
	

	
	
	

}
