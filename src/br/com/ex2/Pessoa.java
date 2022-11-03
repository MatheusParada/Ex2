package br.com.ex2;

public class Pessoa {

    private String Nome;
    private String Email;
    private String Telefone;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public Pessoa(String nome, String email, String telefone) {
        Nome = nome;
        Email = email;
        Telefone = telefone;
    }
}
