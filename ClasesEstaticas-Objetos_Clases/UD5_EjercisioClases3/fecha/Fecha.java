package fecha;

public class Fecha
{
	//Atributos
	private int dia,anio;
	private EnumMes mes;
	
	//Constructores
	public Fecha(EnumMes mes){
		this.mes=mes;
	}
	public Fecha(int dia, EnumMes mes , int anio)
	{
		this.dia=dia;
		this.mes=mes;
		this.anio=anio;
	}
	
	//Getters y Setters
	public int getDia()
	{
		return dia;
	}
	public EnumMes getMes()
	{
		return mes;
	}
	public int getAnio()
	{
		return anio;
	}
	public void setDia(int dia)
	{
		this.dia=dia;
	}
	public void setDia(EnumMes mes)
	{
		this.mes=mes;
	}
	public void setAnio(int anio)
	{
		this.anio=anio;
	}
	//Metodo isSummer()
	public boolean isSummer()
	{
		boolean esVerano=false;
		if(mes == EnumMes.Jul || mes == EnumMes.Ago)
		{
			esVerano=true;
		}
		else if(mes == EnumMes.Jun && dia>=21)
		{
			esVerano=true;
		}
		else if(mes == EnumMes.Sep && dia<=22)
		{
			esVerano=true;
		}
		return esVerano;
	}
	//Metodo diferenciaEnAnios
	public int diferenciaEnAnios(Fecha fechaActual)
	{
		int aDiferencia = fechaActual.anio - anio;
	
	//Si el mes es posterior al de la fecha actual resto 1
	if(mes.ordinal() > fechaActual.mes.ordinal())
	{
		aDiferencia-=1;
	}
	else if(mes == fechaActual.mes && dia > fechaActual.dia)
	{
		aDiferencia-=1;
	}
	return aDiferencia;
	}
	public String toString(){
		return String.format("%d de %s del %d", dia, mes, anio);
	}
	
	
}