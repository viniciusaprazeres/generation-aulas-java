package funcionario;

public class TestaFuncionario {
    public static void main(String[] args) {

        // Testes dos objetos usando a classe Funcionario
        Funcionario func1 = new Funcionario("123456789", "Mario Martins", "Analista de Suporte", 4000.0f, 10);
        Funcionario func2 = new Funcionario("987654321", "Mariana Almeida", "Supervisora", 12000.0f, 8);
        func1.visualizar();
        func2.visualizar();

        // Testes dos objetos usando a classe Gerente
        Gerente gr1 = new Gerente("298374577", "Daniel", "Gerente", 10000.0f, 12, "TI", 3000.0f);
        Gerente gr2 = new Gerente("432345234", "Roberta", "Gerente", 16000.0f, 20, "Vendas", 7000.0f);
        gr1.visualizar();
        gr2.visualizar();

        // Testes dos objetos usando a classe Vendedor
        Vendedor vd1 = new Vendedor("485603475", "Maria Joaquina", "Vendedora", 5000.0f, 5, 6000.0f);
        Vendedor vd2 = new Vendedor("437643271", "João das Neves", "Vendedor", 5000.0f, 15, 18000.0f);
        vd1.visualizar();
        vd2.visualizar();

    }
}
