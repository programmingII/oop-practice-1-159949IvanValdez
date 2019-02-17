/* 159949 Luis Ivan Valdez Anchondo 16/02/2019  5:25pm.*/

import java.util.Scanner; //me permite escanear una entrada por teclado

public class Ejercicio28_HexadecimalDec{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in); // Aqui creamos un objeto de la clase Scanner al cual llame sc y lo asociamos al teclado con System.in	
	
	System.out.println("Ingrese un numero Hexadecimal");// imprime el mensaje en pantalla 
	String hex=sc.nextLine();//Declaramos la variable hex como String y le asignamos el valor que se ingreso por medio del teclado usando el metodo nextLine() del objeto sc 

	int conv=Integer.parseInt(hex,16);//declaramos la variable conv como int y convertimos la variable hex a un decimal

	System.out.println("El hexadecimal convertido a decimal es: "+conv);//se imprime el decimal.
	}
}