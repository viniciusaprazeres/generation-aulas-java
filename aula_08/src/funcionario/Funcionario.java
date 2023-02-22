package funcionario;

import com.sun.security.jgss.GSSUtil;

public class Funcionario {

    private String matricula;
    private String nome;
    private String cargo;
    private float salario;
    private int horasExtras;

    public Funcionario(String matricula, String nome, String cargo, float salario, int horasExtras) {
        this.matricula = matricula;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.horasExtras = horasExtras;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public void visualizar(){

        System.out.println("*************************************");
        System.out.println("         DADOS DO FUNCIONÁRIO        ");
        System.out.println("*************************************");
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Nome: " + this.nome);
        System.out.println("Cargo: " + this.cargo);
        System.out.println("Salário R$: " + this.salario);
        System.out.println("Quantidade de horas extras: " + this.horasExtras);
    }

}
