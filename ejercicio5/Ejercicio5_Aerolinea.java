/*
 *EJERCICIO 2

Una pequeÃ±a aerolÃ­nea acaba de comprar un ordenador para su nuevo sistema de
reservas automatizado. Se le pide realizar un programa para el nuevo sistema.
Usted va a escribir un applet para asignar asientos en cada vuelo del Ãºnico
aviÃ³n de las aerolÃ­neas (capacidad: 10 asientos).

Su programa debe mostrar las siguientes alternativas: Por favor escriba 1 para
PrimeraClase y Por favor escriba 2 para EconÃ³mico. Si el usuario escribe 1, su
programa debe asignarle un asiento en la secciÃ³n de primera clase (asientos 1 a 5).
Si la persona escribe 2, su programa debe asignarle un asiento en la secciÃ³n
econÃ³mica (asientos 6 a 10). Su programa deberÃ¡ entonces imprimir un pase de
abordaje, indicando el nÃºmero del asiento de la persona y si se encuentra en la
secciÃ³n de primera clase o econÃ³mica del aviÃ³n.

Usar una matriz unidimensional del tipo primitivo boolean para representar la
tabla de asientos del aviÃ³n.Inicialice, todos los elementos del arreglo con false
para indicar que todos los asientos estan vacÃ­os. A medida que se asigne cada
asiento, establezca los elementos correspondientes del arreglo en true para inidicar
que ese elemento ya no estÃ¡ disponible.

Su programa nunca deberÃ¡ asignar un asiento que ya haya sido asignado. Cuando estÃ©
llena la secciÃ³n indicar "SU SECCIÃ“N ESTA COMPLETA, RESERVA NO REALIZADA".

NOTA: Utilizar una fuente Monospaced, negrita, tamaÃ±o 12 para el mensaje de solicitud de opciÃ³n y una 
fuente ARIAL, negrita, tamaÃ±o 14 para mostrar el
billete
*/

package ejercicio5;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import java.util.Scanner;

public class Ejercicio5_Aerolinea {
    
    public static void main(String[] args) {
       
        boolean matriz[]={false,false,false,false,false,false,false,false,false,false};
        int opcion;
        int asiento;
         Scanner sc=new Scanner(System.in);  
     
      
     do{
         
            System.out.println("Introduce 1 para primera clase ");
            System.out.println("Introduce 2 para clase turista");
            System.out.println("Introduce 3 para salir ");
            opcion=sc.nextInt(); 
        switch(opcion){
            case 1:
                            
               if( Ejercicio5_Aerolinea.comprobarasiento(matriz, 1)==true)
               {
                asiento= Ejercicio5_Aerolinea.asignarasiento(matriz, 1);
                System.out.println("Se ha metido en primera y el asiento es el numero "+ asiento );
               }else{
                   System.out.println("SU SECCION ESTA COMPLETA, RESERVA NO REALIZADA");
               }
                break;
            case 2:
               if( Ejercicio5_Aerolinea.comprobarasiento(matriz, 2)==true)
               {
                asiento= Ejercicio5_Aerolinea.asignarasiento(matriz, 2);
                System.out.println("Se ha metido en segunda  y el asiento es el numero "+ asiento );
               }else{
                 System.out.println("SU SECCION ESTA COMPLETA, RESERVA NO REALIZADA");  
               }
                break;
               
        }//switch
        
     }while(opcion!=3);   
        
    }//main  
    

    
    public static int asignarasiento(boolean[]array,int clase){
        
        int respuesta=0;
        
          switch(clase){
            case 1 : 
            for (int i = 0; i <=4; i++) {
                 if(array[i]==false){                     
                 array[i]=true; 
                 respuesta=i;
                break;
                }
            }
            break;
            case 2:
             for (int i = 5; i <=9; i++) {
                 if(array[i]==false){
                array[i]=true;
                respuesta=i;
                 break;
                 
                }
            }
             
          }//switch
          
           return respuesta;     
        
        
        
    }
    
    public static boolean comprobarasiento(boolean[]array,int clase){
        ///cuando el asiento esta vacio me dice true 
        boolean estaocupado=false;
        
        switch(clase){
            case 1 :       
            for (int i = 0; i <= 4; i++) {
                if(array[i]==false){
                estaocupado=true;
                break;
                 }          
             }
            break;
            case 2 :
               for (int i = 5; i <= 9; i++) {
                if(array[i]==false){
                estaocupado=true;
                break;
                 }          
             }             
            
            } //switch
        
        return estaocupado;
    }//comprobar asiento
   
}//class
