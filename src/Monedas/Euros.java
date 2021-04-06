package Monedas;

import Abstracto.Comun;

/**
*
* @author Miguel Beltran
* @author Sebastian Alvarado
*/

public class Euros extends Comun{
	//.
	//metodo abstracto que devuelve la selecion	
	@Override
    public String Escojer(){
        return " Euros";
    }
	//metodo abstracto que hace la  conversion de pesos a euros
	@Override
	public Double Divisa(Double pes) {
		
		Double pesos=pes;
		Double euro= 0.00023 ; 
		Double resultado= pesos*euro;
		resultado = Math.round(resultado*100.0)/100.0;
		return resultado;	
		
	}
}
