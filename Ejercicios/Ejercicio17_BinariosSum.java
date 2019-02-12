/* 159949 Luis Ivan Valdez Anchondo 12/02/2019  12:22pm.*/

import java.util.Scanner; //me permite escanear una entrada por teclado

public class Ejercicio17_BinariosSum{
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in); // Aqui creamos un objeto de la clase Scanner al cual llame sc y lo asociamos al teclado con System.in
	String bin1,bin2; //los binarios los voy a capturar en en String porque asi se almacenan con un formato numerico y me facilita usar una funcion para convertir el texto en un valor numerico
	int conv1, conv2, result;//estas variables las voy a usar para convertir los binarios y el resultado

	System.out.println("Ingrese el primer numero binario");
	bin1=sc.nextLine();
	System.out.println("Ingresar el segundo numero binario");
	bin2=sc.nextLine();

	conv1=Integer.parseInt(bin1,2);//Aqui con la funcion parseInt convertimos los datos del String 	a decimal 
	conv2=Integer.parseInt(bin2,2);//Aqui con la funcion parseInt convertimos los datos del String 	a decimal 

	result=conv1+conv2;

	String	res=Integer.toString(result,2);

	System.out.println("El resultado de la suma es: "+res);
	}
}