// HERANÇA: Desenvolvedor "é um" Funcionario
public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario); // Repassa os dados para o pai
    }

    // POLIMORFISMO: O desenvolvedor tem uma regra de bônus diferente!
    @Override
    public double calcularBonus() {
        return getSalario() * 0.15; // Bônus de 15% para os Devs
    }
}