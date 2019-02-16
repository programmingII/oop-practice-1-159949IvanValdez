/* 159949 Luis Ivan Valdez Anchondo 16/02/2019  2:11pm.*/

import java.util.Scanner; //me permite escanear una entrada por teclado

public class Ejercicio18_BinariosProd{
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in); // Aqui creamos un objeto de la clase Scanner al cual llame sc y lo asociamos al teclado con System.in
	String bin1,bin2; //los binarios los voy a capturar en en String porque asi se almacenan con un formato numerico y me facilita usar una funcion para convertir el texto en un valor numerico
	int conv1, conv2, result;//estas variables las voy a usar para convertir los binarios y el resultado

	System.out.println("Ingrese el primer numero binario");// imprime el mensaje en pantalla 
	bin1=sc.nextLine();//asignamos a la variable bin1 el valor que se ingreso por medio del teclado usando el metodo nextLine() del objeto sc 
	System.out.println("Ingresar el segundo numero binario");// imprime el mensaje en pantalla 
	bin2=sc.nextLine();//asignamos a la variable bin2 el valor que se ingreso por medio del teclado usando el metodo nextLine() del objeto sc 

	conv1=Integer.parseInt(bin1,2);//Aqui con el metodo parseInt convertimos los datos del String a decimal y los asignamos a la variable conv1
	conv2=Integer.parseInt(bin2,2);//Aqui con el metodo parseInt convertimos los datos del String a decimal y los asignamos a la variable conv2

	result=conv1*conv2;//hacemos el producto de los numeros que convertimos a decimal anteriormente

	String	res=Integer.toString(result,2);//Volvemos a convertir el resultado de el producto a un String con base 2 para binario con el metodo toString

	System.out.println("El resultado del producto es: "+res);//se imprime el resultado convertido en binario.
	}
}