package br.techcorp.funcionario;

public class Funcionario {
    private String matricula;
    private String nome;
    private String cargo;
    private double salarioBase;
    private double percentualBonus;
    private boolean ativo;

    public Funcionario(String matricula, String nome, String cargo, double salarioBase) {
        this.matricula = matricula;
        this.nome = nome;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
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
}
