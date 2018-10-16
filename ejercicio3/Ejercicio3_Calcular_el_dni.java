/*
 * Nif Introducir las numeros del dni y nos saca la letra 
*Debemos tener un array unidimensional de caracteres que tenga las letras
almacenadas en el siguiente orden 'TRWAGMYFPDXBNJZSQVHLCKE' Y para calcular el dni ES dni%23 
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Alumno37
 */
public class Ejercicio3_Calcular_el_dni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        Scanner sc=new Scanner(System.in);
        
        char array[] ={'T','R','W','A','G','M','Y','F','P','D','X','B',
            'N','J','Z','S','Q','V','H','L','C','K','E','T'};
        
        System.out.println("Introduce tu dni");
        int dni=sc.nextInt();
        
       char letra=array[dni%23];
        
        System.out.println("El dni es "+ dni+ letra);
                
        
        
        
    }//main
    
}
