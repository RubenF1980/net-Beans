
import javax.swing.JOptionPane;

/*
 * Prograqma que muestre 20 numeros aleatorios y los muestre por pantalla
 * con interface grafico 
 */

public class EnterosAleatorios {
    
    public static void main(String[] args) {
       
        int valor;
        String salida="";
        
        for (int contador = 1; contador <= 20; contador++) {
            
            valor= 1 + (int)(Math.random() * 6);  //numeros aleatorios del 1 al 6       
            
            salida+=valor +" " ;
            
            if(contador %5 == 0){
               salida+="\n";
            }//if
            
        }//for         
        
        //null ventana padre,lo que muestra ,el titulo de la ventana ,indica el tipo de panel que usamos 
        JOptionPane.showMessageDialog(null, salida, "20 numeros aleatorios",JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
        
        
        
        
    }//main
    
}
