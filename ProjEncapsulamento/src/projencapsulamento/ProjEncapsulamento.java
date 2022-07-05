package projencapsulamento;

public class ProjEncapsulamento {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        
        c.ligar();
        c.maisVolume();
        c.ligarMudo();
        c.fecharMudo();
        c.abrirMenu();
        c.fecharMenu();
    }
}
