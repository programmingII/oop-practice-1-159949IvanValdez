/* 159949 Luis Ivan Valdez Anchondo 07/02/2019 12:14p.m */

import java.util.Scanner;

public class Ejercicio7_TablaMultiplicar{
	
	public static void main(String[] args){
	Scanner num = new Scanner(System.in); // Aqui creamos un objeto de la clase Scanner al cual llame num y lo asociamos al teclado con System.in
	System.out.println("Ingrese un entero"); //Aqui imprimimos el texto en consola			
	int n=num.nextInt(); // aqui usamos el metodo del objeto  y lo asignamos a la variable n

	for(int i=1; i<11; i++){ //ciclo for para hacer las multiplicaciones de manera iterativa
		System.out.println(n+"x"+i+"="+n*i); //Imprime los resultados de la operacion
		}
	}
}