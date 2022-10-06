import atividade.rmi.Aluno;
import atividade.rmi.Registro;
import atividade.rmi.Resposta;
import java.rmi.Naming;


public class Cliente {
    public static void main(String[] args) {
        try {

            Aluno joao = new Aluno("João Pedro Dias Caparroz", "125111374422");
            
             Registro registro = (Registro) Naming.lookup("rmi://10.159.123.18:1099/Chamada");
             
             Resposta resp = registro.insert(joao);

             System.out.println(resp.getMensagem());
           

        } catch (Exception e) {
            System.err.println("Exceção do Cliente: " + e.toString());
            e.printStackTrace();
        }
    }
}