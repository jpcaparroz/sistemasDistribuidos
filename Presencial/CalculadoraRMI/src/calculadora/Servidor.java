package calculadora;

import calculadora.cliente.Calculadora;
import java.rmi.Naming;

public class Servidor {
    
    public static void main(String[] args) {
        try {
            Calculadora server = new CalculadoraImpl();
            
            Naming.rebind("rmi://localhost:1099/ServidorTrilha", server);
            
        } catch (Exception e) {
            System.out.println( "vixi: " + e.getMessage() );
            
        }
    }
    
}
