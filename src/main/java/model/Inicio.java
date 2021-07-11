package model;

public class Inicio {
    private String login;
    private String senha;
    public String nome;

    public Inicio(final String login, final String senha){
        this.login=login;
        this.senha=senha;
    }

    public String getLogin(){return login;}
    public String getSenha(){return senha;}

    public String nome() {return nome;
    }

    @Override
    public String toString(){
        return "Funcionou certinho! E para fins didáticos:" +
                "\nLogin: " + getLogin() +
                "\nSenha: " + getSenha();
    }
}

