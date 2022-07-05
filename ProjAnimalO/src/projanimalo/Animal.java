package projanimalo;

public abstract class Animal {
    protected float peso;
    protected int idade;
    protected int membros;
    
    public abstract void emitirSom(); //só é possivel ter metodos abstratos dentro de uma classe abstrata
}
