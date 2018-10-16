/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno37
 */
public class Punto {
    
    //al ser la clase padre los pongo proteccted para que puedan acceder lso hijos 
    private int x;
    private int y;
    
    
    public Punto(){
        
        //llamada implicita al constructor Object 
    }

    public Punto(int x, int y) {  
     //llamada implicita al constructor Object 
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    //Metodo que se hereda de forma directa o indirecta de la clase Object
      
    public String toString(){  //son sout aplicado a un objeto de la clase punto imprime las coordenadas 
        return "[" + this.getX() + "," + this.getY() + "]" ;
    }
    
    
    
    
    
}
