/* 159949 Luis Ivan Valdez Anchondo 21/02/2019  12:32pm.*/

import java.util.Scanner; //me permite escanear una entrada por teclado

public class Ejercicio32_CompararNum{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in); // Aqui creamos un objeto de la clase Scanner al cual llame sc y lo asociamos al teclado con System.in	
	
	System.out.println("Ingrese el primer numero");// imprime el mensaje en pantalla 
	int n1=sc.nextInt();//Declaramos la variable n1 como int y le asignamos el valor que se ingreso por medio del teclado usando el metodo nextInt() del objeto sc 

	System.out.println("Ingrese el primer numero");// imprime el mensaje en pantalla 
	int n2=sc.nextInt();//Declaramos la variable n2 como int y le asignamos el valor que se ingreso por medio del teclado usando el metodo nextInt() del objeto sc 
	
	if(n1>n2) System.out.println(n1+">"+n2+"\n");//Uso la condicion del if n1>n2 para imprimir el mensaje en caso de que se cumpla 
	if(n1<n2) System.out.println(n1+"<"+n2+"\n");//Uso la condicion del if n1<n2 para imprimir el mensaje en caso de que se cumpla 
	if(n1>=n2) System.out.println(n1+">="+n2+"\n");//Uso la condicion del if n1>=n2 para imprimir el mensaje en caso de que se cumpla 
	if(n1<=n2) System.out.println(n1+"<="+n2+"\n");//Uso la condicion del if n1<=n2 para imprimir el mensaje en caso de que se cumpla 
	if(n1==n2) System.out.println(n1+"="+n2+"\n");//Uso la condicion del if n1==n2 para imprimir el mensaje en caso de que se cumpla 
	if(n1!=n2) System.out.println(n1+"!="+n2+"\n");//Uso la condicion del if n1!=n2 para imprimir el mensaje en caso de que se cumpla 
	}
}