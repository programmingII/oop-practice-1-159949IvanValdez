/* 159949 Luis Ivan Valdez Anchondo 21/02/2019 01:17p.m */

import java.util.Scanner; //me permite escanear una entrada por teclado

public class Ejercicio35_AreaPoligono{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in); // Aqui creamos un objeto de la clase Scanner al cual llame sc y lo asociamos al teclado con System.in
	
	System.out.println("Ingrese numero de lados del poligono:"); //Imprime el mensaje en pantalla
	double n=sc.nextDouble(); // aqui usamos el metodo del objeto para recibir un valor del teclado y lo asignamos a la variable n
	
	System.out.println("Ingrese el tamaño del lado del poligono:"); //Imprime el mensaje en pantalla
	double s=sc.nextDouble(); // aqui usamos el metodo del objeto para recibir un valor del teclado y lo asignamos a la variable s
	
	double area=(n*(s*s))/(4*Math.tan((Math.PI)/n));//formula para el area, en Math.PI mandamos a llamar al objeto PI de la clase Math y con Math.tan mandamos a llamar el objeto tan del la clase Math

	System.out.println("El Area es del poligono es: "+area);// Imprimimos el resultado de las operaciones
	}
}