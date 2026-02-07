public class PruebasFuncionString{
	public static void main(String[]args){
		//declaramos variables
		var saludo="hola";
		var saludo1="hola";
		String saludo2= new String("HOLA");
		
		System.out.println("saludo1 es igual saludo a ? "+" " );
		System.out.println(saludo1 == saludo);
		System.out.println("Saludo1 es igual a saludo 2? " + saludo1.equalsIgnoreCase(saludo2));
	}
}