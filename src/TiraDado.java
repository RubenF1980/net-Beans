
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
  * Aplicadion tirar un dado 6000 veces y sacar por pantalla las veces que sale cada cara 
 */

public class TiraDado {
  
    public static void main(String[] args) {
       
        int frecuencia1=0;
        int frecuencia2=0;
        int frecuencia3=0;
        int frecuencia4=0;
        int frecuencia5=0;
        int frecuencia6=0;
        int cara;
        
        for (int tiro= 1; tiro<= 6000; tiro++) {
        
            cara= 1 +(int)(Math.random()*6); //aleatorios del 1 al 6 
            
            switch(cara){       //meto en un switch cara cada frecuencia del dado 
                
               case 1:
                   frecuencia1++;
                   break;
               case 2:
                   frecuencia2++;
                   break;
               case 3 :
                   frecuencia3++;
                   break;
               case 4 :
                   frecuencia4++;
                   break;
               case 5 :
                   frecuencia5++;
                   break;
               case 6 :
                   frecuencia6++;
                   break;
                default:
                    break;             
            }//switch  
            
        }//for
        
        JTextArea areaSalida = new JTextArea(); //creo un objeto JtextArea
        
        areaSalida.setText("Cara\tFrecuencia" +     //seteo cada frecuencia en area salida 
                            "\n1\t" + frecuencia1 +
                            "\n2\t" + frecuencia2 + 
                            "\n3\t" + frecuencia3 +
                            "\n4\t" + frecuencia4 +
                            "\n5\t" + frecuencia5 + 
                            "\n6\t" + frecuencia6);
        
        
        //meto el Jtextext en un mensaje por pantalla  con JOption 
        JOptionPane.showMessageDialog(null, areaSalida, "Tirar dado 6000 veces", JOptionPane.INFORMATION_MESSAGE);       
        
        
        
      ///////////////////////////////////////////////// con sysos  
      /*System.out.println("cara 1 "+ frecuencia1);
        System.out.println("cara 2 "+ frecuencia2);
        System.out.println("cara 3 "+ frecuencia3);
        System.out.println("cara 4 "+ frecuencia4);
        System.out.println("cara 5 "+ frecuencia5);
        System.out.println("cara 6 "+ frecuencia6);
      */     
      
        
    }//main
    
}
