package br.com.loja.mjv;

public class Livro extends Produto {

	private Integer paginas;
	private String autor;
	private Cadastro editora;

	public Livro(int id, String codigoDeBarras, String titulo, double valorVenda, int paginas, String autor) {
		super(id, codigoDeBarras, titulo, valorVenda);
		this.paginas = paginas;
		this.autor = autor;

	}

	public Cadastro getEditora() {
		return editora;
	}

	public void setEditora(Cadastro editora) {
		this.editora = editora;

	}

	public Integer getPaginas() {
		return paginas;
	}

	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

}
