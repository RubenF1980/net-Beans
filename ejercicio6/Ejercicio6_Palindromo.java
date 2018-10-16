/*
 * 
 *Palindromo se lee igual al derecho que al reves .Ej oso,ojo,radar...escriba un metodo llamado prueba
 *palindromo que devuelva valor true tipo boolean si la cadena guardada en el arreglo es un palindromo y false en caso contrario 
 *Utilizar el metodo toCharArray de la clase String para obtener un array char que contenga los caracteres en el objeto String.
 */
package ejercicio6;

import java.util.Scanner;


public class Ejercicio6_Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        String palabra;
        char[] cadena; 
        
        System.out.println("Introduce frase ");
        palabra=sc.nextLine();        
        
        cadena= palabra.toCharArray();  
       
        for (int i = 0; i < cadena.length; i++) {
           System.out.print(cadena[i]); 
        }
        System.out.println();
       
        
        if( Ejercicio6_Palindromo.sacarpalindromo(cadena)==true){
            System.out.println("Es un palindromo");
        }else{
            System.out.println("No es un palindromo ");
        }
        
        
        
    }//main
    
    
     public static boolean sacarpalindromo(char[]cadena){     
        
         boolean respuesta=true;
         
         for (int i = 0; i <cadena.length/2;i++) {
             
             if(cadena[i]!=cadena[cadena.length-i-1]){
                 respuesta= false;                
                                 
             }         
         } 
         
         return respuesta;

        }//sacar palindromo
   
}//class