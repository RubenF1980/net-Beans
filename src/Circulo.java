/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno37
 */
public class Circulo extends Punto {
    
    private double radio;
    
    public Circulo(){
        //La llamada implicita al constructor punto         
    }

    public Circulo(int x, int y,double radio ) { //si no le paso la x y la y coje por defecto ls valores del constructor vacio del padre
        
        super(x,y); //el super llama al constructor de la clase padre con dos atributos 
        this.setRadio(radio);
        
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = (radio < 0.0 ? 0.0 : radio);
    }
    
    public double getDiametro(){
        
        return  2 * this.getRadio();
    }
    
    public double getCircunferencia(){
        
        return Math.PI * this.getDiametro();
    }
    
    public double getArea(){
        
        return Math.PI * this.getRadio()* this.getRadio();
    }
    
    public String toString(){
        return "Centro = "+ super.toString()+ " Radio = " + this.radio; //puedo usar la clase super y llamar al toString del padre
    }
    
    
}
