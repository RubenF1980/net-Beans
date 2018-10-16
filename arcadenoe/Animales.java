/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arcadenoe;

/**
 *
 * @author Alumno37
 */
public class Animales {

    private String nombre;
    private String genero;
    private String especie;

    
    ///get and set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    
    
    /////constructor completo    
    public Animales (String nombre, String genero,String especie){
        //lo hago con el this para que asi coja los atributos de los gets
        this.setNombre(nombre); //this.nombre=nombre        
        this.setGenero(genero);//this.genero=genero;
        this.setEspecie(especie);//this.especie=especie;     
        
    }
     /////constructor con solo dos argumentos al pasarle tres llama al completo    
    public Animales(String nombre,String genero){
        
        this(nombre,genero,"SIN CLASIFICAR");
        
    }
    //constructor con solo 1 o con 2 si le paso mas llama al superior    
    public Animales(String nombre){
        
        this(nombre," SIN DETERMINAR");
        //this(nombre," SIN DETERMINAR","SIN CLASIFICAR");
    } 
    
    //constructor vacio    
    public Animales(){
        
        this("SIN NOMBRE");
        
    }
    
    
}
