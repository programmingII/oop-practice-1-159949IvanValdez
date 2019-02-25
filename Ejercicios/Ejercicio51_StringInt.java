/* 159949 Luis Ivan Valdez Anchondo 25/02/2019  02:39pm.*/

import java.util.Scanner; //me permite escanear una entrada por teclado

public class Ejercicio51_StringInt{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in); // Aqui creamos un objeto de la clase Scanner al cual llame sc y lo asociamos al teclado con System.in
		System.out.println("Ingrese un numero(String): ");
		String s=sc.nextLine();// aqui usamos el metodo del objeto para recibir un valor del teclado y lo asignamos a la variable s
		
		int conv=Integer.parseInt(s);//convertimos el string a entero con el metodo parseInt de la clase Integer

		System.out.println("El valor del entero es: "+conv);
	}
}