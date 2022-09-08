import java.net.Socket;

public class Cliente {

    static Conexao conexao;
    static Socket socket;
    int i;

    public Cliente(){
        try {
            
            socket = new Socket("localhost",9600);

        } catch (Exception e) {
            
            System.out.println("Não consegui resolver o host...");
        }
    }

    public static void main(String[] args) throws Exception{
        
        String msg = "Cliente envia: Olá Server";
        String texto;

        new Cliente();
        for (int i = 0; i < 10; i++) {
            
            conexao.send(socket,msg);
            texto = conexao.receive(socket);

            System.out.println(texto);
        }
        socket.close();
    }
    
}