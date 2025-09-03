public class Teste {
    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso();
        System.out.println(ingresso.getQtdIngressos());
        ingresso.comprarIngressos(2);
        ingresso.exibir(ingresso.getNomeFilme(), ingresso.getPreco(), ingresso.getQtdIngressos());
    }
}
