import java.net.Socket;
import java.util.Scanner;

public class Cliente {

    static Conexao conexao;
    static Socket socket;
    int i;

    public Cliente(){
        try {
            
            socket = new Socket("localhost",9600);
            //socket = new Socket(host, port)

        } catch (Exception e) {
            
            System.out.println("Não consegui resolver o host...");
        }
    }

    public static void main(String[] args) throws Exception{
        
        new Cliente();

        Protocolo protocolo = new Protocolo(); 

        protocolo.setDia(30);

        Conexao.send(socket, protocolo);

        Protocolo pro = new Protocolo();

        pro = (Protocolo) conexao.receive(socket);

        System.out.println(pro.getResposta());
        
    }
    
}