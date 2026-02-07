import java.util.Scanner;

public class EjemplosFuncionesDeString2{
	public static void main(String[]args){
		//variables y objetos
		/*.9)Crea un String a con la cadena “Esto es una String”; 
		crea otro String b con la cadena “Y esto
		también”.
		a) Comparar las dos Strings y decir si son iguales
		b) Crear un String c con la concatenación de a y b
		c) Crear un String d con la concatenación de a y b otra vez
		d) Comparar los String c y d y decir si son iguales
		e) Indicar cuantos caracteres tiene cada uno de los Strings
		f) Copiar el String a en el String b
		g) Utilizar replace, para modificar el String a
		h) Presentar en consola el contenido de el String a y el String b.*/
		Scanner scanner =new Scanner(System.in);
		String a="Esto es una String.",b=" Y esto tambien.",c="",d="",e="";
		int caracteres=0, i;
		//resolvemos
		System.out.println(a);
		System.out.println(b);
		c=c.concat(a);
		c=c.concat(b);
		//mostramos en pantalla
		System.out.println(c);
		d=d.concat(a);
		d=d.concat(b);
		System.out.println(d);
		System.out.println(c.compareTo(d));
		for(i=0 ;i<=a.length();i++){
			caracteres=i;
		}
		System.out.println("los caracteres de a son: "+caracteres);
		for(i=0 ;i<=b.length();i++){
			caracteres=i;
		}
		System.out.println("los caracteres de b son: "+caracteres);
		for(i=0 ;i<=c.length();i++){
			caracteres=i;
		}
		System.out.println("los caracteres de c son: "+caracteres);
		for(i=0 ;i<=c.length();i++){
			caracteres=i;
		}
		System.out.println("los caracteres de d son: "+caracteres);
		a=(a+e);
		b=(b+e);
		a=(a+b);
		a=(a+e);
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	
	}
}
		

		 