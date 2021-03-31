package Monedas;

import Abstracto.Comun;

/**
*
* @author Miguel Beltran
* @author Sebastian Alvarado
*/

public class LibrasEsterlinas extends Comun{

	//metodo abstracto que devuelve la selecion	
	@Override
	public String Escojer(){
        return " Libras Esterlinas";
    }
	//metodo abstracto que hace la conversion de pesos a libras esterlinas
	@Override
	public Double Divisa(Double pes) {
		
		Double pesos=pes;
		Double librasEsterlinas= 0.0002 ; 
		Double resultado= pesos*librasEsterlinas;
		resultado = Math.round(resultado*100.0)/100.0;
		return resultado;	
	}
}
