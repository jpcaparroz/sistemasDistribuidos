public class Automovel {
    private String nome;
    private String modelo;
    private int ano;

    @Override
    public String toString() {
        return "Automovel [Ano=" + ano + "| Modelo=" + modelo + "| Nome do Proprietário=" + nome + "]";
    }

    public Automovel(String nome, String modelo, int ano) {
        this.nome = nome;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

}
