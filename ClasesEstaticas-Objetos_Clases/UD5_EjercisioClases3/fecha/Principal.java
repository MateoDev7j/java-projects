package fecha;

public class Principal
{
	public static void main(String[]args)
	{
		//Instancia un objeto de la clase Fecha denominado objFecha1 con el primer constructor.
		Fecha objFecha1 = new Fecha (EnumMes.Feb);
		System.out.println("Primera fecha, inicializada con el primer contructor");
		
		//Actualiza los atributos dia y año para dicho objeto.
		objFecha1.setDia(20);
		objFecha1.setAnio(2000);
		
		//Muestra la fecha por pantalla en formato largo.
		System.out.println(objFecha1);
		
		//Muestra un mensaje por pantalla indicando si la fecha es verano.
		System.out.println(objFecha1.isSummer()? "Es verano" : "No es verano" );
		
		//Muestra la diferencia en años respecto a la fecha actual.
		Fecha fechaActual = new Fecha(6,EnumMes.Feb,2026);
		System.out.printf("Hay %d años de diferencia respecto al %s\n",objFecha1.diferenciaEnAnios(fechaActual),fechaActual);
		//Instancia otro objeto de la clase Fecha denominado objFecha2 con el segundo constructor.
		Fecha objFecha2 = new Fecha(23,EnumMes.Sep,2025);
		
		//Muestra el año de esta fecha por pantalla.
		System.out.println("La fecha contiene el año "+ objFecha2.getAnio());
		
		//Muestra la fecha en formato largo por pantalla.
		System.out.println(objFecha2);
		
		//Muestra un mensaje por pantalla indicando si la fecha es verano o no.
		System.out.println(objFecha2.isSummer()?"Es verano" :"No es verano");
		
		//Muestra la diferencia en años respecto a la fecha actual.
		System.out.printf("Hay %d años de diferencia respecto al %s\n",objFecha2.diferenciaEnAnios(fechaActual),fechaActual);
	}
}