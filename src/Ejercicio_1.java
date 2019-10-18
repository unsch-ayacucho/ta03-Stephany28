/**************************************************************
 * Ejercicio_01.java
 * @author Phany
 *
 *Escribe un programa que genere 100 n�meros aleatorios del 0 al 20 y que los
muestre por pantalla separados por espacios. El programa pedir� entonces por
teclado dos valores y a continuaci�n cambiar� todas las ocurrencias del primer
valor por el segundo en la lista generada anteriormente. Los n�meros que se han
cambiado deben aparecer entre comillas.
 **************************************************************/
import java.util.Scanner;


public class Ejercicio_1 {
	public static void main(String[] args) {
		int _num1,_num2;//Se declaran las variables a utilizar
		int [] arreglo = new int[10];//Se realiza un array de 10 elementos
		Scanner stdIn=new Scanner(System.in);
		for(int i=0;i<10;i++) 
                {
			
			arreglo[i]=(int)(Math.random()*20)+1;//Se agregar 10 valores aleatorios al array
			System.out.print(arreglo[i]+" ");//Se imprime el array
			
		}
		System.out.println( );
		System.out.print("Ingrese el n�mero a reemplazar: ");//Solicitud de dato a reemplazar
  		_num1=stdIn.nextInt();
  		while(true) {
            int aux=0;//Se declara una variable auxiliar de valor 0
            for(int i=0;i<10;i++) {//Se recorrer� el array
             
				if(arreglo[i]!=_num1) {//Se verifica que el n�mero ingresado est� dentro del array
					aux++;//Se son diferentes se suma 1 a la variable auxiliar
				}
            }
            
			if(aux==arreglo.length){//Comparaci�n del n�mero de datos diferentes con la longitud del array
				System.out.print("Ese n�mero no se encuentra en la lista.Ingrese otra vez: ");//Si son iguales, se vuelve a pedir
				 _num1=stdIn.nextInt(); 
			}
			else break;//Si son diferentes, sale del bucle while
				             
		}
          
         
        	System.out.print("Ingrese el n�mero de reemplazo: ");//Se solicita valor para remplazarlo con el anterior
      		_num2=stdIn.nextInt();
  
                    
         for(int i=0;i<arreglo.length;i++) {
        	 if(arreglo[i]==_num1) {
        		 arreglo[i]=_num2;//Se realiza el intercambio de valores
        		 System.out.print("\""+ arreglo[i]+"\" ");//Se imprime el valor cambiado entre comillas
        	 }
        	 else  

        	
        		 System.out.print(arreglo[i]+" ");//El resto de los n�meros estar�n separados por espacios en blanco
        	 
         }
               
        
	
	}
}
