package exercicio02;

public class Passaro extends Animal { // Herdando a classe Animal
    // Atributos
    private double envergadura;

    // Construtor
    public Passaro(String nome, double envergadura) {
        super(nome);
        this.envergadura = envergadura;
    }

    // Métodos
    // Getters e Setters
    public double getEnvergadura() {
        return this.envergadura;
    }

    public void setEnvergadura(double envergadura) {
        this.envergadura = envergadura;
    }

    // Sobrescrevendo o método toString
    @Override
    public String toString() {
        return "Nome: " + nome + ", Envergadura: " + envergadura;
    }
}
