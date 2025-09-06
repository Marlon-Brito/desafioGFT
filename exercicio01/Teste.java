public class Teste {
    public static void main(String[] args) {
        // Instanciando um ingresso
        Ingresso ingresso = new Ingresso("Aventura Épica", 30.00, 10);
        // Exibindo informações do ingresso
        System.out.println(ingresso);
        // Comprando ingressos
        ingresso.comprarIngressos(2);
        // Exibindo informações do ingresso
        System.out.println(ingresso);
    }
}
