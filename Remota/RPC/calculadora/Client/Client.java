/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

/**
 *
 * @author bmoritani
 */
public class Client {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            // Pegando o registro 
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 18000);

            // Procurando por um registro que utilize a Interface Hello
            Calculadora stub = (Calculadora) registry.lookup("Calculadora");

            System.out.println("Digite o primeiro valor:");
            int a = sc.nextInt();
            System.out.println("Digite o segundo valor:");
            int b = sc.nextInt();
            
            // Chamando o método remoto 
            int soma = stub.soma(a, b);

            System.out.println("Soma: " + soma);
            
        } catch (Exception e) {
            System.err.println("Exceção do Cliente: " + e.toString());
            e.printStackTrace();
        }
    }
}
