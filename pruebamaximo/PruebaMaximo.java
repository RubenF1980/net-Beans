/*
 * Crear con entorno grafico programa que saque el maximo de tres numeros  
 */


import java.awt.Container;
import java.awt.Graphics;
import javax.swing.JApplet;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Alumno37
 */
public class PruebaMaximo extends JApplet{

    public void init()
    {
        String s1=JOptionPane.showInputDialog("Escriba el primer valor de punto flotante");         
        String s2=JOptionPane.showInputDialog("Escriba el segundo valor de punto flotante");        
        String s3=JOptionPane.showInputDialog("Escriba el tercer valor de punto flotante");
        
        double numero1= Double.parseDouble(s1);        
        double numero2= Double.parseDouble(s2);
        double numero3= Double.parseDouble(s3);
        
        double max=maximo(numero1, numero2, numero3);
        
        JTextArea salida=new JTextArea();//area de escritura 
        Container contenedor=getContentPane();//cojo el contenedor del appet        
        contenedor.add(salida); //añade la salida 
        
        salida.setText("Numero1\n" + numero1 + " \nNumero2\n" + numero2 + "\nNumero3\n" + numero3 + "\nEl valor maximo es \n" + max );        
        //escribo un texto en Jtexte area 
    }//init
    
    public double maximo(double x,double y,double z) {
        
        return Math.max(x, Math.max(y, z));
    }

   
    
}
