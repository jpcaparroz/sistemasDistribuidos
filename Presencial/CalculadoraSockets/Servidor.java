import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

    static ServerSocket serverSocket;
    static Socket clienteSocket;

    static Conexao conexao;
    static String msg;

    public Servidor() {

        try {
            serverSocket = new ServerSocket(9600);

            System.out.println("Criando o ServerSocket");

        } catch (Exception e) {

            System.out.println("Erro ao criar ServerSocket");
        }

    }

    static boolean connect() {
        try {
            clienteSocket = serverSocket.accept();
            return true;

        } catch (Exception e) {
            return false;
        }

    }

    public static void main(String[] args) throws Exception{

        new Servidor();

        Protocolo protocolo = new Protocolo();
        
        conexao = new Conexao();        

        if (connect()) {

            protocolo = (Protocolo) conexao.receive(clienteSocket);
            protocolo.setResposta("OBRIGADO!");

            System.out.println("Cliente respondeu no dia " + protocolo.getDia());

            conexao.send(clienteSocket, protocolo);
            
        }
    }

}