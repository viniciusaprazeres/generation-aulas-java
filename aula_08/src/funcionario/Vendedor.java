package funcionario;

public class Vendedor extends Funcionario{

    private float comissao;

    public Vendedor(String matricula, String nome, String cargo, float salario, int horasExtras, float comissao) {
        super(matricula, nome, cargo, salario, horasExtras);
        this.comissao = comissao;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    public void visualizar() {
        super.visualizar();
        System.out.println("Comissão R$: " + this.comissao);
    }
}
