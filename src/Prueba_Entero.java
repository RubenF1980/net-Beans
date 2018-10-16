/*
 * Crear clase que sume dos objetos con un metodo sumar.
 */

/**
 *
 * @author Alumno37
 */
public class Prueba_Entero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Entero numero1=new Entero(5);
        Entero numero2=new Entero(6);
        
        Entero resultado=null;
        resultado=numero1.sumar(numero2);
        
        System.out.println(numero1.getOperando()+ " + "+ numero2.getOperando()+" = " + resultado.getOperando());
        
        Entero resultado2=null;
        resultado2=numero1.restar(numero2);
        System.out.println(numero1.getOperando()+ " - "+ numero2.getOperando()+" = " + resultado2.getOperando());
        
        Entero resultado3=null;
        resultado3=numero1.multiplicar(numero2);
        System.out.println(numero1.getOperando()+ " * "+ numero2.getOperando()+" = " + resultado3.getOperando());
        
    }
    
}
