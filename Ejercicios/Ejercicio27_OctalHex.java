/* 159949 Luis Ivan Valdez Anchondo 16/02/2019  4:46pm.*/

import java.util.Scanner; //me permite escanear una entrada por teclado

public class Ejercicio27_OctalHex{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in); // Aqui creamos un objeto de la clase Scanner al cual llame sc y lo asociamos al teclado con System.in	
	
	System.out.println("Ingrese un numero octal");// imprime el mensaje en pantalla 
	String oct=sc.nextLine();//Declaramos la variable oct como String y le asignamos el valor que se ingreso por medio del teclado usando el metodo nextLine() del objeto sc 

	int conv=Integer.parseInt(oct,8);//declaramos la variable conv como int y convertimos la variable oct a un decimal

	String hex=Integer.toString(conv,16).toUpperCase();//declaramos la variable hex como string y convertimos la variable conv a un String con base 16 para hexadecimal con el metodo toString y con el metodo toUpperCase() llamamos a las letras en mayusculas

	System.out.println("El octal convertido a hexadecimal es: "+hex);//se imprime el hexadecimal.
	}
}