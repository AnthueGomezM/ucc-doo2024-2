package System;


/**
 * @author Anthue Gomez
 * @version 1.0
 * @created 12-nov.-2024 9:35:29 p. m.
 */
public interface GenerarInformeDiario {

	/**
	 * 
	 * @param pago
	 */
	public double consolidarVentasDiarias(Pago pago);

	/**
	 * 
	 * @param inventario
	 */
	public int consumoInventario(Inventario inventario);

	/**
	 * 
	 * @param pago
	 */
	public int reporteIngreso(Pago pago);

}