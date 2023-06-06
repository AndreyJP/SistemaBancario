package br.com.poo.banco.funcionarios;

public class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;

    public Funcionario(){

    }

    public double calcularBonificacao(){
        return this.salario * 0.15;
    }

    public double calcularBonificacao(double bonus){
        return this.calcularBonificacao() + bonus;
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

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
