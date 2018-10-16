/*
 * 2  Realizar un programa que implemente la clase Calculadora que tenga los siguientes atributos:
 * operando1 de tipo entero, privado
 * operando2 de tipo entero, privado
 *además debe de tener los siguientes métodos:
 * constructor el cuál se le pasan los dos operandos
 * métodos set y get
 *métodos: suma, resta, producto que nos devuelve la operación correspondiente de los dos operandos.
 *Escribir la clase de prueba para probar la clase anteriormente.
 */

/**
 *
 * @author Alumno37
 */
public class Calculadora {
    
    private int operando1;
    private int operando2;
    
     ///constructor 
    public Calculadora(int operando1,int operando2){
        
        this.setOperando1(operando1);
        this.setOperando2(operando2);        
    }   
    
      
      ///////setters modificar 
    public void setOperando1(int operando1){
        
         this.operando1=operando1;         

    }    
     public void setOperando2(int operando2){
        
         this.operando2=operando2;      
     }         
     
     ///////getters mostrar  
     public int getOperando1(){         
          
        return this.operando1;
     }      
     public int getOperando2(){         
           
        return this.operando2;
     }
    
     
     ///metodos 
     public int sumar(){
         
         return this.operando1 + this.operando2;
     }    
     public int restar(){
         
         return this.operando1 - this.operando2;
     }     
      public int multiplicar(){
         
         return this.operando1*this.operando2;
     }
    
      
      
   
    
    
    
    
}//class
