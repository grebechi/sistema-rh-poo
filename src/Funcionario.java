public class Funcionario {
    // ENCAPSULAMENTO: Os atributos são privados. Ninguém mexe diretamente no salário!
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Ação base que será modificada pelas classes filhas
    public double calcularBonus() {
        return salario * 0.10; // Bônus padrão de 10%
    }

    // Getters e Setters para acesso seguro
    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}