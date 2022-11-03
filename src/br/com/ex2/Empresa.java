package br.com.ex2;

public class Empresa {
    private String nomeEmpresa;
    private String cnpg;
    private int qtde_de_funcionario;
    private static int count=0;

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getCnpg() {
        return cnpg;
    }

    public void setCnpg(String cnpg) {
        this.cnpg = cnpg;
    }

    public int getQtde_de_funcionario() {
        return qtde_de_funcionario;
    }

    public void setQtde_de_funcionario(int qtde_de_funcionario) {
        this.qtde_de_funcionario = qtde_de_funcionario;
    }

    Funcionario[] funcionarios;

    public Empresa(String nomeEmpresa, String cnpg, int qtde_de_funcionario) {
        this.nomeEmpresa = nomeEmpresa;
        this.cnpg = cnpg;


        if (qtde_de_funcionario<=100) {


            this.qtde_de_funcionario = qtde_de_funcionario;
            funcionarios = new Funcionario[qtde_de_funcionario];
        }
        else{

            this.qtde_de_funcionario = 100;
            funcionarios = new Funcionario[100];

        }
    }
    public void insereFuncionario(Funcionario func){
        funcionarios[count]= func;
        count++;
    }
}

