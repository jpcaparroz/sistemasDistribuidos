import java.text.SimpleDateFormat;
import java.util.Date;

public class Pessoa {

    private String nome;
    private Date nascimento;

    public Pessoa(String nome, String data) throws Exception {
        Date nasc = new SimpleDateFormat("yyyy/MM/dd").parse(data);

        this.nome = nome;
        this.nascimento = nasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) throws Exception {
        this.nascimento = nascimento;
    }
}
