/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno37
 */
public class PruebaTiempo1 {
    
    public static void main(String[] args) {
        
        Tiempo1 tiempo=new Tiempo1();//llamada al constructor crea objeto tiempo       
        
        System.out.println("Hora Universal: " + tiempo.aStringUniversal());
        
        System.out.println("Hora Estandar: " + tiempo.aStringEstandar());
        
        System.out.println("--------HORA MODIFICADA----------");
          
        tiempo.establecerhora(16, 2, 25);//establece una nueva hora 
       
        System.out.println("Hora Universal: " + tiempo.aStringUniversal());
        
        System.out.println("Hora Estandar: " + tiempo.aStringEstandar());
        
       Tiempo1 tiempo2=new Tiempo1(); //creo nuevo objeto tiempo 2
       
        System.out.println("---------Imprimir tiempo 2--------");
        
       System.out.println("Hora Universal: " + tiempo2.aStringUniversal());
        
        System.out.println("Hora Estandar: " + tiempo2.aStringEstandar());
        
        tiempo2.establecerhora(15, 45, 6);//establece nuevas hora
        System.out.println("--------HORA 2 MODIFICADA----------");
        System.out.println("Hora Universal: " + tiempo2.aStringUniversal());
        
        System.out.println("Hora Estandar: " + tiempo2.aStringEstandar());
        
       
        
    }
    
    
}
