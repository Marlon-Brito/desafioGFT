package exercicio02;

public class Teste {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Passaro passaro = new Passaro();
        animal.imprimir();
        System.out.println();
        passaro.setNome("Ave");
        passaro.imprimir();
    }
}
