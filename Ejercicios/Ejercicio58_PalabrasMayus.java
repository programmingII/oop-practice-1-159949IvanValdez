/* 159949 Luis Ivan Valdez Anchondo 26/02/2019  01:05pm.*/

import java.util.Scanner;//me permite escanear una entrada por teclado

public class Ejercicio58_PalabrasMayus{
     public static void main(String[] args){
	Scanner sc = new Scanner(System.in);// Aqui creamos un objeto de la clase Scanner al cual llame sc y lo asociamos al teclado con System.in
     	
	System.out.println("Ingrese un enunciado: ");// imprime el mensaje en pantalla
	String enun= sc.nextLine();// aqui usamos el metodo nextLine() del objeto sc para recibir un valor del teclado y lo asignamos a la variable enun de tipo string
	String Mayus = ""; // declaramos una variable string llamada mayus y le asignamos "" como valor 
       
	Scanner enunScan = new Scanner(enun); // aqui creamos un objeto de la clase Scanner llamado enunScan y le asignamos lo que se capturo en la variable enun
        
	while(enunScan.hasNext()){// usamosun while para recorrer todas las palabras del enunciado
             String palabra = enunScan.next(); // creamos un objeto de la clase Scanner
             Mayus += Character.toUpperCase(palabra.charAt(0)) + palabra.substring(1) + " "; 
        }
      	System.out.println(Mayus.trim()); 
    }
}