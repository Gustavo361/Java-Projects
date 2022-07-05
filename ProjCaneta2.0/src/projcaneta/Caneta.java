package projcaneta;

public class Caneta {
    public String modelo; //todos static
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void status() { //final
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada?" + this.tampada);
    }
    
    private void rabiscar() { //final
        if (this.tampada == true) {
            System.out.println("ERRO! Não é possível rabiscar.");
        } else {
            System.out.println("Está rabiscando.");
        }
    }
    
    public void tampar() { //final
        this.tampada = true;
    }
    
    public void destampar() { //final
        this.tampada = false;
    }
}


/*
publica pra pacote - visibiblidade padrao
public - The class is accessible by any other class
private - The code is only accessible within the declared class

static - Attributes and methods belongs to the class, rather than an object. static método, o que significa que ele pode ser acessado sem criar um objeto da classe, diferente publicde , que só pode ser acessado por objetos
final - Attributes and methods cannot be overridden/modified
*/