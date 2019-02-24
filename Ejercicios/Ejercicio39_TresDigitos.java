/* 159949 Luis Ivan Valdez Anchondo 23/02/2019 08:10p.m */

public class Ejercicio39_TresDigitos{
	public static void main(String[] args){
		int contador= 0;
		for(int i = 1; i <= 4; i++){//se usan 4 ciclos for con los numeros del 1 al 4 para hacer las combinaciones
			for(int j = 1; j <= 4; j++){
				for(int k = 1; k <= 4; k++){
					if(k != i && k != j && i != j){//este ciclo for es para evitar la repeticion de las combinaciones
						contador++;//incrementa el contador cada vez que una nueva combinacion se encuentre
						System.out.println(i + "" + j + "" + k);//imprime las combinaciones posibles
					}
				}
			}
		}
		System.out.println("El total de combinaciones es de: "+contador);// se imprime el total de combinaciones
	}
}