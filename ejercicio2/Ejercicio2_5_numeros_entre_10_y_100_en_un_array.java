/*
 *Numeros entre 10 y 100 y meter 5 en un array y que no se repitan  

 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Alumno37
 */
public class Ejercicio2_5_numeros_entre_10_y_100_en_un_array {

   
    public static void main(String[] args) {
      
        int matriz[]={0,0,0,0,0};
        int contador=0;  
      
           
      while(contador<5){
          int numero=Ejercicio2_5_numeros_entre_10_y_100_en_un_array.menu();      
             boolean resp=Ejercicio2_5_numeros_entre_10_y_100_en_un_array.buscar(numero, matriz);  
            if (resp==true ){
             System.out.println("Ya esta en el array");
            
             }else{
                 matriz[contador]=numero;
                contador++;  
                      
            }  
      }
      
            for (int i = 0; i < matriz.length; i++) {
                System.out.printf("%d-",matriz[i]);
        }
            
     }//main  
    
    
    
    public static boolean buscar(int numero,int[]matriz){   
        
        boolean respuesta=true;
        for(int i=0;i<matriz.length;i++){
            
            if(numero==matriz[i]) {
                respuesta=true;
            break;
            }else{
                respuesta=false;
            }
        }
        return respuesta;
        
    }
    
    public static int menu() {
         
        int numero=0;
          Scanner sc=new Scanner(System.in);  
        do{     
           System.out.println("Introduce numero entre 10 y 100"); 
           numero=sc.nextInt();
           
         }while((numero<10 || numero >100));
        
        return numero;
        
     } 
    
    }
    

