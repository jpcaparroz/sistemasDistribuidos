import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

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

    public static void main(String[] args) {
        String texto;
        new Servidor();
        conexao = new Conexao();

        Scanner in = new Scanner(System.in);

        if (connect()) {

            for (int i = 0; i < 10; i++) {
                texto = conexao.receive(clienteSocket);
                System.out.println(texto);

                System.out.println("Mensagem:");
                String msg = in.next();
                
                conexao.send(clienteSocket, msg);

            }

            in.close();
        }
    }

}
