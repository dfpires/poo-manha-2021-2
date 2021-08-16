package lista2;

public class Cliente {
    // variáveis de instância
    private String numeroConta, numeroAgencia, nome;
    private float saldo;

    // métodos construtores
    public Cliente(){

    }
    public Cliente(String numeroConta, String numeroAgencia, String nome, float saldo){
        this.setNumeroConta(numeroConta);
        this.setNumeroAgencia(numeroAgencia);
        this.setNome(nome);
        this.setSaldo(saldo);
    }
    // setters fazem as verificações de restrição de valores das variáveis
    // getters retornam os valores das variáveis


    // encapsulamento de métodos -> para eles não serem alterados
    // quem poderia alterá-los? classes filhas 
    final void setSaldo(float saldo) {
        if (saldo >= 0){
            this.saldo = saldo; 
        }
        else {
            System.out.println("Saldo não pode ficar negativo");
        }
       
    }

    final void setNumeroAgencia(String numeroAgencia) {
        if ((numeroAgencia.length() == 6) && (numeroAgencia.charAt(4) == '-')){
            this.numeroAgencia = numeroAgencia;
        }
        else {
            System.out.println("Número de agência inválido");
        }
    }
    final void setNome(String nome) {
        if (nome.length() < 30){
            this.nome = nome;
        }
        else {
            System.out.println("Nome inválido");
        }
    }
    final void setNumeroConta(String numeroConta) {
        if ((numeroConta.length() == 8) && (numeroConta.charAt(6) == '-')){
            this.numeroConta = numeroConta;
        }
        else {
            System.out.println("Número da conta inválido");
        }
    }
    
    public float getSaldo(){
        return this.saldo;
    }

    public String getNumeroConta(){
        return this.numeroConta;
    }

    public String getNumeroAgencia(){
        return this.numeroAgencia;
    }

    public String getNome(){
        return this.nome;
    }

    // realizar o depósito
    public void realizarDeposito(float x){
        this.saldo = this.saldo + x;
    }

    // realizar o saque

}
