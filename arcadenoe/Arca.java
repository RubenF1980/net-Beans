/*
 * Esta clase esta compueta de un array que tiene a su vez otros objetos 
 */
package arcadenoe;

/**
 *
 * @author Alumno37
 */
public class Arca {
    
    
    private Animales[] arca;    //objeto array de animales (composicion:clase compuesta por objetos de otras clases )
    private int posicion;       //posicion libre donde puedo insertar animales 

    //get and set de posicion 
    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    
    
  ///get and sets de arca
    public Animales[] getArca() {
        return arca;
    }

    public void setArca(Animales[] arca) {
        this.arca = arca;
    }
    
    //constructor vacio    
    public Arca(){
        
        this.arca=new Animales[6];  //crea solo el array vacio en este caso de 6 
        this.setPosicion(0);         //inicializo la posicion a meter el animal 
    }
    
    //Constructor que crea el arca del tamanio que le digamos 
    public Arca(int tamanio){
        this.arca=new Animales[tamanio];
        this.setPosicion(0);        //inicializo la posicion a meter el animal
        
    }
    
    //metodo para meter animales en el arca
    public boolean insertarAnimal(Animales animal){  //le paso un objeto de animales 
        
        boolean insertado=true;
        
        if(!arcaLlena()){                                                //si el arca no esta llena puedes meter animales 
                 this.arca[this.getPosicion()]=animal;                   //mete el animal en la posicion determinada por get posicion 
                 this.setPosicion(this.getPosicion() + 1 );               //incrementa get posicion en 1 para el siguiente 
               
        } else{
            insertado=false;  //si esta llena 
                }  
        
        return insertado;
    }
    
    
    //metodo que mira si el array esta lleno devuelve false por defecto
    public boolean arcaLlena(){
        
        return this.getPosicion()==this.getArca().length;//esta llena cuando la posi sea igual a al longitud del arca (array)
        
    }
    
    //metodo para borrar un animal a traves  del nombre
    public boolean sacarAnimal(String nombre){  //LE PASO EL NOMBRE 
        
        boolean encontrado=false;  //todavia no se encontro 
        
        for (int i = 0; i < this.getPosicion(); i++) { //recorre hasta donde haya elementos al usar posicion para controlar
            
            if(nombre.compareTo(this.arca[i].getNombre())==0){ //si el nombre es igual al nombre del arca en la posicion de i
                
                encontrado= true;  //si esta el nombre pongo encontradro a true 
                
                for (int j = i; j < this.getPosicion() - 1; j++) {  //modifico con un bucle para sacar el nombre.Apunta a i que es 1
                    this.arca[j] = this.arca[j+1];
                }
                this.arca[this.getPosicion() -1] = null;  //pongo a null para que quede vacia la ultima por que al desplazar tiene valores
                this.setPosicion(this.getPosicion() -1);  //le doy el valor con set position para que apunte al valor que este libre(el ultimo)
                
                break;
            }//if            
        }//for
        
        return encontrado;
    }
    
    
    //metodo para imprimir.Concateno en una cadena para mostrar 
    public String mostrarArca(){
        
        String cadena="";
        
        for (int i = 0; i < this.getPosicion(); i++) {
            
            cadena +="\nNombre : " + this.arca[i].getNombre()+ 
                    "\nGenero : " + this.arca[i].getGenero()+
                    "\nEspecie : " + this.arca[i].getEspecie()+
                    "\n---------------\n";
        }
        
        return cadena;
    }
    
       //metodo para encontrar un animal
    public Animales buscarAnimal(String nombre){  //LE PASO EL NOMBRE 
        
      
        
        for (int i = 0; i < this.getPosicion(); i++) { //recorre hasta donde haya elementos al usar posicion para controlar
            
            if(nombre.compareTo(this.arca[i].getNombre())==0){ //si el nombre es igual al nombre del arca en la posicion de i
                
               
                
                return this.arca[i];  //si lo encuentra retorna todo el objeto 
            
            }    
        }    
        return null;  // si no lo encuentra retorna null
       
    }
    
    
}//class arca
