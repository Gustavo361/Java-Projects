package projcontabancaria;

public class ProjContaBancaria {
    public static void main(String[] args) {
        ContaBancaria b1 = new ContaBancaria();
        b1.setNumConta(1111);
        b1.setDono("Robertin");
        b1.abrirConta("CC");
        
        ContaBancaria b2 = new ContaBancaria();
        b2.setNumConta(2222);
        b2.setDono("Claudia");
        b2.abrirConta("CP");
        
        b1.depositar(100);
        b2.depositar(500);
        b2.sacar(100);
        
        b1.sacar(150);
        b1.fecharConta();
        
        b1.estadoAtual();
        b2.estadoAtual();
        
    }
    
}
