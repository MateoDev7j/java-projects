//Lee una cadena, convierte a mayúscula el primer carácter de cada palabra y el resto a minúsculas.

import java.util.Scanner;
	public class MayusPrimerCaracterDos{
		public static void main(String[] args){
		
		Scanner cs=new Scanner(System.in);
		
		String cadena, cad, cad3;
		int i, contador=0;
		
		cad3="";
		
		System.out.print("Escriba algo: ");
		 cadena = cs.nextLine();
		 
		 //cadena.charAt(0).toUpperCase();
		 
		 for (i=0 ; i!=cadena.length() ; i++)
			{
				contador++;
				
				if (contador==1)
				{
					
					//System.out.print(Character.toUpperCase(cadena.charAt(i)));
					cad3+=Character.toUpperCase(cadena.charAt(i));
				}
				else
				{
					
					//System.out.print(Character.toLowerCase(cadena.charAt(i)));
					cad3+=Character.toLowerCase(cadena.charAt(i));
				}
				
				if (cadena.charAt(i) == ' '){
				 
				 contador=0;
				 
				 
				 
				}
				
			}
			
			System.out.println(cad3);
		}
	}