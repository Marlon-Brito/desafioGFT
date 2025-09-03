package exercicio02;

public class Passaro extends Animal {
    private double envergadura = 1.5;

    public double getEnvergadura() {
        return this.envergadura;
    }

    public void setEnvergadura(double envergadura) {
        this.envergadura = envergadura;
    }

    @Override
    public void imprimir() {
        System.out.printf("Nome: %s | Envergadura: %s m", getNome(), envergadura);
    }
}
