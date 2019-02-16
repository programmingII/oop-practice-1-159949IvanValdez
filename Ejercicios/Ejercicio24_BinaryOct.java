/* 159949 Luis Ivan Valdez Anchondo 16/02/2019  3:45pm.*/

import java.util.Scanner; //me permite escanear una entrada por teclado

public class Ejercicio24_BinaryOct{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in); // Aqui creamos un objeto de la clase Scanner al cual llame sc y lo asociamos al teclado con System.in	
	
	System.out.println("Ingrese un numero binario");// imprime el mensaje en pantalla 
	String	bin=sc.nextLine();//Declaramos la variable bin como String y le asignamos el valor que se ingreso por medio del teclado usando el metodo nextLine() del objeto sc 
	
	int conv=Integer.parseInt(bin,2);//declaramos la variable dec como int y convertimos la variable bin a un decimal

	String	oct=Integer.toString(conv,8).toUpperCase();//declaramos la variable oct como string y convertimos la variable bin a un String con base 8 para octal con el metodo toString

	System.out.println("El binario convertido a octal es: "+oct);//se imprime el octal.

	}
}