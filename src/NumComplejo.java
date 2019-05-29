

/**
 * Programa que realiza operaciones con numeros complejos
 * 
 * @author Cristina Castillo Obregón
 * 
 * @version 2.0.1
 */

public class NumComplejo {
	private double pReal;
	private double pImaginaria;

	/**
	 * Constructor.
	 * 
	 * Vacío
	 */
	public NumComplejo(){

	}

	/**
	 * Constructor.
	 * 
	 * @param pReal
	 *            parte real del numero.
	 *            
	 * @param pImaginaria
	 *            parte imaginaria del numero.
	 * 
	 */
	
	public NumComplejo(double pReal, double pImaginaria){
		this.pReal=pReal;
		this.pImaginaria=pImaginaria;
	}
	
	/**
	 * Getter.
	 * 
	 * @return parte real.
	 */

	public double getpReal() {
		return pReal;
	}
	
	/**
	 * Setter.
	 * 
	 * @param pReal
	 * 			parte real del numero.
	 * 
	 * Modifica el valor
	 */

	public void setpReal(double pReal) {
		this.pReal = pReal;
	}

	
	/**
	 * Getter.
	 * 
	 * @return parte imaginaria del número.
	 */
	public double getpImaginaria() {
		return pImaginaria;
	}

	/**
	 * Setter.
	 * 
	 * @param pImaginaria
	 * 			parte imaginaria del numero.
	 * 
	 * Modifica el valor
	 */
	public void setpImaginaria(double pImaginaria) {
		this.pImaginaria = pImaginaria;
	}

	
	/**
	 * Suma dos números complejos.
	 * 
	 * @param NumComplejo c1, NumComplejo c2
	 *           números complejos.
	 *           
	 * @return result
	 * 			resultado de la suma
	 */
	public static NumComplejo sumarComplejos (NumComplejo c1, NumComplejo c2){
		NumComplejo result = new NumComplejo();

		result.setpReal(c1.getpReal()+c2.getpReal());
		result.setpImaginaria(c1.getpImaginaria()+c2.getpImaginaria());

		return result;
	}

	
	/**
	 * Resta dos números complejos.
	 * 
	 * @param NumComplejo c1, NumComplejo c2
	 *           números complejos.
	 *           
	 * @return result
	 * 			resultado de la resta
	 */
	public static NumComplejo restarComplejos (NumComplejo c1, NumComplejo c2){
		NumComplejo result = new NumComplejo();

		result.setpReal(c1.getpReal()-c2.getpReal());
		result.setpImaginaria(c1.getpImaginaria()-c2.getpImaginaria());

		return result;
	}

	/**
	 * Multiplicar dos números complejos.
	 * 
	 * @param NumComplejo c1, NumComplejo c2
	 *           números complejos.
	 *           
	 * @return result
	 * 			resultado de la multipliación
	 */
	public static NumComplejo multiplicarComplejos (NumComplejo c1, NumComplejo c2){
		NumComplejo result = new NumComplejo();

		double a=c1.getpReal();
		double b=c1.getpImaginaria();
		double c=c2.getpReal();
		double d=c2.getpImaginaria();

		result.setpReal((a*c)-(b*d));
		result.setpImaginaria((a*d)+(b*c));

		return result;
	}

	/**
	 * Divide dos números complejos.
	 * 
	 * @param NumComplejo c1, NumComplejo c2
	 *           números complejos.
	 *           
	 * @return result
	 * 			resultado de la división
	 */
	public  static NumComplejo dividirComplejos (NumComplejo c1, NumComplejo c2){
		NumComplejo result = new NumComplejo();

		double a=c1.getpReal();
		double b=c1.getpImaginaria();
		double c=c2.getpReal();
		double d=c2.getpImaginaria();

		double dividendoReal = (a*c)+(b*d);
		double dividendoImaginario = (b*c)-(a*d);
		double divisor = (Math.pow(c, 2)+Math.pow(d, 2));

		result.setpReal(dividendoReal/divisor);
		result.setpImaginaria(dividendoImaginario/divisor);

		return result;
	}

	/**
	 * Devuelve el módulo de un número complejo.
	 * 
	 * @param NumComplejo numComplejo 
	 *           número complejo.
	 *           
	 * @return modulo 
	 */
	public static double modulo (NumComplejo numComplejo){
		double real =  numComplejo.getpReal();
		double imaginaria = numComplejo.getpImaginaria();

		return Math.sqrt(Math.pow(real, 2)+Math.pow(imaginaria, 2));
	}
	
	/**
	 * Formatea la salida de datos.
	 * 
	 * @return mostrar
	 * 			
	 */

	@Override
	public String toString(){
		
		String mostrar="";
		if (pReal!=0){
			mostrar+=pReal;
		}
		if (pImaginaria>=0){
			mostrar=mostrar+"+"+pImaginaria+"i";
		}else {
			mostrar=mostrar+"-"+(pImaginaria*(-1))+"i";
		}
		return mostrar;
	}
}
