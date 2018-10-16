
import java.text.DecimalFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno37
 */
public class PruebaThis {
    
     //si hubiera atributos en la clase externa podria acceder a ellos desde la clase interna 
    
    public static void main(String[] args) {        
        
        
       
        PruebaThis prueba=new PruebaThis();  // creo objeto prueba de PruebaThis        
        HoraSimple hora =prueba.new HoraSimple(2, 4, 5);  //creo objeto hora simple al ser interno va enlazado
        System.out.println(hora.CrearCadena());     
        
        
    }//main
    
    

    class HoraSimple{  //clase interna 
        
             private int hora ;
             private int minuto;
             private  int segundo;
             
             
        
            //CONSTRUCTOR siempre lleva el nombre de la clase  
              public HoraSimple(int hora,int minuto,int segundo){ 

                  this.hora=hora ; // el operador this apunta al objeto y le asigna el valor
                  this.minuto=minuto;
                  this.segundo=segundo;



              }

            // Utilizar this explicito e implicito
              public String CrearCadena(){

                  return "this.aStringEstandar(): " 
                          + this.aStringEstandar() + //this explicito
                          "\naStringEstandar(): "+
                          aStringEstandar();         //this implicito

              }

              //metodo devolver String hora simple
              public String aStringEstandar(){

                  DecimalFormat dosDigitos=new DecimalFormat("00");//creo objeto dos digitos

                  return dosDigitos.format(this.hora) + ":" +
                         dosDigitos.format(this.minuto)+ ":" + 
                         dosDigitos.format(this.segundo);


              }
    
    }//hora simple
    
    
}//class
