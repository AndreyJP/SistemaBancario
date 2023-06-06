package br.com.poo.banco.funcionarios;

public class Gerente extends Funcionario {
    private int senha;
    private String tipo;

    public Gerente(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public Gerente(String nome, double salario, String tipo){
        this.nome = nome;
        this.salario = salario;
        this.tipo = tipo;
    }

    @Override
    public double calcularBonificacao(){
        return this.salario * 0.20;
    }

    public String getTipo() {
        return tipo;
    }
}
