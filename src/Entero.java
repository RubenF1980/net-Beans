/*
 * Crear clase que sume dos objetos con un metodo sumar 
 */

/**
 *
 * @author Alumno37
 */
public class Entero {
    
    private int operando;

    ///////get 
    public int getOperando() {
        return operando;
    }
   ///set
    public void setOperando(int operando) {
        this.operando = operando;
    }       
    
 ///constructor   
    
    public Entero(int operando){
        
        this.setOperando(operando);
                   
    }
       
    
  /// metodo suma
    
     public Entero sumar(Entero operando2){
         
         Entero resultado=new Entero(0); //creo nuevo objeto entero y lo almaceno en resultado 
         
         //coje el valor del atributo y se lo suma al objeto que hace la llamada       
         resultado.setOperando(operando2.getOperando()+ this.getOperando());        
         
         return resultado;
         
         //return new Entero(this.getOperando()+operando2.getOperando());
     }
     
      /// metodo resta
     
     public Entero restar(Entero operando2){
         
         Entero resultado=new Entero(0);
         
         resultado.setOperando( this.getOperando()-operando2.getOperando());
         
         return resultado;
     }
     
     
        /// metodomultiplicacion
     
     public Entero multiplicar(Entero operando2){     
        
         return new Entero( this.getOperando()* operando2.getOperando());
         
     }
     
     
}
