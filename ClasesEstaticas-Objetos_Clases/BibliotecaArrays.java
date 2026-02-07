public class BibliotecaArrays{
	//Metodos estaticos 
	public static int[] generaArrayInt1(int tamaño, int min, int max)
	{
		int [] array = new int[tamaño];
		for(int i=0;i<array.length;i++)
		{
			array[i] = (int)(Math.random() * (max-min+1)+min);
		}
		return array;
	}
}