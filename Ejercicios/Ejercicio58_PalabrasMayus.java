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
             String palabra = enunScan.next(); // declaramos una variable string llamada palabra que va a contener lo que tiene enunScan y con el .next() encuentra y retorna el siguiente token completo del scanner enunScan
             Mayus += Character.toUpperCase(palabra.charAt(0)) + palabra.substring(1) + " ";
		//aqui a la variable Mayus se le van a asignar las palabras o tokens que se leen con la variable palabra, de la clase character usamos el metodo .toUpperCase que convierte en mayusculas lo que le indicamos,
		//en este caso lo combinamos con .charAt(0) para indicarle que solo el caracter en la posicion 0 de es estring es lo que se va a convertir en mayusculas, despues le agregamos con .substring(1) los demas
		//de la palabra comenzando de la posicion 1 para formar la palabra completa otra vez e imprimimos " " para separar las palabras con espacios
        }
      	System.out.println(Mayus.trim()); // imprimimos el enunciado completo y con .trim() nos aseguramos de que cualquier espacio en blando antes o despues del string sea removido
    }
}
