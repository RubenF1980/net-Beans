
import java.text.DecimalFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno37
 */
public class Tiempo1 extends Object{
    
    //atributos de los objetos solo lo pueden ver los metodos de dentro del fichero
    private int hora;   // 0-23  // no es recomendable que sean publicos
    private int minuto;  // 0-59
    private int segundo;  //0-59
    
    
    //constructor inicializa valores de la clase con el new 
    public Tiempo1(){   
        
        //tiene un metodo 
        establecerhora(0,0,0);    
}
    
    //metodo para cambiar la hora 
    public void establecerhora(int h,int m ,int s){
        
        hora= ((h >=0 && h<24) ? h : 0);  //si hora esta en esos valores le mete el valor, si no esta le asigna un cero 
        minuto=((m >=0 && m<60) ? m : 0);
        segundo= ((s >= 0 && s <60 )? s : 0);           
        
    }
    
    
    //convertir a String en formato hora universal
    public String aStringUniversal(){
        
        DecimalFormat dosDigitos=new DecimalFormat("00"); //incializa un objeto decimal format y inicializa con ese valor 00
        
        return dosDigitos.format(hora) + ":" + dosDigitos.format(minuto) +":" +dosDigitos.format(segundo);
    }
    
    
    //convertir a String en formato hora estandar
    public String aStringEstandar(){
        
        DecimalFormat dosDigitos=new DecimalFormat("00");
        
        return ((hora==12 || hora==0) ? 12 : hora%12)+ ":"+  dosDigitos.format(minuto) + ":" +
                dosDigitos.format(segundo)+":" + (hora <12 ?"AM ": "PM");
        
    }
    
    
    
            
    
    
}//class
