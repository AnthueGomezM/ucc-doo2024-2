package System;


/**
 * @author Anthue Gomez
 * @version 1.0
 * @created 12-nov.-2024 9:35:29 p. m.
 */
public class ProcesarPago implements ProcesarPago {

	private Mesero mesero;
	public Mesero m_Mesero;

	public ProcesarPago(){

	}

	public void finalize() throws Throwable {

	}

	public boolean confirmarPago(){
		return false;
	}

	/**
	 * 
	 * @param pago
	 * @param orden
	 */
	public int generarFactura(Pago pago, Orden orden){
		return 0;
	}

}

/**
 * @author Anthue Gomez
 * @version 1.0
 * @created 12-nov.-2024 9:35:29 p. m.
 */
public interface ProcesarPago {

	public boolean confirmarPago();

	/**
	 * 
	 * @param pago
	 * @param orden
	 */
	public int generarFactura(Pago pago, Orden orden);

}