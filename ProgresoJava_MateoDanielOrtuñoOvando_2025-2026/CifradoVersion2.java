import java.util.regex.*;
import java.util.Scanner;
import java.util.NoSuchElementException;

public class CifradoVersion2{
	public static void main(String[]args){
		String [][] matriz ={{"A","B","C","D","E"},
			{"F","G","H","I","K"},
			{"L","M","N","O","P"},
			{"Q","R","S","T","U"},
			{"V","W","X","Y","Z"}
		};
		//variables
		String mensaje="";
		StringBuilder mensajeCifrado = new StringBuilder();
		boolean correcto=false;
		Scanner scanner = new Scanner(System.in);
		Pattern patron = Pattern.compile("[A-Z ]+");
		Matcher mMensaje;
		int i,fil,col;
		
		//Estructura principal do-while
		do{
			System.out.print("Mensaje a cifrar: ");
			try{
			mensaje=scanner.nextLine().toUpperCase().trim();
			}
			catch(NoSuchElementException e){
				System.out.println(e);
			}
			catch(IllegalStateException e){
				System.out.println(e);
			}
			//verificamos que cumple el regex
			mMensaje= patron.matcher(mensaje);
			if(mMensaje.matches())
			{
				correcto=true;
				//codifico el mensaje 
				for(i=0;i<mensaje.length();i++)
				{
					if(mensaje.charAt(i)=='J')
					{
						mensajeCifrado.append("24");
					}
					else //Recorro la matriz y busco la posicion
					{
						for(fil=0;fil<matriz.length;fil++)
						{
							for(col=0;col<matriz[fil].length;col++)
							{
								if(matriz[fil][col].charAt(0)==mensaje.charAt(i))
								{
									mensajeCifrado.append(fil+1);
									mensajeCifrado.append(col+1);
								}
							}
						}
					}
				}
				//Mostramos en pantalla
				System.out.println("Mensaje cifrado: "+mensajeCifrado);
			}
			else
			{
				System.out.println("Caracter incorrecto. Solo letras no acentuadas y espacios");
			}
			
		}while(!correcto);
		
		
	}
}