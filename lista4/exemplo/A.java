package lista4.exemplo;
public class A {
    protected int va;
    public A(int va) {
        this.va = va;
    }
    public A() {
    }
    public void setVa(int va){
        this.va = va;
    }
    public int getVa(){
        return this.va;
    }
    public void ma(){
        System.out.println("Método da classe A");
    }
}
