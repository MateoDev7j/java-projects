public class TablaMultiplicarConMetodo {
	//vamos a crear nuestro primer metodo
	
	static void tablaMultiplicar(int num){
		int i, resultado;
		for (i=0; i<=10 ; i++){
			resultado = i*num;
			System.out.println( i +" x " +  num + " = " + resultado);
		}
	}
    public static void main(String[] args) {
		//variables
		int i;
		
		//resolver
		for(i=1;i<=5;i++)
			tablaMultiplicar(i);
		
	}
}