package Departamento;

public class Usuario{
    String nome;
    String senha;
    String email;

    public Usuario(String nome, String senha, String email) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    }

    void autenticar(){
        System.out.printf("Usuario %s está autenticado\n", this.nome);
    }

    //Sobreescrita
    //é quando eu tenho na mesma classe métodos com assinaturas diferentes
    //Assinatura: quantidade e o tipo dos parametros de um método

    void autenticar(String sobrenome){
        System.out.printf("usuario %s esta autenticado", this.nome+sobrenome);
    }

    void concederAcessos(){
        System.out.printf("Usuario %s está com acessos regulares\n", this.nome);
    }

    void configurar(){

    }
}
