package exercicio02;

public class Animal {
    // Atributos
    protected String nome;

    // Construtor
    public Animal(String nome) {
        this.nome = nome;
    }

    // Métodos
    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Sobrescrevendo o método toString
    @Override
    public String toString() {
        return "Nome: " + nome;
    }
}
