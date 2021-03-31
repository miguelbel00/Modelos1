package Monedas;

import Abstracto.Comun;

/**
*
* @author Miguel Beltran
* @author Sebastian Alvarado
*/

public class Yuanes extends Comun{

	//metodo abstracto que devuelve la selecion	
	@Override
    public String Escojer(){
        return " Yuanes";
    }
	//metodo abstracto que hace la conversion de pesos a yuanes
	@Override
	public Double Divisa(Double pes) {
		
		Double pesos=pes;
		Double yuanes= 0.0018 ; 
		Double resultado= pesos*yuanes;
		resultado = Math.round(resultado*100.0)/100.0;
		return resultado;	
	}
}

