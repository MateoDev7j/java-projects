import java.util.Scanner;
public class ArraysNumerosAleatorios{
	public static void main(String[]args){
	// variables y objetos
	Scanner scanner = new Scanner(System.in);
	int [] numero;
	numero=new int [20];
	int [] numero1;
	numero1=new int[20];
	int[] numero2;
	numero2=new int[20];
	// resolver 
	for(int i=0;i<=20;i++){
		System.out.println(numero[i]=(int)(Math.random()*(100-0+1)+1));
		numero[i]=(int)(Math.random()*(100-0+1)+1);
	}
	
	}
	}
}