package ejercicio04;

/**
 * Clase Disco que organiza álbumes de música
 * 
 * @author ikloerzer
 *
 */

public class Disco {

	/**
	 * Atributo privado inicializado como libre.
	 */
	private String codigo = "LIBRE";

	/**
	 * Atributo privado autor.
	 */
	private String autor = "";

	/**
	 * Atributo privado título.
	 */
	private String titulo = "";

	/**
	 * Atributo privado género.
	 */
	private String genero = "";

	/**
	 * Atributo privado duración.
	 */
	private int duracion;

	/**
	 * Constructor por defecto.
	 */
	public Disco() {
		super();
	}

	/**
	 * Constructor por defecto con parámetros.
	 * 
	 * @param codigo
	 * @param autor
	 * @param titulo
	 * @param genero
	 * @param duracion
	 */
	public Disco(String codigo, String autor, String titulo, String genero, int duracion) {
		this.codigo = codigo;
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
	public Disco(Disco d) {
		this.codigo = d.codigo;
		this.autor = d.autor;
		this.titulo = d.titulo;
		this.genero = d.genero;

		if (duracion > 0) {
			this.duracion = d.duracion;
		}

	}

	/**
	 * Método get del atributo código.
	 * 
	 * @return codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * Método set del atributo código.
	 * 
	 * @param codigo
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * Método get del atributo autor.
	 * 
	 * @return autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * Método set del atributo autor
	 * 
	 * @param autor
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * Método get del atributo título
	 * 
	 * @return titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Método set del atribiuto título
	 * 
	 * @param titulo
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * Método get del atributo género
	 * 
	 * @return genero
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * Método set del atributo género
	 * 
	 * @param genero
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * Método get del atributo duración.
	 * 
	 * @return
	 */
	public int getDuracion() {
		return duracion;
	}

	/**
	 * Método set del atributo duración, no puede ser menor que 0.
	 * 
	 * @param duracion
	 */
	public void setDuracion(int duracion) {
		if (duracion > 0) {
			this.duracion = duracion;
		}
	}

	/**
	 * Método que imprime la información
	 * 
	 * @return mensaje tipo
	 */
	public String toString() {

		String result;

		result = "Disco [código= " + this.codigo + ",\n" + "autor=" + this.autor + ", \n" + "título=" + this.titulo
				+ ",\n" + "género=" + this.genero + ",\n" + "duración=" + this.duracion + "]";

		return result;
	}

	/**
	 * Método que lista todos los álbumes que hay.
	 * 
	 * @param array
	 */
	public void listado(Disco[] array) {

		for (Disco disco : array) {
			if (!disco.getCodigo().equals("LIBRE")) {
				System.out.println(disco);// Se imprime cuando el código es distinto de LIBRE.
			}
		}
	}

	/**
	 * Método que ingresa discos nuevos, mientras haya códigos libres.
	 * 
	 * @param array
	 * @param contador
	 */
	public void nuevoDisco(Disco[] array, int contador) {

		String codigo, autor, titulo, genero;
		int duracion;

		codigo = String.valueOf(contador);
		array[contador].setAutor(codigo);

		Main.sc.nextLine();
		System.out.println("Introduzca el autor del disco: ");
		autor = Main.sc.nextLine();

		System.out.println("Introduzca el título del disco: ");
		titulo = Main.sc.nextLine();

		System.out.println("Introduzca el género del disco: ");
		genero = Main.sc.nextLine();

		System.out.println("Introduzca la duración del disco: ");
		duracion = Main.sc.nextInt();

		array[contador] = new Disco(codigo, autor, titulo, genero, duracion);
	}

	/**
	 * Método que comprueba si quedan posiciones libres para añadir discos.
	 * 
	 * @param array
	 * @return devuelve un int que si es -1 significa que no hay huecos libres o
	 *         devuelve la posición del primer código libre.
	 */
	public int posicionLibre(Disco[] array) {

		int posicion = 0;

		while (posicion < array.length && !array[posicion].getCodigo().equals("LIBRE")) {

			posicion++;
		}

		// En caso de que no encuentre ninguno libre, la posicion será igual que el
		// tamaño
		// del array y por ello le damos un valor negativo.
		if (posicion == array.length) {

			posicion = -1;
		}

		return posicion;
	}

	/**
	 * Método que modifica algún aspecto de un disco que ya existe.
	 * 
	 * @param array
	 */
	public void modificarDisco(Disco[] array) {

		int codigo;

		System.out.println("Introduzca el codigo del disco que quiere modificar: ");
		codigo = Main.sc.nextInt();

		if (!array[codigo].getCodigo().equals("LIBRE")) {

			Main.sc.nextLine();
			System.out.println("Introduzca el autor del disco: ");
			autor = Main.sc.nextLine();

			System.out.println("Introduzca el título del disco: ");
			titulo = Main.sc.nextLine();

			System.out.println("Introduzca el género del disco: ");
			genero = Main.sc.nextLine();

			System.out.println("Introduzca la duración del disco: ");
			duracion = Main.sc.nextInt();

		} else {

			System.err.println("El disco introducido no existe.");
		}

	}

	/**
	 * Métodd que borrar algún disco siempre y cuando exista.
	 * 
	 * @param array
	 */
	public void borrar(Disco[] array) {

		int codigo;

		System.out.println("Introduzca el código del disco a borrar: ");
		codigo = Main.sc.nextInt();

		if (codigo >= 0 && codigo < array.length && !array[codigo].getCodigo().equals("LIBRE")) {
			array[codigo].setCodigo("LIBRE");

		} else {

			System.out.println("Codigo incorrecto.");
		}

	}
}
