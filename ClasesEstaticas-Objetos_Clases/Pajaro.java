public class Pajaro
{
	//Atributos
	private String nombre;
	private int posX;
	private int posY;
	private static int numObjetosPajaro=0;
	//Metodos 
	//Constructores
	public Pajaro(){
		numObjetosPajaro++;//incrementamos un pajaro cuando lo creamos
	}
	public Pajaro(String nombre, int posX, int posY)
	{
		this.nombre=nombre;
		this.posX=posX;
		this.posY=posY;
		numObjetosPajaro++;// incrementamos un pajaron cuando lo creamos
	}
	//Metodo static para consultar el numero de pajaros creados
	public static int getNumObjetosPajaro(){
		return numObjetosPajaro;
	}
	
	
	//Metodo volar
	public double volar(int posX, int posY)
	{
		double d = Math.sqrt(Math.pow((posX-this.posX),2)+Math.pow((posY-this.posY),2));
		return d;
	}
	//toString
	public String toString()
	{
		//tambien se puede hacer concatenando simplemente
		//ejemplo cadena= ("Nombre: " + nombre + "posX: " +posX + "posY: " + posY);
		
		String cadena=String.format("Nombre=%s\nposX=%d\nposY=%d",nombre, posX, posY);
		return cadena;
	}
	
	//Creamos dos objetos pajaro uno con cada constructor y probaremos todos los metodos implementados
	
	/*public static void main(String[]args)
	{
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
	}*/
	//Metodos para modificar los atributos
	public void setNombre (String nombre)
	{
			this.nombre=nombre;
	}
	public String getNombre(){
		return nombre;
	}
}
	/* PAJARO - ATRIBUTOS...
	METODOS: CONSTURCTORES 2, VOLAR, TOSTRING, MAIN:CREO UN OBJETO DE PAJARO
	EJECUTO LOS METODOS VOLAR, MUESTRO DATOS*/