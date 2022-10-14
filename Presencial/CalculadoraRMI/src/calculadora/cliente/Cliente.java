package calculadora.cliente;

import java.rmi.Naming;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        
        try {
        Calculadora server = (Calculadora) Naming.lookup("rmi://localhost:1099");
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite o 1º número da soma");
        int a = in.nextInt();
        
        System.out.println("Digite o 2º número da soma");
        int b = in.nextInt();
        
        System.out.println(server.somar(a, b));
        
        in.close();
        } catch (Exception e) {
            System.out.println("ERRO! =(");
            
        }
    }
    
}
