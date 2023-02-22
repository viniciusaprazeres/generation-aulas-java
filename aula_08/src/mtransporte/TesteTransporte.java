package mtransporte;

public class TesteTransporte {

    public static void main(String[] args) {

        Transporte t1 = new Transporte(5);
        Terrestre tr1 = new Terrestre(5, 4, 200);
        Automovel a1 = new Automovel(5, 4, 200, "Branco", 4, "XPT-2131", 5);


        t1.visualizar();

        System.out.println("\n");

        tr1.visualizar();

        System.out.println("\n");

        a1.visualizar();

    }
}
