package projcontabancaria;

public class ContaBancaria {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
    /*public ContaBancaria(int numConta, String tipo, String dono, double saldo, boolean status) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = saldo;
        this.status = status; 
    }*/
    
    public void estadoAtual() {
        System.out.println("____________________________");
        System.out.println("Conta: " + numConta);
        System.out.println("Tipo: " + tipo);
        System.out.println("Dono: " + dono);
        System.out.println("Saldo: " + saldo);
        System.out.println("status: " + status);
    }
    
    
    public void abrirConta(String tipo) {
        this.tipo = tipo;
        this.status = true;
        
        if (tipo == "CC") {
            this.setSaldo(50);
        } else if (tipo == "CP") {
            this.setSaldo(150);
        } else {
            System.out.println("Erro! Valor inválido.");
        }
    }
    
    public void fecharConta() {
        if (this.saldo > 0) {
            System.out.println("Conta com dinheiro");
        } else if (saldo < 0) {
            System.out.println("Conta com débito");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }
    
    public void depositar(double valor) {
        if (status == true) {
            setSaldo(getSaldo() + valor);
            System.out.println("Depósito realizado com sucesso");
        } else {
            System.out.println("Impossível depositar");
        }
    }
    
    public void sacar(double valor) {
        if (status == true) {
            if (saldo >= valor) {
                saldo = saldo - valor;
                System.out.println("Saque realizado na conta de(a) " + this.dono);
            } else {
                System.out.println("Saldo insuficiente para saque");
            }
        } else {
            System.out.println("Impossível sacar de uma conta fechada");
        }
    }
    
    public void pagarMensalmente() {
        double valor = 0;
        if (tipo == "CC") {
            valor = 12;
        } else if (tipo == "CP") {
            valor = 20;
        }
        if (status == true) {
            if (saldo > valor) {
                saldo = saldo - valor;
                System.out.println("Mensalidade paga com sucesso");
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossível pagar com conta inexistente");
        }
    }
    
    public int getNumConta() {
        return this.numConta;
    }
    public String getTipo() {
        return this.tipo;
    }
    public String getDono() {
        return this.dono;
    }
    public double getSaldo() {
        return this.saldo;
    }
    public boolean getStatus() {
        return this.status;
    }
    
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setStatus(boolean  status) {
        this.status = status;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
