package System;


/**
 * @author Anthue Gomez
 * @version 1.0
 * @created 12-nov.-2024 9:37:26 p. m.
 */
public class LogicEmitirAlertaSeguridad implements EmitirAlertaSeguridad {

	private Usuario usuario;
	public Usuario m_Usuario;

	public LogicEmitirAlertaSeguridad(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param idAdministrador
	 * @param idCredencial
	 * @param fecha
	 */
	public boolean notificarAdministrado(id idAdministrador, id idCredencial, time fecha){
		return false;
	}

}