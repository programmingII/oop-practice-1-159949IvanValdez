/* 159949 Luis Ivan Valdez Anchondo 27/02/2019  04:48pm.*/

public class Ejercicio66_SumaPrimos{
	public static void main(String[] args){	
		
		int total=0;//variable para la suma total
		int cont=0;//contador de los numeros primos
		for (int i=1;cont<100;i++){//ciclo for parapara recorrer los numeros del 1 al 100
            		int div= 0;// variable de tipo entero para los divisores
            		int n=0;// variable de tipo entero para el numero actual
			for (int j=1;j<=i;j++){ 
                		n=j;
                		if ((i % j)==0) div++;
            		}
			if (div==2){//cada vez que un numero es primo se aumenta el cntador total y el de los numeros primos
				total+=i;
				cont++;
			}
		}
        	System.out.println (total);// se imprime el total
	}			
}