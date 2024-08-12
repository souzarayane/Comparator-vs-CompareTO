package comparator;

public class Livro implements Comparable<Livro> {

	// Atributos da Classe
	String titulo;
	double preco;
	int anoPublicacao;

	// Método construtor
	public Livro(String titulo, double preco, int anoPublicacao) {
		super();
		this.titulo = titulo;
		this.preco = preco;
		this.anoPublicacao = anoPublicacao;
	}

	// Método Getter
	public String getTitulo() {
		return titulo;
	}

	public double getPreco() {
		return preco;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	// Implementação da interface Comparable<Livro> para comparar livros pela ordem
	// alfabética dos títulos
	public int compareTo(Livro outroLivro) {
		return this.titulo.compareTo(outroLivro.getTitulo());
	}

	// toString para exibir informações do livro
	public String toString() {
		return "Livro{" + "Título = '" + titulo + '\'' + ", preço = " + preco + ", ano de Publicação = " + anoPublicacao
				+ '}';
	}

}
