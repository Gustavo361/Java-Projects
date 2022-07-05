package projpessoaherancaoo;

public class Bolsista extends Aluno{
    private float bolsa;

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de(a) " + this.nome);
    }
    
    @Override //sobrepondo metodo que já existe
    public void pagarMensalidade() {
        System.out.println(this.nome + " é bolsista. Pagamento facilitado");
    }
}
