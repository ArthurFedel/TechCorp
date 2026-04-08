package br.techcorp.funcionario;

import java.text.DecimalFormat;

public class Funcionario {
    private String matricula;
    private String nome;
    private String cargo;
    private double salarioBase;
    private double percentualBonus;
    private boolean ativo;

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

    public String getMatricula() {
        return matricula;
    }

    public Funcionario(String matricula, String nome, String cargo, double salarioBase) {
        this.matricula = matricula;
        this.nome = nome;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
        this.ativo = true;
    }

    public void definirBonus (double percentual){
        if (percentual > 0){
            percentualBonus = percentual;
        }
    }

    public void desligar(){
        ativo = false;
        percentualBonus = 0;
    }

    public boolean isAtivo(){
        return ativo;
    }

    public void aplicarAumento(double percentual){
        salarioBase *= (1 + percentual / 100);
    }

    public double calcularSalarioLiquido (){
        double salario = salarioBase + salarioBase * percentualBonus / 100;
        return salario * 0.85;
    }

    public String exibirResumo(){
        DecimalFormat df = new DecimalFormat("#,##0.00");
        String aux = "";
        aux += "Matrícula: " + matricula + "\n ";
        aux += "Nome: " + nome + "\n ";
        aux += "Cargo: " + cargo + "\n ";
        aux += "Salário Liquido: " + df.format(calcularSalarioLiquido()) + "\n ";
        return aux;
    }


}
