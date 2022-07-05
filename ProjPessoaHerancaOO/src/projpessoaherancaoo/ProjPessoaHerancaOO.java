package projpessoaherancaoo;
//metodo final nao pode ser sobreposto (@Override) / classe final nao pode ter filhos
public class ProjPessoaHerancaOO {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa();
        /*Visitante v1 = new Visitante();
        v1.setNome("Juvenildo");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());*/
        
        Aluno a1 = new Aluno();
        a1.setNome("Xarles");
        a1.setMatricula(5324);
        a1.setCurso("Informática");
        a1.setIdade(35);
        a1.setSexo("M");
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setMatricula(1122);
        b1.setNome("Jubileu");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();
    }
}
