package Monedas;

import Abstracto.Comun;

/**
*
* @author Miguel Beltran
* @author Sebastian Alvarado
*/

public class Dolares extends Comun {

	//metodo abstracto que devuelve la selecion	
	@Override
    public String Escojer(){
        return " Dolares";
    }
	//metodo abstracto que hace la conversion de pesos a dolares
	@Override
	public Double Divisa(Double pes) {
		
		Double pesos=pes;
		Double euro= 0.00027 ; 
		Double resultado= pesos*euro;
		resultado = Math.round(resultado*100.0)/100.0;
		return resultado;	
	}
}
