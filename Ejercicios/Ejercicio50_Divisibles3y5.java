/* 159949 Luis Ivan Valdez Anchondo 25/02/2019  02:33pm.*/

public class Ejercicio50_Divisibles3y5{
	public static void main(String[] args){
		System.out.println("\nDivided by 3: ");	//Imprime el mensaje	
		for (int i=1; i<100; i++) {//ciclo for para recorrer los numeros del 1 al 99
			if (i%3==0) System.out.print(i +", ");//Imprime el mensaje y los numeros que son divisibles entre 3 en caso de cumplir la condicion			
		}			
				
		System.out.println("\n\nDivided by 5: ");//Imprime el mensaje
		for (int i=1; i<100; i++) {//ciclo for para recorrer los numeros del 1 al 99
			if (i%5==0) System.out.print(i +", ");//Imprime el mensaje y los numeros que son divisibles entre 5 en caso de cumplir la condicion			
		}
				
		System.out.println("\n\nDivided by 3 & 5: ");	//Imprime el mensaje		
		for (int i=1; i<100; i++) {//ciclo for para recorrer los numeros del 1 al 99
			if (i%3==0 && i%5==0) System.out.print(i +", ");//Imprime el mensaje y los numeros que son divisibles entre 3 y 5 en caso de cumplir la condicion			
		}
	}
}