package ClienteFabrica;

import java.util.Scanner;
import Abstracto.Comun;
import Fabrica.Fabrica;

/**
*
* @author Miguel Beltran
* @author Sebastian Alvarado
*/

public class ClienteFabrica {
public static void main(String[] args) {
    	
        // TODO code application logic here
    	
        Scanner sc =new Scanner(System.in);
        
        //se crea objeto tipo comun
        Comun Micomun;
        
        //se crea objeto tipo fabrica
        Fabrica Mifabrica;
        
        //se guarda la seleccion de la divisa
        System.out.println("Digite la divisa a la cual desea hacer la conversion:   ");
        String  seleccion=sc.nextLine();
        
      //se guarda el dato double (pesos)
        System.out.println("Ingrese cuantos pesos colombianos desea convertir:   ");
        Double  pes=sc.nextDouble();
        
        //se manda por el constructor la seleccion del usuario
        Mifabrica = new Fabrica(seleccion);
        
        //se llama al metodo crear_seleccion del objeto Mifabrica
        Micomun =  Mifabrica.crear_selecion();
        
        /*Se llama al metodo escojer del objeto MiComun que proviene de la clase abstracta
        Comun, en este caso el metodo escojer lo tendria la clase que fue seleccionada por el usuario */
        String salir=" "+pes+" pesos son igual a "+Micomun.Divisa(pes)+" " + Micomun.Escojer();
        
        //salir del programa
        System.out.println(salir);
        
    }
}
