package projlivraria;

import java.time.LocalDate;
import java.util.Calendar;

public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;
    
    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public char getSexo() {
        return this.sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    public void fazerAniver() {
        this.idade++;
        
        
        /*LocalDate dataAtual = LocalDate.now();
        int anoAtual = dataAtual.getYear();*/
        
        /*Calendar cal = Calendar.getInstance();
        int anoAtual = cal.get(Calendar.YEAR);
        
        int anoNascimento = anoAtual - idade;
        
        if ((anoAtual - anoNascimento) == anoAtual) {
            System.out.println("Hoje é seu aniversário");
        } else {
            System.out.println("Hoje não é seu aniversário");
        }   */
    }
    
}
