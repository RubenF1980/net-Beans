/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno37
 */
public class Cilindro extends Circulo{
    
    private double altura;

    public Cilindro() {
        
    }

    public Cilindro( int x, int y, double radio,double altura) {
        
        super(x, y, radio);//constructor del padre
        this.setAltura (altura);//propia del objeto
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = (altura < 0.0 ? 0.0 :altura);
    }
        
    public double getArea(){
        return 2 * super.getArea() + this.getCircunferencia() * this.getAltura() ; 
    }
        
   
    public double getVolumen(){
        return super.getArea()* this.getAltura();
    }
    
    public String toString(){
        
        return super.toString() + " Altura = " + this.getAltura();
        
    }
    
    
}
