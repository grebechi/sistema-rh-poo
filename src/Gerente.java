// HERANÇA: Gerente "é um" Funcionario
public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario); // Repassa os dados para o pai
    }

    // POLIMORFISMO: O gerente ganha 20% + um valor fixo
    @Override
    public double calcularBonus() {
        return (getSalario() * 0.20) + 1000.0;
    }
}