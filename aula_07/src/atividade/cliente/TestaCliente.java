package cliente;

public class TestaCliente {
    public static void main(String[] args) {

    Cliente cl1 = new Cliente("Vinicius Prazeres", 26, "Desenvolvedor de software", 10000.0f, "viniciusprazeres@vmail.com");

    Cliente cl2 = new Cliente("João da Silva", 40, "Engenheiro de computação", 15000.0f, "joaodasilva@jmail.com");

    cl1.visualizar();

    cl2.visualizar();

    }
}
