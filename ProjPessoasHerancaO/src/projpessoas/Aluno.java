package projpessoas;

public class Aluno extends Pessoa{  //herda os atributos e metodos da classe Pessoa
    private String mat;
    private String curso;

    /*public Aluno(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }*/
    
    public void cancelarMatricula(){
        System.out.println("Matrícula cancelada");
    }

    public String getMat() {
        return mat;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
