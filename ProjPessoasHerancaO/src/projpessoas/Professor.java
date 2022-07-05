package projpessoas;

public class Professor extends Pessoa{ //herda os atributos e metodos da classe Pessoa
    private String especialidade;
    private float salario;

    /*public Professor(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }*/
    
    public void receberAumento(float aumento) {
        this.salario += aumento;
    }
    
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
