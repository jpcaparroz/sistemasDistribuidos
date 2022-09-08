import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Cliente[] clienteBd = new Cliente[3];

        boolean loop = true;
        //clienteBd[0] = new Cliente("Carlos", 19, 42345);
        //clienteBd[1] = new Cliente("Jose", 34, 12454);


        while (loop == true) {
            menu();

            switch (in.next()) {
                case "1":
                                        System.out.println("Qual nome do cliente?");
                    String nome = in.next();

                    System.out.println("Qual idade do cliente?");
                    int idade = in.nextInt();

                    System.out.println("Qual saldo do cliente?");
                    float saldo = in.nextFloat();

                    for (int i = 0; i < clienteBd.length; i++) {
                        if (clienteBd[i].toString().equals(null))
                    }

  
                    break;

                case "2":
                    System.out.println("Qual cliente voce deseja atualizar o saldo?");
                    int num2 = in.nextInt();

                    float saldoAtual clienteBd[num2].getSaldo();
                    
                    break;

                case "3":
                    
                    break;

                case "4":
                System.out.println("Qual cliente você deseja excluir:");
                int numCliente = in.nextInt();

                System.out.println("Cliente " + clienteBd[numCliente].getNome() + " Excluido com sucesso! =)");
                
                if (clienteBd[numCliente].toString().isBlank()) {
                    System.out.println("Cliente inexistente =(");

                } else {clienteBd[numCliente] = null; }

                    break;

                case "5":
                    
                loop = false;
                    break;
                default:
                    break;
            }
            
        }
        in.close();
    }

    public static void menu() {
        System.out.println("*******BANCO*******");
        System.out.println("Selecione uma opção:");
        System.out.println("1 - Adicionar cliente");
        System.out.println("2 - Atualizar Saldo");
        System.out.println("3 - Consultar cliente");
        System.out.println("4 - Excluir cliente");
        System.out.println("5 - Sair do banco");
    }

    public static Cliente cadastrarCliente(String nome, int idade, float saldo){

        Cliente cliente = new Cliente(nome, idade, saldo);

        return cliente;
    }
}
