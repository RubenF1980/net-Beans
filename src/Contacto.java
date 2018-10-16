/*
 * Crear clase contacto con nombres apellidos y telefono  con su constructor y los 
 * metodos setter y getter .Hacer que el nombre salga en mayusculas y el telefono con +34 delante 
 */

/** 
 * @author Ruben de la Fuente Paredes 71877542N
 */
public class Contacto {
    
    private String nombre;
    private String apellido;
    private String telefono;
    private String dni;
    
    
   ///constructor 
    public Contacto(String nombre,String apellido,String telefono,int dni){
    
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setTelefono(telefono);
        this.setDni(dni);
    }    
    
  ///////setters modificar 
    public void setNombre(String nombre){
        
         this.nombre=nombre.toUpperCase();         

    }    
     public void setApellido(String apellido){
        
         this.apellido=apellido;     
    }    
     public void setTelefono(String telefono){
        
         this.telefono="+34-" + telefono;     
    }
     public void setDni(int dni){
         
         char array[] ={'T','R','W','A','G','M','Y','F','P','D','X','B',
            'N','J','Z','S','Q','V','H','L','C','K','E','T'};        
              
       char letra=array[dni%23];  
         
         
         this.dni= Integer.toString(dni) + letra;
     }
     
     
     ///////getters mostrar  
     public String getNombre(){         
          
        return this.nombre;
     } 
     
     public String getApellido(){         
           
        return this.apellido;
     }
     
     public String getTelefono(){         
           
        return this.telefono;
     }
     public String getDni(){
         return this.dni;
     }
     
     
     public String getContacto(){
         
         return "Nombre: "+ getNombre()+ "\napellido: "+ getApellido() +"\nTelefono: "+ getTelefono()
                 + "\nDNI : "+ getDni();
         
     }
    
}//class
