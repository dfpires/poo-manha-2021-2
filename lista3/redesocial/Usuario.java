package lista3.redesocial;

public class Usuario {
    private int codigo;
    private String login;
    private String senha;
    
    public Usuario(){

    }
    public Usuario(int codigo, String login, String senha){
        this.setCodigo(codigo);
        this.setLogin(login);
        this.setSenha(senha);
    }
    public int getCodigo() {
        return codigo;
    }
    public String getSenha() {
        return senha;
    }
    public final void setSenha(String senha) {
        this.senha = senha;
    }
    public String getLogin() {
        return login;
    }
    public final void setLogin(String login) {
        this.login = login;
    }
    public final void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String toString(){
        return " Código: " + this.codigo + " Login: " + this.login + " Senha: " + this.senha;
    }
}
