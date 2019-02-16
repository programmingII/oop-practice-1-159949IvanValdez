/* 159949 Luis Ivan Valdez Anchondo 16/02/2019  4:27pm.*/

import java.util.Scanner; //me permite escanear una entrada por teclado

public class Ejercicio25_OctalDec{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in); // Aqui creamos un objeto de la clase Scanner al cual llame sc y lo asociamos al teclado con System.in	
	
	System.out.println("Ingrese un numero octal");// imprime el mensaje en pantalla 
	String oct=sc.nextLine();//Declaramos la variable oct como String y le asignamos el valor que se ingreso por medio del teclado usando el metodo nextLine() del objeto sc 

	int conv=Integer.parseInt(oct,8);//declaramos la variable conv como int y convertimos la variable oct a un decimal

	System.out.println("El octal convertido a decimal es: "+conv);//se imprime el decimal.
	}
}