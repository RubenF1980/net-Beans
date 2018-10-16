/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno37
 */
public class PruebaPunto {
    public static void main(String[] args) {
        
        Punto punto=new Punto(20,30);//creo punto         
        System.out.println("El punto es :" + punto);//al tener el toString solo le paso el punto 
        
        //modifico coordenadas 
        punto.setX(5);
        punto.setY(10);
        System.out.println("El punto es :" + punto);
        
        
        Circulo circulo=new Circulo(4,5,20);
        System.out.println(circulo);
        
        Cilindro cilindro=new Cilindro(4,5,50,30);
        System.out.println(cilindro);
        
        
        
        
    }
    
    
}
