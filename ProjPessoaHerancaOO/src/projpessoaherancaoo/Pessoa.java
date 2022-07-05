package projpessoaherancaoo;

public abstract class Pessoa { //classe abstrata não pode instanciar objetos
    protected String nome;
    protected int idade;
    protected String sexo;

    public void fazerAniver() {
        this.idade++;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override // pilar do polimorfismo
    public String toString() {
        return "Dados{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
}
