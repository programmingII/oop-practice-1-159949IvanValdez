/* 159949 Luis Ivan Valdez Anchondo 21/02/2019 01:23p.m */

import java.util.Scanner; //me permite escanear una entrada por teclado

public class Ejercicio36_DistanciaEntrePuntos{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in); // Aqui creamos un objeto de la clase Scanner al cual llame sc y lo asociamos al teclado con System.in
	
	System.out.println("Ingrese la latitud de la coordenada 1:"); //Imprime el mensaje en pantalla
	double lat1=sc.nextDouble(); // aqui usamos el metodo del objeto para recibir un valor del teclado y lo asignamos a la variable lat1
	
	System.out.println("Ingrese la longitud de la coordenada 1:"); //Imprime el mensaje en pantalla
	double lon1=sc.nextDouble(); // aqui usamos el metodo del objeto para recibir un valor del teclado y lo asignamos a la variable lon1

	System.out.println("Ingrese la latitud de la coordenada 2:"); //Imprime el mensaje en pantalla
	double lat2=sc.nextDouble(); // aqui usamos el metodo del objeto para recibir un valor del teclado y lo asignamos a la variable lat2

	System.out.println("Ingrese la longitud de la coordenada 2:"); //Imprime el mensaje en pantalla
	double lon2=sc.nextDouble(); // aqui usamos el metodo del objeto para recibir un valor del teclado y lo asignamos a la variable lon2

	lat1=Math.toRadians(lat1);//con Math.toRadians llamamos al objeto toRadians de la clase Math para convertir los grados de las medidas a radianes
	lon1=Math.toRadians(lon1);//con Math.toRadians llamamos al objeto toRadians de la clase Math para convertir los grados de las medidas a radianes
	lat2=Math.toRadians(lat2);//con Math.toRadians llamamos al objeto toRadians de la clase Math para convertir los grados de las medidas a radianes
	lon2=Math.toRadians(lon2);//con Math.toRadians llamamos al objeto toRadians de la clase Math para convertir los grados de las medidas a radianes

	double RadioTierra=6371.01;// Es el radio en Kilometros	

	double Distancia=RadioTierra*Math.acos(Math.sin(lat1)*Math.sin(lat2) + Math.cos(lat1)*Math.cos(lat2)*Math.cos(lon1 - lon2));//Mandamos a llamar a los de la clase Math para hacer los calculos  	

	System.out.println("La distancia entre los puntos es: "+Distancia25);// Imprimimos el resultado de las operaciones
	}
}