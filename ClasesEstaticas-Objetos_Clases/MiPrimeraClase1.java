import java.awt.Rectangle;


public class MiPrimeraClase1{
	//Atributos
	private String nombre;
	private String raza;
	private short edad;
	
	//Metodos 
	//CONSTRUCTIRES
	public Animal(){
	
	}
	
	//Metodo MAIN
	public static void main(String[]args){
		//Crear un Animal y mostramos sus Atributos
		Animal perro = new Animal ();
		System.out.println(perro);
	}
	
	//GETS
	public String getNombre(){
		return nombre;
	}		
	public String getRaza(){
		return raza;
	}
	public short getEdad(){
		return edad;
	}
	//SETs
	public void setNombre(String nuevoNombre){
		nombre = nuevoNombre;
	}
	public void setRaza(String nuevaRaza){
		raza= nuevaRaza;
	}
	public void setEdad(short nuevaEdad){
		edad= nuevaEdad;
	}
	
}