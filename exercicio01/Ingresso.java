public class Ingresso {
    // Atributos
    private String nomeFilme;
    private double preco;
    private int qtdIngressos;

    // Construtor
    public Ingresso(String nomeFilme, double preco, int qtdIngressos) {
        this.nomeFilme = nomeFilme;
        this.preco = preco;
        this.qtdIngressos = qtdIngressos;
    }

    // Métodos
    // Getters e Setters
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

    /* Comprar ingresso:

        - Recebe a quantidade de ingressos que serão comprados

        - Subtrai a quantidade recebida da quantidade de ingressos atual

        - Dá feedbacks de compra e negação, por fim, retorna a quantidade de ingressos

    */
    public int comprarIngressos(int qtdIngressos) {
        if (this.qtdIngressos >= qtdIngressos && qtdIngressos > 0) {
            this.qtdIngressos -= qtdIngressos;
            System.out.println("Foram comprados " + qtdIngressos + " ingresso(s).");
        } else {
            System.out.println("Informe uma quantidade de ingressos válida.");
        }
        return this.qtdIngressos;
    }

    // Sobrescrevendo o método toString
    @Override
    public String toString() {
        return "Filme: " + nomeFilme + ", Preço: R$ " + preco + ", Disponíveis: " + qtdIngressos;
    }
}
