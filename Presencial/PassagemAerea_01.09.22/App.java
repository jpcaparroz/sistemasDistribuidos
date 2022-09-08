public class App {
    public static void main(String[] args) throws Exception{
        
        Passagem passagem = new Passagem();

        Pessoa pessoa = new Pessoa("João", "2000/02/09");

        System.out.println(passagem.comprarPassagem(1, pessoa, "Maranhão"));

        for (int i = 0; i < 59; i++) {
            passagem.comprarPassagem(1, pessoa, "Maranhão");
        }

        System.out.println(passagem.buscarLugares(1));
        

    }
    
}
