import java.util.Scanner;
import java.util.Arrays;
public class MatricesValorMinMax
{
	public static void main(String[]args)
	{
		//variables
		Scanner scanner=new Scanner (System.in);
		int [][] numeros =new int [6][10];
		int numeroAleatorio;
		int valorMax=0, valorMax1=0;
		int valorMin=0, valorMin1=0;
		int valormaximo=0,valorminimo=0;
		//solucionamos
		for(int i=0;i<numeros.length;i++)
		{
			for(int j=0;j<numeros[i].length;j++)
			{
				numeros[i][j]=numeroAleatorio = (int) (Math.random()*1001);
				for(int o=0;o<numeros.length;o++)
				{
					for(int p=0;p<numeros[o].length;p++)
					{
						if(numeroAleatorio==numeros[i][j])
						{
							numeros[i][j]=numeroAleatorio = (int) (Math.random()*1001);
						}
					}
				}
			}
		}
		valorMax = numeros[0][0];
		valorMin= numeros[0][0];
		for(int i=0;i<numeros.length;i++)
		{
			for(int j=0;j<numeros[i].length;j++)
			{
				if(numeros[i][j]>valorMax)
				{
					valorMax=numeros[i][j];
				}
				if(numeros[i][j]<valorMin){
					valorMin=numeros[i][j];
				}
			}
		}
		for(int i=0;i<numeros.length;i++)
		{
			for(int j=0;j<numeros[i].length;j++)
			{
				System.out.printf("%5d ",numeros[i][j]);
				if(numeros[i][j]==valorMax)
				{
					valormaximo=numeros[i][j];
					valorMax=i;
					valorMax1=j;
				}
				if(numeros[i][j]==valorMin)
				{
					valorminimo=numeros[i][j];
					valorMin=i;
					valorMin1=j;
				}
			}
			System.out.println();
		}
		System.out.printf("los valores: \nvalor minimo %d: %d - %d \nvalor maximo %d: %d - %d",valorminimo, valorMin, valorMin1, valormaximo, valorMax, valorMax1);
	}
}