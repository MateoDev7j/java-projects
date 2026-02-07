import.java.util.Scanner;
public class ArraysInicializando{
	public static void main(String[]args){
	// variables y objetos
	Scanner scanner = new Scanner(System.in);
	int [] num;
	num = new int [10];
	//resolvemos
	for(i=0;i<num.length;i++;){
		System.out.println("");
		num[i]=scanner.nextInt();
	}
	//salida
	for(i=(num.length-1);i<=0;i--){
		System.out.println("");
	}