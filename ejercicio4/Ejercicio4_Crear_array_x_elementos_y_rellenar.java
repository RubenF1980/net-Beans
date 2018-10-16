/*
 *Numero de elmentos que componen el array 
*pedir numeros y rellenar array y 
*mostrar array 
 */
package ejercicio4;

import java.util.Scanner;


public class Ejercicio4_Crear_array_x_elementos_y_rellenar {

    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("De cuantos elementos va a ser el array ");
        int numelementos=sc.nextInt();
        
        int array[]=new int[numelementos];
        
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce posicion "+ i);
            int numero=sc.nextInt(); 
            array[i]=numero;
        }
        
        for (int i = 0; i < array.length; i++) {
            System.out.println("Posicion "+ (i+1)+":"+ array[i]);
        }
    }
    
}
