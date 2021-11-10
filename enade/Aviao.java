package enade;

public abstract class Aviao {
    
    // criar 2 variáveis do tipo classe interface
    Voar formaVoar;
    Pousar formaPousar;

    // métodos da classe
    public void performanceVoar(){
        formaVoar.voar(); // polimorfismo -> executar o método voar() da classe VoarDia ou VoarNoite
    }
    public void performancePousar(){
        formaPousar.pousar(); // polimofismo -> -> executar o método pousar() da classe PousarDia ou PousarNoite
    }

    // alterar a forma de voar
    public void setVoar(Voar voar){ // podemos passar como parâmetro VoarDia ou VoarNoite
        formaVoar = voar;
    }
    // alterar a forma de pousar
    public void setPousar(Pousar pousar){ // podemos passar como parâmetro PousarDia ou PousarNoite
        formaPousar = pousar;
    }

    public abstract void informarDados();
}
