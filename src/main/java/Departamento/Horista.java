package Departamento;

public class Horista extends Colaborador{
    double horasTrabalhadas;
    double salarioPorHoras;

    public Horista(int edv, String nome, String cargo, double horasTrabalhadas, double salarioPorHoras){
        super(edv, nome, cargo);
        this.horasTrabalhadas = horasTrabalhadas;
        this.salarioPorHoras = salarioPorHoras;
    }

    @Override
    public String toString() {
        return "Horista{" +
                "horasTrabalhadas=" + horasTrabalhadas +
                ", salarioPorHoras=" + salarioPorHoras +
                ", edv=" + edv +
                ", nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }

    double receberSalario(){
        return this.salarioPorHoras*this.horasTrabalhadas;

    }
}
