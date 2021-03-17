package br.com.loja.mjv;

public class Cd extends Produto {

	private Integer faixas;
	private Cadastro artista;

	public Cd(int id, String codigoDeBarras, String titulo, double valorVenda, int faixas) {
		super(id, codigoDeBarras, titulo, valorVenda);
		this.faixas = faixas;

	}

	public Cadastro getArtista() {
		return artista;
	}

	public void setArtista(Cadastro artista) {
		this.artista = artista;
	}

}
