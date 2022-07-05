package projlivraria;

import java.util.Scanner;

public class ProjLivraria {
    public static void main(String[] args) {
        //Scanner s = new Scanner(System.in);
        
        Pessoa p[] = new Pessoa[2];
        Livro l[] = new Livro[2];
        
        p[0] = new Pessoa("Carlos", 43, 'M');
        p[1] = new Pessoa("Jade", 29, 'F');
        
        l[0] = new Livro("Como ler livros", "Mortmer Adler", 457, p[0]);
        l[1] = new Livro("A culpa é das estrelas", "Sei lá", 241, p[1]);
        
        //l[1].detalhes();
        //l[0].detalhes();
        
        l[1].abrir();
        //l[1].folhear();
        l[1].setPagAtual(16);
        l[1].getPagAtual();
        //l[1].avancarPag();
        //l[1].voltarPag(); //erro, não memoriza o num da pg atual
        //l[1].fechar();
        l[1].detalhes();
        
    }
    
}
