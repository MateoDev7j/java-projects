public class OrdenarCadenas{
	public static void main(String[]args){
		
		//variables y objetos
		String cad1 = "Juan", cad2 = "Ana";
		int i;
		char c1,c2;
		boolean ordenado = false;
		//opcion uno con bucle
		for(i=0;i<cad2.length() && !ordenado;i++){
			c1=cad1.charAt(i);
			c2=cad2.charAt(i);
			if(c1<c2){
				System.out.println(cad1+ " - " + cad2);
				ordenado= true;
			}
			else
				if(c1>c2){
					System.out.println(cad2 +" - "+cad1);
					ordenado=true;
				}
				
		}
		if(!ordenado)
			System.out.println("Son iguales");
		// segunda opcion
		if(cad1.compareTo(cad2)>0)
			System.out.println(cad1+" - "+cad2);
	}
}
	