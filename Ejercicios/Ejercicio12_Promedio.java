/* 159949 Luis Ivan Valdez Anchondo 07/02/2019 1:21p.m */

import java.util.Scanner; //me permite escanear una entrada por teclado

public class Ejercicio12_Promedio{
	public static void main(String[] args){
	Scanner ent = new Scanner(System.in); // Aqui creamos un objeto de la clase Scanner al cual llame ent y lo asociamos al teclado con System.in
	System.out.println("Ingrese un numero");
	float n1=ent.nextFloat(); // aqui usamos el metodo del objeto para recibir un valor del teclado y lo asignamos a la variable	
	System.out.println("Ingrese otro numero");
	float n2=ent.nextFloat(); // aqui usamos el metodo del objeto para recibir un valor del teclado y lo asignamos a la variable	
	System.out.println("Ingrese otro numero");
	float n3=ent.nextFloat(); // aqui usamos el metodo del objeto para recibir un valor del teclado y lo asignamos a la variable	

	double prom=(n1+n2+n3)/3; //Declaro la variable prom y hago la operacion del promedio

	System.out.println("El promedio de los 3 numeros es: "+prom); //Imprimo los resultados	

	}
}