package lista4.exemplo;

public class B extends A{ // reutiliza as variáveis e métodos de A

  private int vb;

  public B(){
      super();
  }
  public B(int va, int vb){
    super(va);
    this.setVb(vb);
  }
  public int getVb() {
    return vb;
  }
  public void setVb(int vb) {
    this.vb = vb;
  }
  public void mb(){
    System.out.println("Método da classe B");
  }

}
