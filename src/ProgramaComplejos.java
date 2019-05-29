
/**
 * Programa que realiza operaciones con numeros complejos
 * 
 * @author Cristina Castillo Obreg�n
 * 
 * @version 2.0.1
 */

public class ProgramaComplejos {
	public static void main(String[] args){
		
		/**  
		 * Creacion de numeros complejos
		 */
		NumComplejo num1=new NumComplejo(2,3);
		NumComplejo num2=new NumComplejo(2,1);
		NumComplejo res=new NumComplejo();
		
		System.out.println("Programa que opera con n�meros complejos");
		System.out.println("========================================");
		
		/**
		 * Invoca a los metodos para realizar
		 * operaciones con los n�meros complejos.
		 */
		System.out.println("Suma:");
		res=NumComplejo.sumarComplejos(num1,num2);
		System.out.println(res);
		
		System.out.println("Resta:");
		res=NumComplejo.restarComplejos(num1,num2);
		System.out.println(res);
		
		System.out.println("Multiplicaci�n:");
		res=NumComplejo.multiplicarComplejos(num1,num2);
		System.out.println(res);
		
		System.out.println("Divisi�n:");
		res=NumComplejo.dividirComplejos(num1,num2);
		System.out.println(res);
	}

}