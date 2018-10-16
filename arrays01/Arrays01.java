/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays01;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Alumno37
 */
public class Arrays01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    /*    int matriz[] =new int[10];
        
        for (int i = 0; i < matriz.length; i++) {
            matriz[i]=0;
            System.out.println("Indice "+ i );
            System.out.println("Valor :"+ matriz[i]);
        }
        System.out.println("---------");
  ////////////////Otro array
        int matriz2[]= {10,20,30,40,50};
        System.out.println("Longitud array "+ matriz2.length);
        
        System.out.println("---------");
        
        for (int i = 0; i < matriz2.length; i++) {
            System.out.println("Indice "+ i );
            System.out.println("valor : "+ matriz2[i]);
        }
        
 System.out.println("---------");
        //////////////
        final int LONGITUD_MATRIZ=10;  //CONSTANTE NO SE PUEDE CAMBIAR 
        
        int matriz3[]=new int[LONGITUD_MATRIZ];
        
        for (int i = 0; i < matriz3.length; i++) {
            matriz3[i]= 2+2*i;
            System.out.println("Indice "+ i );
            System.out.println("valor : "+ matriz3[i]);
        }
       
        System.out.println("---------");
        //Sumer el contenido de un array y mostrarlo 
        int matriz4[]={10,20,30,40,50,60,70,80};
        int resultado=0;
        for (int i = 0; i < matriz4.length; i++) {
            resultado+=matriz4[i];
        }
        System.out.println("La suma del array es "+ resultado);
        
        JOptionPane.showMessageDialog(null,"El resultado es "+ resultado);
        
         
        //tirar dado 6000 veces y saber cuantas veces salio cada cara 
       
        Random aleatorio=new Random();        
        int numero;
               
        
        int matriz5contador[]={0,0,0,0,0,0,0};
        
        for (int i = 0; i < 6000; i++) {
            numero=1 + aleatorio.nextInt(6); 
            matriz5contador[numero-1]++;            
            
        }
        
        for (int j = 0; j < matriz5contador.length-1; j++) {
               
            System.out.println("El numero "+ (j+1) +  " sale : " +matriz5contador[j]+" veces");
        }
        
        
 ///////////pedir nota por teclado  20 veces del 1 al 5  y saber cuantas veces salio cada nota 
       
    
    
     
     int nota;
     int contador=0;
       Scanner sc=new Scanner(System.in);
                
    
     int matriz6notas[]={0,0,0,0,0};
     
     do{
         System.out.println("Introduce nota ");
         nota=sc.nextInt();         
         matriz6notas[nota-1]++;
         contador++;
     }while(contador!=20);
     
     for (int i = 0; i < 5; i++) {
           System.out.println("La nota "+ (i+1) +  " sale : " +matriz6notas[i]+" veces");
     
     }
     
    
    
    ///////////pedir nota por teclado  20 veces del 1 al 5  y saber cuantas veces salio cada nota 
          ///    y que lo muetre como asteriscos
    
    
     
     int nota;
     int contador=0;
     Scanner sc=new Scanner(System.in);           
    
     int matriz6notas[]={0,0,0,0,0};
     
     do{
         System.out.println("Introduce nota ");
         nota=sc.nextInt();         
         matriz6notas[nota-1]++;
         contador++;
     }while(contador!=20);
     

         for (int i = 0; i < matriz6notas.length; i++) {            
           System.out.print("La nota "+ (i+1) +  " sale : " );
                for (int j = 0; j < matriz6notas[i]; j++) {
                   
                        System.out.print("*");
         }
                System.out.println("");
     }
    


         ///////////pedir nota por teclado  20 veces del 1 al 5  y saber cuantas veces salio cada nota 
          ///    y que lo muetre como asteriscos con dos bucles for
    
    int nota;
    Scanner sc=new Scanner(System.in);    
    
    int matriz7notas[]={0,0,0,0,0};
      
        for (int i = 0; i < 20; i++) {
            System.out.println("Introduce nota ");
            nota=sc.nextInt();         
            matriz7notas[nota-1]++;
        }
        
        
         for (int j = 0; j <matriz7notas.length ; j++) {
             System.out.print("La nota "+ (j+1) +  " sale : " );
             for (int x = 0; x < matriz7notas[j]; x++) {
                  System.out.print("*"); 
             }
             
               System.out.println("");
            }
    */         
   
        
        
        
        
    }     
       
 }//main
    

