public class Enumerado{
	public enum Razas {Mastin, Terrier, Bulldog, Pekines, Caniche, Galgo}
	
	
	public static void main(String[]args){
		//codigo de la aplicacion 
		Razas var1 = Razas.Mastin;
		Razas var2 = Razas.Terrier;
		Razas var4 = Razas.Pekines;
		//mostramos en pantalla 
		System.out.println("var1 = " + var1);
		System.out.println("var2 = "+ var2);
		System.out.println("comparmos Mastin es igual a Terrier? : "+ (var1==var2));
		System.out.println("posición de " + var1 + " en el enumerado: " + (var1.ordinal()+1));
		System.out.println("posición de " + var2 + " en el enumerado: " + (var2.ordinal()+1));
		System.out.println("posición de " + var4 + " en el enumerado: " + (var4.ordinal()+1));
		
		
	}
}