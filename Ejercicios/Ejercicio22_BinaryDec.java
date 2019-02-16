/* 159949 Luis Ivan Valdez Anchondo 16/02/2019  3:18pm.*/

import java.util.Scanner; //me permite escanear una entrada por teclado

public class Ejercicio22_BinaryDec{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in); // Aqui creamos un objeto de la clase Scanner al cual llame sc y lo asociamos al teclado con System.in	
	
	System.out.println("Ingrese un numero binario");// imprime el mensaje en pantalla 
	String	bin=sc.nextLine();//Declaramos la variable bin como String y le asignamos el valor que se ingreso por medio del teclado usando el metodo nextLine() del objeto sc 

	int dec=Integer.parseInt(bin,2);//declaramos la variable dec como int y convertimos la variable bin a un decimal

	System.out.println("El binario convertido a decimal es: "+dec);//se imprime el decimal.

	}
}