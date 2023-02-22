package funcionario;

public class Gerente extends Funcionario{

    private String departamento;
    private float bonificacao;

    public Gerente(String matricula, String nome, String cargo, float salario, int horasExtras, String departamento, float bonificacao) {
        super(matricula, nome, cargo, salario, horasExtras);
        this.departamento = departamento;
        this.bonificacao = bonificacao;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public float getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(float bonificacao) {
        this.bonificacao = bonificacao;
    }

    public void visualizar(){
        super.visualizar();
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Bonificação R$: " + this.bonificacao);
    }

}
