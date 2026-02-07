public class SumarValoresDeArray{
	public static void main(String[]args){
	// variables y objetos
	int suma=0,var1=2,var2=4;
	// declaracion de un array
	int [] array1;
	double [] array2 = {2.3,8.4,0.25}
	//creacion con tamaño 5
	array1 = new int[5];
	
	//inicializar el array con los primeros 5 numeros
	array1[0]=1;
	array1[1]=2;
	array1[2]=3;
	array1[3]=4;
	array1[4]=5;
	//sumar los elementos del array
	//suma=array1[0]+array1[1]+array1[2]+array1[3]+array1[4];
	
	/*for (int i=0;i<array1.length;i++){
		suma += array1[i];
	}
	System.out.println("Suma: "+suma);*/
	//sumar metodos de array utilizando un metodo
	System.out.println("Suma: "+sumarArrayInt(array1));
	System.out.printf("Sumar %d+%d = %d",var1,var2,sumar2Valores(var1,var2));
	}    
	//Metodo para sumar los elemtnos de un array
	static int sumarArrayInt(int [] array){
		//variable para acomular la suma
		int suma=0;
		//bucle para recorrer el array
		for(int i=0;i<array.length;i++){
			suma+=array[i];
		}
		//devolver el valor con la suma
		return suma;
	}
	//metodo para sumar dos valores 
	static int sumar2Valores(int a, int b){
		return a+b;
	}
}
