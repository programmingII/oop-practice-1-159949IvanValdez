/* 159949 Luis Ivan Valdez Anchondo 08/02/2019 02:07 p.m. */

import java.util.Scanner; //me permite escanear una entrada por teclado

public class Ejercicio13_Rectangulo{
	public static void main(String[] args){
	Scanner scan=new Scanner (System.in);// Aqui creamos un objeto de la clase Scanner al cual llame scan y lo asociamos al teclado con System.in
	System.out.println("Ingrese la altura del rectangulo");// Imprime el mensaje en la consola
	float al=scan.nextFloat();// aqui usamos el metodo del objeto para recibir un valor del teclado y lo asignamos a la variable

	System.out.println("Ingrese el ancho del rectangulo");// Imprime el mensaje en la consola
	float an=scan.nextFloat();// aqui usamos el metodo del objeto para recibir un valor del teclado y lo asignamos a la variable

	float area=al*an;// Formula para sacar el area de un rectangulo
	float perim=2*(al+an);// Formula para sacar el perimetro de un rectangulo
	
	System.out.println("El area del rectangulo es: "+area);// Imprimimos el resultado de las operaciones
	System.out.println("El perimetro del rectangulo es: "+perim);// Imprimimos el resultado de las operaciones

	}
}
