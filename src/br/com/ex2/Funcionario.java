package br.com.ex2;

public class Funcionario extends Pessoa{

    private String departamento;
    private Double salario;
    private String dataEntrada;
    private String rG;
    private boolean status;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        departamento = departamento;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        salario = salario;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getRg() {
        return rG;
    }

    public void setRg(String rg) {
        rG = rg;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Funcionario(String nome, String email, String telefone, String departamento, Double salario, String dataEntrada, String rg, boolean status) {
        super(nome, email, telefone);
        departamento = departamento;
        salario = salario;
        this.dataEntrada = dataEntrada;
        this.rG = rg;
        this.status = status;
    }

    public void bonificar(double bonus){
        this.salario = this.salario + bonus;
    }
    public void demitir(){
        this.status = false;
    }
    public String mostrarDados(){
        return getNome() + "\n" + getEmail()+ "\n" + getDepartamento() + "\n" + getTelefone() + "\n"+ getRg() + "\n" + getSalario() + "\n"+ getDataEntrada() + "\n" + isStatus();
    }
}

