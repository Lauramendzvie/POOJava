package org.example;

public class Colaborador {
    int edv;
    String nome;
    String Cargo;

    //construtor padrão existe em toda classe


    //construtor padrão ou sem parãmetros
    Colaborador(){
        System.out.println("O Construtor sem parâmetros foi executado");

    }

    Colaborador(String nome, String Cargo, int edv){
        this.nome = nome;
        this.Cargo = Cargo;
        this.edv = edv;
        System.out.println("Construtor com tres parâmetros foi chamado");

    }

    Colaborador(String nome, int edv){
        this.nome = nome;
        this.edv = edv;
        System.out.println("Construtor com dois parâmetros foi chamado");
    }



}
