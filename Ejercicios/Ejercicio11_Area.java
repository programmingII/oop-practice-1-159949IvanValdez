/* 159949 Luis Ivan Valdez Anchondo 07/02/2019 12:57p.m */

import java.util.Scanner; //me permite escanear una entrada por teclado

public class Ejercicio11_Area{
	public static void main(String[] args){
	Scanner rad = new Scanner(System.in); // Aqui creamos un objeto de la clase Scanner al cual llame num y lo asociamos al teclado con System.in
	System.out.println("Ingrese el radio:"); //
	double n=rad.nextDouble(); // aqui usamos el metodo del objeto para recibir un valor del teclado y lo asignamos a la variable n
	
	double area=(Math.PI)*(n*n);//formula para el area, en Math.PI mandamos a llamar al objeto PI de la clase Math 
	double perimetro=(2*Math.PI)*n;//formula para el perimetro, en Math.PI mandamos a llamar al objeto PI de la clase Math 

	System.out.println("El Area es: "+area);// Imprimimos el resultado de las operaciones
	System.out.println("El Perimetro es: "+perimetro);// Imprimimos el resultado de las operaciones
	}
}