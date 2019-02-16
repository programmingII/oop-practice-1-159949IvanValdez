/* 159949 Luis Ivan Valdez Anchondo 16/02/2019  3:28pm.*/

import java.util.Scanner; //me permite escanear una entrada por teclado

public class Ejercicio23_BinaryHex{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in); // Aqui creamos un objeto de la clase Scanner al cual llame sc y lo asociamos al teclado con System.in	
	
	System.out.println("Ingrese un numero binario");// imprime el mensaje en pantalla 
	String	bin=sc.nextLine();//Declaramos la variable bin como String y le asignamos el valor que se ingreso por medio del teclado usando el metodo nextLine() del objeto sc 
	
	int conv=Integer.parseInt(bin,2);//declaramos la variable conv como int y convertimos la variable bin a un decimal

	String	hex=Integer.toString(conv,16).toUpperCase();//declaramos la variable hex como string y convertimos la variable bin a un String con base 16 para hexadecimal con el metodo toString y con el metodo toUpperCase() llamamos a las letras en mayusculas

	System.out.println("El binario convertido a hexadecimal es: "+hex);//se imprime el hexadecimal.

	}
}
