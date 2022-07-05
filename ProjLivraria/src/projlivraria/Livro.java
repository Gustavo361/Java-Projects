package projlivraria;

import java.util.Random;
import java.util.Scanner;

public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.pagAtual = 1;
        this.aberto = false;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    @Override
    public void abrir(){
        if (aberto == true) {
            System.out.println("O livro já estava aberto");
        } else {
            aberto = true;
            System.out.println("O livro está aberto");
        }
    }
    
    @Override
    public void fechar(){
        if (aberto = false) {
            System.out.println("O livro já estava fechado");
        } else {
            aberto = true;
            System.out.println("O livro está fechado");
        }
    }
    
    Scanner s = new Scanner(System.in);
    @Override
    public void folhear() { //add parametro E n é possivel folhear mais paginas do q o total de paginas
        if (aberto = false) {
            System.out.println("Impossível folhear porque o livro está fechado");
        } else {
            Random aleatorio = new Random();
            int pagsFolheadas = aleatorio.nextInt(15);
            pagAtual = pagAtual + pagsFolheadas;
            
            System.out.println("Você folheou " + pagsFolheadas + " vezes e está na página n° " + pagAtual);
        }
    }
    
    @Override
    public void avancarPag() {
        int pg;
        
        System.out.print("Avançar quantas páginas?");
        pg = s.nextInt();
        
        if (pg > totPaginas) {
            System.out.println("Impossível folhear mais do que o número total de páginas");
        } else {
            System.out.println("Você avançou até a página " + (pagAtual + pg));
        }
        //this.pagAtual++;
    }
    
    @Override
    public void voltarPag() {
        int pg;
        
        System.out.print("Você quer voltar quantas páginas?");
        pg = s.nextInt();
        
        if(pg > pagAtual) {
            System.out.println("Impossível voltar mais do que o número da página atual");
        } else {
            System.out.println("Você voltou à página " + (pagAtual - pg));
        }
        //this.pagAtual--;
    }
    
    public void detalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Total de páginas: " + totPaginas);
        System.out.println("Leitor atual:" + leitor.getNome());
    }
}