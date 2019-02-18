/* 159949 Luis Ivan Valdez Anchondo 17/02/2019  8:40pm.*/

import java.util.Scanner; //me permite escanear una entrada por teclado

public class Ejercicio29_HexadecimalBin{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in); // Aqui creamos un objeto de la clase Scanner al cual llame sc y lo asociamos al teclado con System.in	
	
	System.out.println("Ingrese un numero Hexadecimal");// imprime el mensaje en pantalla 
	String hex=sc.nextLine();//Declaramos la variable hex como String y le asignamos el valor que se ingreso por medio del teclado usando el metodo nextLine() del objeto sc 

	int conv=Integer.parseInt(hex,16);//declaramos la variable conv como int y convertimos la variable hex a un decimal

	String bin=Integer.toString(conv,2);//declaramos la variable bin como string y convertimos la variable conv a un String con base 2 para binario con el metodo toString

	System.out.println("El hexadecimal convertido a binario es: "+bin);//se imprime el binario.
	}
}
