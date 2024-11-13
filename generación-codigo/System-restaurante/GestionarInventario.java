package System;


/**
 * @author Anthue Gomez
 * @version 1.0
 * @created 12-nov.-2024 9:35:29 p. m.
 */
public interface GestionarInventario {

	/**
	 * 
	 * @param ingradientes
	 */
	public actualizarInventario(ingrediente ingradientes);

	/**
	 * 
	 * @param ingradientes
	 */
	public int consultarDisponibilidad(ingrediente ingradientes);

}