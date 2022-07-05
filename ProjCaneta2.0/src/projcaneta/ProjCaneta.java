package projcaneta;
public class ProjCaneta {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f; private
        //c1.tampada = true;
        c1.status();
    }
    
}
