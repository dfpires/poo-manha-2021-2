package lista3;
import java.util.Date;
public class Reserva {
    private int nro;
    private Date data;
    // associação
    private Passageiro passageiro; // Passageiro é a classe e passageiro é o objeto
    private Voo voo; // Voo é a classe e voo é o objeto

    public Reserva(){

    }
    public Reserva(int nro, Date data, Passageiro passageiro, Voo voo) {
        this.setNro(nro);
        this.setData(data);
        this.setPassageiro(passageiro);
        this.setVoo(voo);
    }
    public int getNro() {
        return nro;
    }
    public void setNro(int nro) {
        this.nro = nro;
    }
    public Voo getVoo() {
        return voo;
    }
    public void setVoo(Voo voo) {
        this.voo = voo;
    }
    public Passageiro getPassageiro() {
        return passageiro;
    }
    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }

    public String toString(){
        return "Número: " + this.nro + " Data: " + this.data + " \n Passageiro: " + this.passageiro.toString() +  "\n  Voo: " + this.voo.toString();
    }
}
