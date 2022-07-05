package projpessoas;

public class ProjPessoas {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Pedro");
        p1.setSexo("M");
        
        p2.setNome("Claudio");
        p2.setIdade(33);
        p2.setCurso("Informática");
        
        p3.setNome("Fabiana");
        p3.setSalario(2500.5f);
        p3.receberAumento(550.50f);
        
        
        p4.setNome("Maria");
        p4.setSexo("F");
        p4.setSetor("Estoque");
        
        /*p1.receberAumento(434.432f);
        p2.mudarTrabalho();
        p4.cancelarMatricula();*/
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
    
}
