package br.com.poo.banco.funcionarios;

public class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;

    public double calcularBonificacao(){
        return this.salario * 0.15;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}
