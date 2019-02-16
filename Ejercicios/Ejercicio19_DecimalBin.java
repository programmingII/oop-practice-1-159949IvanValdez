/* 159949 Luis Ivan Valdez Anchondo 16/02/2019  2:32pm.*/

import java.util.Scanner; //me permite escanear una entrada por teclado

public class Ejercicio19_DecimalBin{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in); // Aqui creamos un objeto de la clase Scanner al cual llame sc y lo asociamos al teclado con System.in	
	
	System.out.println("Ingrese un numero decimal");// imprime el mensaje en pantalla 
	int dec=sc.nextInt();//Declaramos la variable dec como int y le asignamos el valor que se ingreso por medio del teclado usando el metodo nextInt() del objeto sc 

	String	bin=Integer.toString(dec,2);//declaramos la variable bin como string y convertimos la variable dec a un String con base 2 para binario con el metodo toString

	System.out.println("El decimal convertido a binario es: "+bin);//se imprime el binario.
	}
}