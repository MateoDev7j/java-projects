public class EjVariables
{
	public static void main(String[]args)
	{
		//Declaracion de variables y objetos
		byte var1 = 1;
		short var2 = 128;
		int var3 = 32768;
		long var4 = 2147483648L; //Hemos añadido L
		
		//2 variables de tipo real
		float var5 = 10.5F; //Hemos añadido F
		double var6 = 1080.653;
		
		//Booleanos
		boolean var7 = true;
		
		//caracteres 
		char var8 = 'a';
		
		//Resolver el problema
		System.out.println(var1 +"," + var2 + "," + var3 +"," + var4);
		
		
		System.out.println(var5 + "\n" + var6);
		
		System.out.println(var7);
		System.out.println(var8);

		//Quiero escribir "Que alegria verte" con comillas 
		System.out.println("\"Que alegria verte\"");

	}
}