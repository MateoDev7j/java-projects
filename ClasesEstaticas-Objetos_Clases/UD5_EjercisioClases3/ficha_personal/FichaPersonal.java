package ficha_personal;

import fecha.Fecha;
import fecha.EnumMes;

public class FichaPersonal
{
	//Atributos
	private String nombre;
	private Fecha fNac;
	private int edad;
	//Constructor 
	public FichaPersonal(String nombre,Fecha fNac)
	{
		this.nombre=nombre;
		this.fNac=fNac;
		this.edad=fNac.diferenciaEnAnios(new Fecha(6,EnumMes.Feb,2026));
	}
	//toString
	public String toString()
	{
		return String.format("Nombre: %s\nFecha nacimiento: %s\nEdad: %d",nombre,fNac ,edad);
	}

}