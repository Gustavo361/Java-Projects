package projpessoaherancaoo;

public class Tecnico extends Aluno{
    private String registroProfissional;

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
    public void praticar() {
        System.out.println("Técnico praticando");
    }

    @Override
    public String toString() {
        return "Tecnico{" + "registroProfissional=" + registroProfissional + '}';
    }
}
