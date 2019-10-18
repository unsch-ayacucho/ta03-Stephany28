/**************************************************************
 * Ejercicio_3.java
 * @author Phany
 *
 *Escribe un programa que rellene un array de 100 elementos con números
enteros aleatorios comprendidos entre 0 y 500 (ambos incluidos). A
continuación, el programa mostrará el array y preguntará si el usuario quiere
destacar el máximo o el mínimo. Seguidamente se volverá a mostrar el array
escribiendo el número destacado entre dobles asteriscos.
 **************************************************************/
import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio_3 {

	public static void main(String[] args) {
		int _numSolicitado,aleatorio,_mayor=0,_menor=0;//Se declaran las variables necesarias
		Scanner stdIn =  new Scanner(System.in);
		ArrayList <Integer> numeros = new ArrayList<>();//Creación de un arraList para numeros enteros
		
		for(int i=0;i<=10;i++) {
			aleatorio=(int)(Math.random()*500)+1;//generará números aleatorios hasta 500
			numeros.add(aleatorio);//se agregaran los numeros al arraList
			System.out.print(numeros.get(i)+" ");//Se imprimen los valores
			_mayor=_menor=numeros.get(0);//mayor y menor tienen el valor del primer numero del array
		}
		
		//Solitud de datos al usuario
		System.out.print("\n Ingrese 0 si quiere el número menor."
				+ "De lo contrario ingrese 1: ");
		_numSolicitado=stdIn.nextInt();
		while(true) {
			if(_numSolicitado==0||_numSolicitado==1) {//Los números solo deben ser 0 y 1
				if(_numSolicitado==0) {//Si es cero se mostrará el numero menor
					System.out.println("Ha solicitado el número menor.");
					for(int i=0;i<numeros.size()-1;i++) {
						
						if(_menor>numeros.get(i)) {//Se hace una comparacion del primer numero con los otros de la lista
							_menor=numeros.get(i);//Si se cumple la condición, menor adquiere otro valor
							
						}
					}
					//Se imprime la nueva lista
					System.out.println("La nueva lista es: ");
					for(int i=0;i<numeros.size()-1;i++) {
						if(numeros.get(i)==_menor) {
							System.out.print("\""+_menor+"\"");//El menor se imprimirá con comillas
						}
						else {
							System.out.print(numeros.get(i)+" ");//El resto estará distanciado
						}
						
					}
				}
				else {
					System.out.println("Ha solicitado el número mayor.");//Opción del número 1
					for(int i=0;i<numeros.size()-1;i++) {
						
						if(_mayor<numeros.get(i)) {//Se realiza la comparación y si es verdadera cambia de valor
							_mayor=numeros.get(i);
							
						}
						
					}
					//Se imprime la nueva lista
					System.out.println("La nueva lista es: ");
					for(int i=0;i<numeros.size()-1;i++) {
						if(numeros.get(i)==_mayor) {
							System.out.print("\""+_mayor+"\"");//Solo el numero mayor se imprime con comillas
						}
						else {
							System.out.print(numeros.get(i)+" ");//El resto esta separado con espacios
						}
						
					}
				}
				break;//Si cumple cualquiera de las dos condiciones sale del bucle
			}
			else {
				System.out.print("NO es un valor válido. ¡Ingrese 0 o 1!: ");//Vuelve a pedir un numero si el dato no es 0 ni 1
				_numSolicitado=stdIn.nextInt();
			}
			
		}
		
		
		
	}

}
