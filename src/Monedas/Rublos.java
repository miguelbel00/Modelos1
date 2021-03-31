package Monedas;

import Abstracto.Comun;

/**
*
* @author Miguel Beltran
* @author Sebastian Alvarado
*/

public class Rublos extends Comun{

	//metodo abstracto que devuelve la selecion	
	@Override
    public String Escojer(){
        return " Rublos";
    }
	//metodo abstracto que hace la conversion de pesos a rublos
	@Override
	public Double Divisa(Double pes) {
		
		Double pesos=pes;
		Double rublos= 0.021 ; 
		Double resultado= pesos*rublos;
		resultado = Math.round(resultado*100.0)/100.0;
		return resultado;	
	}
}
