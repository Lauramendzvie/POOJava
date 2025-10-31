package Departamento;

public class UsuarioAdmin extends Usuario {

    public UsuarioAdmin(String nome, String senha, String email){
        super(nome, senha, email);
    }

    //Sobrecarga de métodos>
    //Sobrecarga é sempre quando temos uma relação de herança

    @Override
    void concederAcessos(){
        super.concederAcessos();
        System.out.printf("Usuario %s esta com acessos administrativos", this.nome);
    }
}
