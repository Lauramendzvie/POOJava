package org.example;
public class Main {
    public static void main(String[] args) {
       /* Colaborador colaborador = new Colaborador("Triceratops Mendes", "Instrutor", 915011995); // instanciação
        System.out.println(colaborador.nome);
        System.out.println(colaborador.Cargo);
        System.out.println(colaborador.edv);

        Colaborador colaborador1 = new Colaborador("Triceratops Oliveira", 215011995);
        System.out.println(colaborador1.nome);
        System.out.println(colaborador.edv);

    } */

        // DEPARTAMENTO DEPARTAMENTO DEPARTAMENTO

        /*
                                |
                                |
                                |
                                V                                           */

        /*public class Main {
        public static void main(String[] args) */
            Departamento departamento = new Departamento("ets", 23000, 400);
            System.out.println("o orçamento foi de: "+departamento.calcularAumentoDeOrcamento(0.20));
            System.out.printf("o departamento %s tem %.0f funcionarios", departamento.nome, departamento.obterNumeroDeFuncionarios());


    }
}