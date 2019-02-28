/* 159949 Luis Ivan Valdez Anchondo 27/02/2019  05:38pm.*/

import java.util.Scanner;//me permite escanear una entrada por teclado

public class Ejercicio69_PrimerMitad {
	public static void main(String[] args){	
     	Scanner sc = new Scanner(System.in);// Aqui creamos un objeto de la clase Scanner al cual llame sc y lo asociamos al teclado con System.in
	System.out.print("Ingrese un enunciado: ");// imprime el mensaje en pantalla
	String enun = sc.nextLine();// aqui usamos el metodo nextLine() del objeto sc para recibir un valor del teclado y lo asignamos a la variable enun de tipo string
	
	System.out.println(enun.substring(0,enun.length()/2));
	//imprimo la subcadena de enun que comienza en 0 y termina a la mitad de su tamaño total
	}			
}