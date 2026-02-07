public class PruebaPajaro{
	public static void main(String[]args){
		Pajaro pajaro1 = new Pajaro();
		//Mostrar valores de ese pajaro por pantalla
		System.out.println(pajaro1);
		Pajaro pajaro2 = new Pajaro("Piolin",10,5);
		System.out.println(pajaro2);
		//Hacemos volar al pajaro
		System.out.printf("pajar1 vuela una distancia de %f\n",pajaro1.volar(5,5));
		System.out.printf("pajaro2 vuela una distancia de %f\n",pajaro2.volar(-4,-7));
		//Modificar el nombre de pajaro1 
		pajaro1.nombre = "Perico";
		System.out.println(pajaro1);
		pajaro1.setNombre("Perico");
		
		//Mostrar por pantalla solo el nombre del pajaro1
		System.out.println(pajaro1.getNombre)
		//Consultamos el numero de pajaros creados
		System.out.println("Se han creado: " + Pajaro.getNumObjetosPajaro() +"Objetos Pajaro")
	}
}