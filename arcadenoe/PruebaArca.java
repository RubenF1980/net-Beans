/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arcadenoe;

import javax.sound.midi.Soundbank;

/**
 *
 * @author Alumno37
 */
public class PruebaArca {
    public static void main(String[] args) {
        
        //Arca arca=new Arca();  //crea de un arca de 6
        Arca arca=new Arca(8);  //crea de un arca de los que queramos meter  al pasarle nosotros el tamanio
        
        ///metemos animales
        Animales animal1=new Animales("Thor","Macho", "Perro"); //crea un animal 
        Animales animal2=new Animales("Obelix", "macho", "gato");//creo otro animal 
        Animales animal3=new Animales("Lucas", "hembra", "pato");//creo otro animal 
        Animales animal4=new Animales("Rufus", "macho", "leon");//creo otro animal 
        
        
        //inserto animales
        arca.insertarAnimal(animal1);   //inserto un animal   
        arca.insertarAnimal(animal2);   //inserto otro animal 
        arca.insertarAnimal(animal3);   //inserto otro animal 
        arca.insertarAnimal(animal4);   //inserto otro animal 
          
        
        Animales[] copiaArca=arca.getArca(); // creo otro array y apunta a el array arca usando get
       //////////////////////////////////////// 
        ///imprimo de uno en uno 
        System.out.println("------Uno en uno -------"); //saco un animal
        System.out.println(copiaArca[0].getNombre()); //imprimo el nombre del primer insertado
        System.out.println(copiaArca[0].getGenero()); // imprimo la raza del primer insertado
        System.out.println(copiaArca[0].getEspecie()); // imprimo la raza del primer insertado        
        
        ////////////////////////////////////////////
        System.out.println("-----IMPRIMO TODOS--------");
        //imprimo el nombre de los que metimos usando un for 
        for (int i = 0; i < copiaArca.length; i++) 
        {
            if(copiaArca[i] !=null)  //controlo si nos pasamos del tamaño del array 
            {
                System.out.println(copiaArca[i].getNombre());
               // System.out.println(copiaArca[i].getGenero());                
               // System.out.println(copiaArca[i].getEspecie());
            }  
        }
        
       /////////////////////////////////////////// 
        System.out.println("------SACO ANIMAL POR SU NOMBRE-------"); 
        
        arca.sacarAnimal("Obelix");  //metodo con el que saco un animal
        
         for (int i = 0; i < copiaArca.length; i++) 
        {
            if(copiaArca[i] !=null)  //controlo si nos pasamos del tamaño del array 
            {
                System.out.println(copiaArca[i].getNombre());
                //System.out.println(copiaArca[i].getGenero());                
               // System.out.println(copiaArca[i].getEspecie());
            }  
        }
        
        ////////////////////////////////////////////////////////////////////////////////
        System.out.println("------USANDO EL METODO IMPRIMIR -------");       
        
        System.out.println(arca.mostrarArca()); //USO METODO IMPRIMIR 
        
        System.out.println("Se saca un animal ");
        arca.sacarAnimal("Lucas");        
        System.out.println(arca.mostrarArca()); 
        
        //uso buscar animal 
        
        Animales animalBuscar=null;  // inicializo variable de tipo animamles
        
        animalBuscar=arca.buscarAnimal("Rufus");
        
        if(animalBuscar != null){
            System.out.println(animalBuscar.getNombre());  //devuelve todo el objeto pero solo imprimo el nombre
        }
        
        
        
        
        
        
    }//main
}//class
