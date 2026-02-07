public class PruebaStringBuilderFunciones{
	public static void main(String[]args){
		//declaramos vaariables
		StringBuilder strb = new StringBuilder("Hoal Muuundo");
		
		//resolucion
		
		System.out.println("valor actual: " + strb+ " Tamaño: "+ strb.length());
		
		strb.delete(6,8);
		System.out.println("valor actual: " + strb+ " Tamaño: "+ strb.length());

		for(int i=0;i<strb.length();i++){
			System.out.println("valor actual: " + strb+ " Tamaño: "+ strb.length());
			strb.append(strb.charAt(0));
			strb.delete(0,1);
			System.out.println("valor actual: " + strb+ " Tamaño: "+ strb.length());
		}
		System.out.println("valor actual: " + strb+ " Tamaño: "+ strb.length());
	}
}