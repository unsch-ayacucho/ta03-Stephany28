/**************************************************************
 * Ejercicio_2.java
 * @author Phany
 *
 *Realiza un programa que pida 10 números por teclado y que los almacene en un
array. A continuación, se mostrará el contenido de ese array junto al índice (0 –
9) utilizando para ello una tabla. Seguidamente el programa pasará los primos a
las primeras posiciones, desplazando el resto de los números (los que no son
primos) de tal forma que no se pierda ninguno. Al final se debe mostrar el array
resultante.
 **************************************************************/
import java.util.Scanner;
public class Ejercicio_2 {

	public static void main(String[] args) {
			
		int[] arreglo = new int [10];//Se crea un arreglo para 10 valores
		
		Scanner stdIn = new Scanner(System.in);
		
		//Solicitud de números al usuario
		for(int i=0;i<10;i++) {
			System.out.print("Inserta un número: ");
			arreglo[i]=stdIn.nextInt();
			
		}
		System.out.println("El arreglo es: ");
		
		//Se imprimen los indices
		System.out.print("\t Indices: ");
		for(int i=0;i<10;i++) {
				
				System.out.print(i+" ");
		}
		System.out.println();//Salto de linea
		
		//Se impremen los numeros del usuario
		System.out.print("\t Números: ");
		for(int i=0;i<10;i++) {
		        System.out.print(arreglo[i]+" ");
		}    		
		System.out.println();
	/*************************************************************************/
		System.out.println("El nuevo arreglo es: ");
		//Seleccion de los numeros primos
		for(int i=0;i<arreglo.length;i++) {
			int divisor=2;
			while(arreglo[i]%divisor!=0) {
				divisor++;
			}
			if(divisor == arreglo[i]) {
				
				System.out.print(arreglo[i]+" ");
				arreglo[i]=0;
			}
			
			
		}
		System.out.print("\t");
		//Se imprime el array del usuario pero con numeros 0 en vez de los primos
		for(int j=0;j<arreglo.length;j++) {
			System.out.print(arreglo[j]+" ");
		}

	}

}
