public class Main {
    public static void main(String[] args) {

        System.out.println("=== Sistema de RH da TechCorp ===");

        // Criando os objetos
        Funcionario dev = new Desenvolvedor("Juliano (Dev Backend)", 5000.0);
        Funcionario gerente = new Gerente("Pedro (Tech Lead)", 9000.0);
        Funcionario suporte = new Funcionario("Ricardo (Suporte N1)", 3000.0);

        // Demonstrando o Polimorfismo na prática:
        // O mesmo método (calcularBonus) age de forma diferente para cada um!
        exibirFolhaDePagamento(dev);
        exibirFolhaDePagamento(gerente);
        exibirFolhaDePagamento(suporte);
    }

    // Método auxiliar que aceita qualquer tipo de Funcionário!
    public static void exibirFolhaDePagamento(Funcionario func) {
        System.out.println("\nColaborador: " + func.getNome());
        System.out.println("Salário Base: R$ " + func.getSalario());
        System.out.println("Bônus Anual: R$ " + func.calcularBonus());
    }
}