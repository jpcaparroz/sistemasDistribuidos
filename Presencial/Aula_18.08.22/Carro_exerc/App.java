public class App {
    public static void main(String[] args) throws Exception {
        
        Automovel carro = new Automovel("João", "Corsa", 2010);

        System.out.println(carro);

        //mudando propietário
        carro.setNome("Carlinhos");

        System.out.println(carro);
    }
}
