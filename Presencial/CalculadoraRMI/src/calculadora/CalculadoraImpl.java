package calculadora;

import calculadora.cliente.Calculadora;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculadoraImpl extends UnicastRemoteObject implements Calculadora {
    
    public CalculadoraImpl() throws RemoteException {
	super(); 
    }
    
    public int somar(int a, int b) throws RemoteException {
        System.out.println("O resultado da soma de " + a + " + " + b + " é igual a: ");
        return a + b;
    }
    
    public int subtrair(int a, int b) throws RemoteException {
        System.out.println("O resultado da subtração de " + a + " + " + b + " é igual a: ");
        return a - b;
    }
     
}
