package projcaneta;

public class Caneta {
    String modelo; //todos static
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    final void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada?" + this.tampada);
    }
    
    final void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO! Não é possível rabiscar.");
        } else {
            System.out.println("Está rabiscando.");
        }
    }
    
    final void tampar() {
        this.tampada = true;
    }
    
    final void destampar() {
        this.tampada = false;
    }
}


/*
public - The class is accessible by any other class
private - The code is only accessible within the declared class

static - Attributes and methods belongs to the class, rather than an object
final - Attributes and methods cannot be overridden/modified
*/