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
public class Prueba_Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Calculadora calculo1=new Calculadora(10,2);
        
        System.out.println("El operando 1 es " + calculo1.getOperando1());
        System.out.println("El operando 2 es " + calculo1.getOperando2());
        
        System.out.println("La suma es " + calculo1.sumar());
        System.out.println("La resta es " + calculo1.restar());
        System.out.println("El producto es " + calculo1.multiplicar());
        
        
         System.out.println("-------MODIFICO OPERANDOS ---------"); 
        calculo1.setOperando1(4);
        calculo1.setOperando2(3);
        System.out.println("El operando 1 es " + calculo1.getOperando1());
        System.out.println("El operando 2 es " + calculo1.getOperando2());
        
         System.out.println("La suma es " + calculo1.sumar());
        System.out.println("La resta es " + calculo1.restar());
        System.out.println("El producto es " + calculo1.multiplicar());
        
    }
    
}
