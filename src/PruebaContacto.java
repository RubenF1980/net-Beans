
import net.intergrupo.contacto.Contacto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno37
 */
public class PruebaContacto {
    public static void main(String[] args) {      
        
        Contacto contacto1=new Contacto("Pepe", "98500000");  //creamos dos contactos 
        Contacto contacto2=new Contacto("Juan", "98511111");
        
        Contacto.setNumeroDeContactos(2);  //puedo cambiar con la clase el num de contactos para todos los objetos
        
         System.out.println("Num Contactos: "+ Contacto.getNumeroDeContactos());         
         
         System.out.println("Contacto 1: " + contacto1.getNombre());
         
         System.out.println("Contacto 2: " + contacto2.getNombre());
        
        
        
    }
}
