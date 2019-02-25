/* 159949 Luis Ivan Valdez Anchondo 25/02/2019  03:17pm.*/

import java.util.Scanner; //me permite escanear una entrada por teclado

public class Ejercicio55_SegundosAHorasMS{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in); // Aqui creamos un objeto de la clase Scanner al cual llame sc y lo asociamos al teclado con System.in
		System.out.println("Ingrese la cantidad de segundos: ");
		int seg=sc.nextInt();// aqui usamos el metodo del objeto para recibir un valor del teclado y lo asignamos a la variable n1
		int S=seg%60;//declaramos la varible S y obtenemos los segundos sacandole el modulo para representar los segundos
		int H=seg/60;// declaramos la variable H y obtenemos los minutos al dividirlo por 60, con esto sacaremos las horas y los minutos mas adelante
		int M=H%60;//declaramos la variable m y obtenemos los minutos totales al sacarle el modulo a H
		H=H/60;// aqui sacamos las Horas totales 

		System.out.println(H+":"+M+":"+S);//imprimimos los resultados
	}
}