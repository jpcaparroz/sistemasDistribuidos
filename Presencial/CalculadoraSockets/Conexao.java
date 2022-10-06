import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Conexao {

    public static void send(Socket socket, String txt){
        OutputStream out;

        try {
            out = socket.getOutputStream();
            out.write(txt.getBytes());

        } catch (Exception e) {
            System.out.println("Exceção no OutputStream");
        }
    }

    public static void send(Socket socket, Object object) throws Exception{
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());

        try {
            
            out.writeObject(object);

        } catch (Exception e) {
            System.out.println("Exceção no OutputStream");
        }
    }

    public static Object receive(Socket socket) throws Exception {
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
        Object obj = new Object();

        try {
            
            obj = in.readObject();


        } catch (Exception e) {
            
            System.out.println("Exceção no InputStream" + e);
        }

        return obj;        
    }
    
    
}