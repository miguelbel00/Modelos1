package Fabrica;

import Abstracto.Comun;
import Monedas.*;

/**
*
* @author Miguel Beltran
* @author Sebastian Alvarado
*/

public class Fabrica {

    	
	 protected String seleccion;
	 protected Double pesos;
	    
	    //constructor con argumentos de seleccion
	    public Fabrica(String sel){
	        seleccion=sel;
	    }
	    
	    public Comun crear_selecion(){
	    	//retorna el objeto Euros en caso de ser este la seleccion
	        if(seleccion.equalsIgnoreCase("Euros")){
	            return new Euros();
	        //retorna el objeto Dolares en caso de ser este la seleccion
	        }else if(seleccion.equalsIgnoreCase("Dolares")){
	            return new Dolares();
	        //retorna el objeto Libras Esterlinas en caso de ser este la seleccion 
	        }else if(seleccion.equalsIgnoreCase("Libras Esterlinas")){
	            return new LibrasEsterlinas();
	        //retorna el objeto rublos en caso de ser este la seleccion
	        }else if(seleccion.equalsIgnoreCase("Rublos")){
	            return new Rublos();
	        }
	        //retorna el objeto yuanes en caso de ser este la seleccion
	        else {
	            return new Yuanes();
	        }
	    }
}
