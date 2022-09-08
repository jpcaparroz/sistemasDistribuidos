import java.util.Date;

public class Passagem {

    Date hoje = new Date();
    private int assentos = 60;

    public String comprarPassagem(int id, Pessoa pessoa, String destino) {

        if (pessoa.getNascimento().after(hoje)) {
            return "Data de nascimento informada inválida =(";

        } else if (pessoa.getNome().isBlank()) {
            return "Nome informado inválido =(";
        } else if (destino.isBlank()) {

            return "Destino informado inválido =(";
        } else {
            this.assentos --;
            return "Parabéns " + pessoa.getNome() + " =) Você comprou a passagem com destino à " + destino;
        }
    }

    public String buscarLugares(int id){
        
        if (assentos <= 0) {
            
            return "O voo de número " + id + " não possui mais lugares disponíveis =(";

        } else {

            return "O voo de número " + id + " possuí " + assentos + " assentos disponíveis!";
        }
    }
}