package System;


/**
 * @author Anthue Gomez
 * @version 1.0
 * @created 12-nov.-2024 9:37:26 p. m.
 */
public interface RegistrarAcceso {

	/**
	 * 
	 * @param idUsuario
	 * @param idCredencial
	 * @param idPuerta
	 * @param fecha
	 */
	public boolean registarAcceso/Salida(id idUsuario, id idCredencial, id idPuerta, time fecha);

	/**
	 * 
	 * @param idCredencial
	 * @param idLector
	 */
	public boolean verificarCredencial(id idCredencial, id idLector);

}