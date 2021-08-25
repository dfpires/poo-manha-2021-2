package lista3.redesocial;

public class RedeSocial {
    private int codigo;
    private String nome;
    private String url;

    public RedeSocial() {
    }
    public RedeSocial(int codigo, String nome, String url) {
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setUrl(url);
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String toString(){
        return "Código: " + this.codigo + " Nome: " + this.nome + " URL: " + this.url;
    }
    
}
