package br.com.loja.mjv;

public class Livro extends Produto {
	
	private Integer paginas;
	private String autor;

	public Livro(int id, String codigoDeBarras, String titulo, double valorVenda, int paginas, String autor) {
		super(id, codigoDeBarras, titulo, valorVenda);
		this.paginas = paginas;
		this.autor = autor;
		
	}

}
