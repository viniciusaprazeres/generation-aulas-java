package aula_07;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteFarmacia {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        ArrayList<Farmacia> medicamentos = new ArrayList<>();

        long id;
        String nome, nomeComercial, fabricante, foto, opcao;
        float preco;

        do {
            System.out.println("\nID: ");
            id = leia.nextLong();

            System.out.println("\nNome: ");
            leia.skip("\\R?");
            nome = leia.nextLine();

            System.out.println("\nNome comercial: ");
            nomeComercial = leia.nextLine();

            System.out.println("\nFabricante: ");
            fabricante = leia.nextLine();

            System.out.println("\nFoto: ");
            foto = leia.nextLine();

            System.out.println("\nPreço: ");
            preco = leia.nextFloat();

            Farmacia farmacia1 = new Farmacia(id, nome, nomeComercial, fabricante, foto, preco);
            // Farmacia farmacia2 = new Farmacia(2, "Paracetamol", "Tylenol", "Neo Química", "-", 20.0f);

            medicamentos.add(farmacia1);

            System.out.println("\nDeseja continuar?: ");
            leia.skip("\\R?");
            opcao = leia.nextLine();

        } while (opcao.equalsIgnoreCase("S"));
        // farmacia1.visualizar();
        // farmacia2.visualizar();

        for (var medicamento: medicamentos)
            medicamento.visualizar();

    }
}
