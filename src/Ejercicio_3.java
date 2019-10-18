/**************************************************************
 * Ejercicio_3.java
 * @author Phany
 *
 *Escribe un programa que rellene un array de 100 elementos con n�meros
enteros aleatorios comprendidos entre 0 y 500 (ambos incluidos). A
continuaci�n, el programa mostrar� el array y preguntar� si el usuario quiere
destacar el m�ximo o el m�nimo. Seguidamente se volver� a mostrar el array
escribiendo el n�mero destacado entre dobles asteriscos.
 **************************************************************/
import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio_3 {

	public static void main(String[] args) {
		int _numSolicitado,aleatorio,_mayor=0,_menor=0;//Se declaran las variables necesarias
		Scanner stdIn =  new Scanner(System.in);
		ArrayList <Integer> numeros = new ArrayList<>();//Creaci�n de un arraList para numeros enteros
		
		for(int i=0;i<=10;i++) {
			aleatorio=(int)(Math.random()*500)+1;//generar� n�meros aleatorios hasta 500
			numeros.add(aleatorio);//se agregaran los numeros al arraList
			System.out.print(numeros.get(i)+" ");//Se imprimen los valores
			_mayor=_menor=numeros.get(0);//mayor y menor tienen el valor del primer numero del array
		}
		
		//Solitud de datos al usuario
		System.out.print("\n Ingrese 0 si quiere el n�mero menor."
				+ "De lo contrario ingrese 1: ");
		_numSolicitado=stdIn.nextInt();
		while(true) {
			if(_numSolicitado==0||_numSolicitado==1) {//Los n�meros solo deben ser 0 y 1
				if(_numSolicitado==0) {//Si es cero se mostrar� el numero menor
					System.out.println("Ha solicitado el n�mero menor.");
					for(int i=0;i<numeros.size()-1;i++) {
						
						if(_menor>numeros.get(i)) {//Se hace una comparacion del primer numero con los otros de la lista
							_menor=numeros.get(i);//Si se cumple la condici�n, menor adquiere otro valor
							
						}
					}
					//Se imprime la nueva lista
					System.out.println("La nueva lista es: ");
					for(int i=0;i<numeros.size()-1;i++) {
						if(numeros.get(i)==_menor) {
							System.out.print("\""+_menor+"\"");//El menor se imprimir� con comillas
						}
						else {
							System.out.print(numeros.get(i)+" ");//El resto estar� distanciado
						}
						
					}
				}
				else {
					System.out.println("Ha solicitado el n�mero mayor.");//Opci�n del n�mero 1
					for(int i=0;i<numeros.size()-1;i++) {
						
						if(_mayor<numeros.get(i)) {//Se realiza la comparaci�n y si es verdadera cambia de valor
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
				System.out.print("NO es un valor v�lido. �Ingrese 0 o 1!: ");//Vuelve a pedir un numero si el dato no es 0 ni 1
				_numSolicitado=stdIn.nextInt();
			}
			
		}
		
		
		
	}

}
