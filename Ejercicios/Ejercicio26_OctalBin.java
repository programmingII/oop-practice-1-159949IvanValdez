/* 159949 Luis Ivan Valdez Anchondo 16/02/2019  4:38pm.*/

import java.util.Scanner; //me permite escanear una entrada por teclado

public class Ejercicio26_OctalBin{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in); // Aqui creamos un objeto de la clase Scanner al cual llame sc y lo asociamos al teclado con System.in	
	
	System.out.println("Ingrese un numero octal");// imprime el mensaje en pantalla 
	String oct=sc.nextLine();//Declaramos la variable oct como String y le asignamos el valor que se ingreso por medio del teclado usando el metodo nextLine() del objeto sc 

	int conv=Integer.parseInt(oct,8);//declaramos la variable conv como int y convertimos la variable oct a un decimal

	String bin=Integer.toString(conv,2);//declaramos la variable bin como string y convertimos la variable dec a un String con base 2 para binario con el metodo toString

	System.out.println("El octal convertido a binario es: "+bin);//se imprime el binario.
	}
}