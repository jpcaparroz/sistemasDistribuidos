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
        
        String msg = "Cliente envia: Olá Server";
        String texto;

        Scanner in = new Scanner(System.in);

        new Cliente();
        for (int i = 0; i < 10; i++) {
            
            System.out.println("Mensagem: ");
            String msgCliente = in.next();

            conexao.send(socket,msgCliente);
            texto = conexao.receive(socket);        

            System.out.println(texto + " " + i);
        }
        socket.close();
        in.close();
    }
    
}