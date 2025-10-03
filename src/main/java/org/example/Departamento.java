package org.example;

public class Departamento {
    String nome;
    double orcamento;
    int numeroFuncionarios;
    
    public Departamento(String nome, double orcamento, int numeroFuncionarios){
        this.nome = nome;
        this.orcamento = orcamento;
        this.numeroFuncionarios = numeroFuncionarios;
    }
    
    void atualizarNome(String nome){
        //void são métodos que não possuem retorno
        this.nome = nome;
    }
    
    void exibirDetalhes(){ //nome de métodos segue o padrão camelCase
        System.out.printf("O departamento de %s esta com %d funcionarios e"
                + "com o orçamento de %.2f\n", this.nome, this.numeroFuncionarios, this.orcamento);
    }

    double calcularAumentoDeOrcamento(double percentual){
        return (orcamento*percentual)+orcamento;
    }

    double obterNumeroDeFuncionarios(){
        return numeroFuncionarios;
    }
        
}
