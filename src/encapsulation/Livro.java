package encapsulation;

import heranca.Pessoa;

public class Livro implements Publicaçao {
    private String titulo;
    private String autor;
    private Integer TotPaginas;
    private boolean aberto;
    private Pessoa leitor;
    private  int pagAtual;

    public String detalhes() {
        return "encapsulation.Livro{" +
                "\ntitulo='" + titulo + '\'' +
                "\n, autor='" + autor + '\'' +
                "\n, TotPaginas=" + TotPaginas +
                "\n, aberto=" + aberto +
                "\n, leitor=" + leitor.getNome() +
                "\n, pagAtual='" + pagAtual + '\''
                ;
    }

    public Livro(String titulo, String autor, Integer totPaginas, boolean aberto, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        TotPaginas = totPaginas;
        this.aberto = aberto;
        this.leitor = leitor;
        this.pagAtual = 0;
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

    public Integer getTotPaginas() {
        return TotPaginas;
    }

    public void setTotPaginas(Integer totPaginas) {
        TotPaginas = totPaginas;
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
    public void abir() {
    this.aberto = true;
    }

    @Override
    public void fechar() {
    this.aberto = false;
    }

    @Override
    public void folhear(int p) {
    if (p > this.TotPaginas) {
        this.pagAtual = 0;
    } else {
        this.pagAtual = p;
        }
    }

    @Override
    public void avancarPag() {
    this.TotPaginas++;
    }

    @Override
    public void voltarPag() {
    this.TotPaginas--;
    }
}
