package br.techcorp.main;

import br.techcorp.departamento.Departamento;
import br.techcorp.funcionario.Funcionario;

public class Main {
    public static void main(String[] args) {
        Departamento departamento = new Departamento("TI01", "TI");
        departamento.adicionarFuncionario(new Funcionario("01","AA","Diretor",85000));
        departamento.adicionarFuncionario(new Funcionario("02","BB","Gerente",42500));
        departamento.adicionarFuncionario(new Funcionario("03","CC","Funcinário",21250));

        // Exibir os dados do departamento
        System.out.println(departamento.exibirRelatorio());

        // Desligar um funcionário
        departamento.removerFuncionario("03");

        System.out.println(departamento.exibirRelatorio());
    }
}
