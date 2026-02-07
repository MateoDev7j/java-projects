public class Animal{
	//Atributos
	private String nombre;
	private String raza;
	private short edad;
	
	//Metodos 
	//CONSTRUCTIRES
	
	public Animal(){}
	
	public Animal (String nombreN, String razaN, short edadN){//si no diferencias estos parametros de los que creamos el compilador no los sabe diferenciar
		this.nombre = nombreN;
		this.raza = razaN;
		this.edad = edadN;//el this. es para hacer referencia al objeto que estamos creando
	}
	
	//Metodo MAIN
	public static void main(String[]args){
		//Crear un Animal y mostramos sus Atributos
		Animal perro = new Animal ();
		System.out.println(perro);
		//Ponemos un nombre 
		perro.setNombre("Flapi");
		//Asignamos una raza
		perro.setRaza("Pitbull");
		//Asignar edad
		perro.setEdad((short)11);
		
		//Cumpleanios
		perro.cumplirAnios();
		
		System.out.println(perro);
		Animal gato = new Animal ("koki","siames",(short)3);
		System.out.println(gato);
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
	
	//toString
	public String toString(){
		String cadena = String.format("\nNombre: %s\nRaza: %s\nEdad: %d",nombre,raza,edad);
		return cadena;
	}
	//Metodo para cumplir años
	public void cumplirAnios(){
		edad++;
	}
}