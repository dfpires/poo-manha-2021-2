package lista3.redesocial;
import java.util.Date;

public class Publicacao {
    private int nro;
    private Date data;
    private float nota;
    // associações
    private RedeSocial redeSocial;
    private Usuario usuario;
    
    public Publicacao() {
    }
    public Publicacao(int nro, Date data, float nota, RedeSocial redeSocial, Usuario usuario) {
        this.setNro(nro);
        this.setData(data);
        this.setNota(nota);
        this.setRedeSocial(redeSocial);
        this.setUsuario(usuario);
    }

    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public RedeSocial getRedeSocial() {
        return redeSocial;
    }
    public void setRedeSocial(RedeSocial redeSocial) {
        this.redeSocial = redeSocial;
    }
    public float getNota() {
        return nota;
    }
    public void setNota(float nota) {
        this.nota = nota;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public int getNro() {
        return nro;
    }
    public void setNro(int nro) {
        this.nro = nro;
    }
  

    public String toString(){
        return "Número: " + this.nro + " data: " + this.data + " nota: " + this.nota +
        "\n Rede Social " + this.redeSocial.toString() + " \n Usuário: " + this.usuario.toString();
    }

    
    

}
