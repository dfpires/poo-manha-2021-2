package prova;

public class Carro {
    private int ram;
    private String modo;
    
    public Carro() {
    }
    public Carro(int ram, String modo) {
        this.setRam(ram);
        this.setModo(modo);
    }
    public int getRam() {
        return ram;
    }
    public String getModo() {
        return modo;
    }
    public void setModo(String modo) {
        if ((modo.equals("ligado") || modo.equals("desligado")) {
            this.modo = modo;
        }
        else {
               System.out.println("Valor de modo é inválido");
        }
    }
    public void setRam(int ram) {
        if ((ram == 4) || (ram == 8) || (ram == 16) || (ram == 32)) {
            this.ram = ram;
        }
        else {
            System.out.println("Valor de memória RAM inválida");
        }
    }
    
}
