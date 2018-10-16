/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays_multidimensionales;

/**
 *
 * @author Alumno37
 */
public class Arrays_Multidimensionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        int matriz[][]={{1,2},{3,4},{5,6}};
        
        int matriz2[][]={{1,2},{3,4,3,4,5},{1,5,6}}; //matriz desigual
        
        int matriz3[][]=new int[3][4]; //matriz 3 filas y 4 columnas
        
        int matriz4[][]=new int [3][];//matri de 3 filas y columnas indeterminadas
        
        matriz4[0]=new int[5];//le meto 5 columnas a la primera fila 
        matriz4[0]=new int[8];//le meto 8 columnas a la primera fila 
        
        
         System.out.println("For normal----------"); 
       //recorrremos la matriz 2
        
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                 System.out.print(" " + matriz2[i][j]);
            }
            System.out.println(""); //salto de linea para separar 
        }
       
        
        System.out.println("For mejorado ----------");
        ////for mejorado         
        for(int[]fila:matriz2){ //fila apunta a la priemra fila del array 
            for(int numero:fila){  //recorre todos los numeros de esa fila 
                System.out.print(" " + numero);
            }
            System.out.println(""); //salto de linea para separar
        }
        
        
        System.out.println("Fila 1 modificada ----------");
        //poner la fila 1 todo a ceros
        for (int columna = 0; columna < matriz2[1].length; columna++) {
            matriz2[1][columna]=0;
            
        }
        //muestro de nuevo 
         for(int[]fila:matriz2){ //fila apunta a la priemra fila del array 
            for(int numero:fila){  //recorre todos los numeros de esa fila 
                System.out.print(" " + numero);
            }
            System.out.println(""); //salto de linea para separar
        }
        
         
         System.out.println("Copia de fila 2 a fila 0 ----------");
        //copiar una fila a otra 
         matriz2[0]=matriz2[2];
         
          //muestro de nuevo 
         for(int[]fila:matriz2){ //fila apunta a la priemra fila del array 
            for(int numero:fila){  //recorre todos los numeros de esa fila 
                System.out.print(" " + numero);
            }
            System.out.println(""); //salto de linea para separar
        }
         
         
         System.out.println("Copia de columna   a columna ----------");
        //copiar una columna  a otra 
         System.out.println("Original ----------");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                 System.out.print(" " + matriz[i][j]);
            }
            System.out.println(""); //salto de linea para separar 
        }
        // matriz[][0]=matriz[][1];
         System.out.println("Copia ----------");
          for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                 System.out.print(" " + matriz[i][j]);
            }
            System.out.println(""); //salto de linea para separar 
        }
        
    }//main
    
}
