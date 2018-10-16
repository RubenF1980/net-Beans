/*
 * Trellenar una matriz de 3 x 4  con numero aleatorios
 */
package ejercicio7matriz_con_valores_aleatorios;

import java.util.Random;

/**
 *
 * @author Alumno37
 */
public class Ejercicio7Matriz_con_valores_aleatorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int valor;
     
     int matriz [][]=new int[3][4];
     
    Random aleatorio=new Random();
    
    int numero;
    
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                numero=1+aleatorio.nextInt(100);
                matriz[i][j]  = numero;
                
            }
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(" "+matriz[i][j]);                
            }
            System.out.println();
        }
     
     
        
    }
    
}
