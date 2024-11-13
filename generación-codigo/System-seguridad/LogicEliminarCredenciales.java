package System;


/**
 * @author Anthue Gomez
 * @version 1.0
 * @created 12-nov.-2024 9:37:26 p. m.
 */
public class LogicEliminarCredenciales implements EliminarCredenciales {

	private Administrador administrador;
	public Administrador m_Administrador;

	public LogicEliminarCredenciales(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param idCredencial
	 */
	public boolean desactivarCredencial(id idCredencial){
		return false;
	}

}