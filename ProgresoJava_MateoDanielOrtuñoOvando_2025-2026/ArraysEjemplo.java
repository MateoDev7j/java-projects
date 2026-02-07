public class ArraysEjemplo{
	public static void main(String[]args){
	// variables y objetos
	String  [] num;
	num = new String [12];
	num[0]="ola";
	num[4]="ola";
	num[6]="ola";
	num[8]="ola";
	num[9]="ola";
	//resolvemos
	System.out.println("este es el array");
	for(int i=0;i<num.length;i++){
		System.out.println(num[i]);
	}
	}
}