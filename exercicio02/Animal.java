package exercicio02;

public class Animal {
    private String nome = "Rex";

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimir() {
        System.out.printf("Nome: %s", nome);
    }
}
