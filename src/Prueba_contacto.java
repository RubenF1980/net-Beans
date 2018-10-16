/*
 * Pruebe contacto crea dos nuevos objetos y los modifica y los imprime.
 */

/**
 *
 * @author Ruben de la Fuente Paredes 71877542N
 * 
 */
public class Prueba_contacto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Contacto contacto1=new Contacto("ruben", "fuente", "1111111",7187777);
        
         System.out.println("-------CONTACTO 1 ---------");
        System.out.println(contacto1.getContacto());     
        
        
        contacto1.setTelefono("000000");
        System.out.println("Nuevo telefono: "+ contacto1.getTelefono());
        
        
        System.out.println("-------CONTACTO 2 ---------");        
        Contacto contacto2 =new Contacto("Juan", "Garcia", "2222222",71741768);          
        System.out.println(contacto2.getContacto());
        
        contacto2.setNombre("Pepe luis");
        System.out.println("Nombre modificado: " + contacto2.getNombre());
        
        System.out.println("-------CONTACTO 3---------");        
        Contacto contacto3=new Contacto("pepe", "Perez", "333333",71877542);
       System.out.println(contacto3.getContacto());
       
        
    }
    
}
