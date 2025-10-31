package Departamento;

public class Main {
    public static void main(String[] args) {

        Prioridade prioridade = Prioridade.ALTA;

        switch (prioridade){
            case BAIXA -> System.out.println("chamado com prioridade baixa, resolver quando tiver disponibilidade");
            case MEDIA -> System.out.println("chamado com prioridade media, resolver quando for assim possível");
            case ALTA -> System.out.println("chamado com prioridade alta, resolver o quanto antes");
            case URGENTE -> System.out.println(" Chamado com prioridade URGENTE, resolver AGORA");
        }


}