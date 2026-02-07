public class NumRandom{
	public static void main(String[]args){
		//declaramos variables
		String palabra1, palabra2, palabra3,palabraAleatoria;
		
		palabra1= "sol";
		palabra2= "luna";
		palabra3= "estrella";
		int numero;
		//resolvemos
		
		numero= (int)(Math.random()*3)+1;
		palabraAleatoria = String.valueOf(numero) + " - ";
		palabraAleatoria += (numero == 1) ? palabra1 :
							(numero==2)?palabra2:
							palabra3;
		System.out.println("el numero aleatorio es : "+ palabraAleatoria);
	}
}