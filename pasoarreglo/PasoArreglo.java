/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasoarreglo;

/**
 *
 * @author Alumno37
 */
public class PasoArreglo {

    /**
     * @param args the command line arguments
     */
   
    //pasar una matriz por referencia
    public static void modificarMatriz(int[]matriz2) {
        
        for (int i = 0; i < matriz2.length; i++) {
            matriz2[i]*=2;
            //matriz
        }
        
    }
    
    
    //modificar un elemento hace copia de la referencia para que pese menos 
    public static void modificarElemento (int elemento) {
        
        elemento=elemento*2;
        System.out.println("Elemento modificado : "+ elemento);
    }
    
    
    
    
    public static void main(String[] args) {
       
        int matriz[]={1,2,3,4,5};
        
        System.out.println("Matriz Original:");
        
        for(int i:matriz){
            System.out.printf(" %d",i);
        }
        System.out.println("");
        
//////////////////       
        
     PasoArreglo.modificarMatriz(matriz);
       
        System.out.println("matriz modificada:"); 
        
        for(int i:matriz){
            System.out.printf(" %d", i);
        }
        System.out.println("");
        
 /////////////////
       
        System.out.println("Valor elemento pos 4 : "+matriz[4]); 
     
        PasoArreglo.modificarElemento(matriz[4]);
        
        System.out.println("Valor elemento despues de modificar :"+ matriz[4]);
        
        
        
    }//main
    
}
