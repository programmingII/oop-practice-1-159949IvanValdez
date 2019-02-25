/* 159949 Luis Ivan Valdez Anchondo 25/02/2019  03:48pm.*/

import java.util.Scanner; //me permite escanear una entrada por teclado

public class Ejercicio57_FactorialesCuenta{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in); // Aqui creamos un objeto de la clase Scanner al cual llame sc y lo asociamos al teclado con System.in
		System.out.println("Ingrese un numero: ");
		int n=sc.nextInt();// aqui usamos el metodo del objeto para recibir un valor del teclado y lo asignamos a la variable n

		int cont=0;//creo una variable de tipo entero para que sirva de contador

		for(int i=1; i<=(int)Math.sqrt(n); i++){//uso el for para recorrer todos los numeros desde el 1 hasta la raiz del numero ingresado, utilizo el int antes de math.sqrt para convertir el numero en un etero, y utilizo el metodo sqrt de la clase math para la raiz
            		if(n%i==0 && i*i!=n) cont+=2; //con el if voy descartando los valores que no son factoriales
			else if(i*i==n) cont++;
        	}
		System.out.println(cont);//imprimo el resultado 
	}
}