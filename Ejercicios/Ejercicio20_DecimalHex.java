/* 159949 Luis Ivan Valdez Anchondo 16/02/2019  2:48pm.*/

import java.util.Scanner; //me permite escanear una entrada por teclado

public class Ejercicio20_DecimalHex{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in); // Aqui creamos un objeto de la clase Scanner al cual llame sc y lo asociamos al teclado con System.in	
	
	System.out.println("Ingrese un numero decimal");// imprime el mensaje en pantalla 
	int dec=sc.nextInt();//Declaramos la variable dec como int y le asignamos el valor que se ingreso por medio del teclado usando el metodo nextInt() del objeto sc 

	String	hex=Integer.toString(dec,16).toUpperCase();//declaramos la variable hex como string y convertimos la variable dec a un String con base 16 para hexadecimal con el metodo toString y con el metodo toUpperCase() llamamos a las letras en mayusculas

	System.out.println("El decimal convertido a hexadecimal es: "+hex);//se imprime el hexadecimal.
	}
}