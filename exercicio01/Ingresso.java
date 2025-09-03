public class Ingresso {
    private String nomeFilme = "Aventura Épica";
    private double preco = 30.00;
    private int qtdIngressos = 10;

    public Ingresso() {}

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtdIngressos() {
        return qtdIngressos;
    }

    public void setQtdIngressos(int qtdIngressos) {
        this.qtdIngressos = qtdIngressos;
    }

    public int comprarIngressos(int qtdIngressos) {
        if (this.qtdIngressos >= qtdIngressos) {
            this.qtdIngressos -= qtdIngressos;
        }
        return this.qtdIngressos;
    }

    public void exibir(String nome, double preco, int qtdIngressos) {
        System.out.println("Filme: " + nome + ", Preço: R$ " + preco + ", Disponíveis: " + qtdIngressos);
    }
}
