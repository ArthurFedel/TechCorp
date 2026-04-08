package br.techcorp.departamento;

import br.techcorp.funcionario.Funcionario;

public class Departamento {
    private String codigo;
    private String nome;
    private Funcionario[] funcioarios;
    private int index;

    public Departamento(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.funcioarios = new Funcionario[5];
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarFuncionario (Funcionario f){
        if (index < funcioarios.length && f.isAtivo()){
            funcioarios[index++] = f;
        }
    }

    public double calcularFolhaTotalLiquida (){
        double total = 0;
        for (int i = 0; i < index; i++) {
            if (funcioarios[i].isAtivo()) {
                total += funcioarios[i].calcularSalarioLiquido();
            }
        }
        return total;
    }

    public int getTotalFuncionariosAtivos (){
        int total = 0;
        for (int i = 0; i < index; i++) {
            if (funcioarios[i].isAtivo()){
                total++;
            }
        }
        return total;
    }

    public Funcionario buscarFuncionario (String matricula){
        for (int i = 0; i < index; i++) {
            if (funcioarios[i].getMatricula().equalsIgnoreCase(matricula)){
                return funcioarios[i];
            }
        }
        return null;
    }

    public void removerFuncionario (String matricula){
        Funcionario aux = buscarFuncionario(matricula);
        if (aux != null){
            aux.desligar();
        }
    }

}
