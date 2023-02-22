package funcionario;

public class TestaFuncionario {
    public static void main(String[] args) {

        Funcionario func1 = new Funcionario("123456789", "Mario Martins", "Vendedor", 4000.0f, 10);

        Funcionario func2 = new Funcionario("987654321", "Mariana Almeida", "Supervisora", 12000.0f, 8);

        func1.visualizar();

        func2.visualizar();

    }
}
