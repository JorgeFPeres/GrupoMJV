package br.com.loja.mjv;

public abstract class Produto{

	private int id;
	private String codigoDeBarras;
	private String titulo;
	private double valorVenda;
	private editora editora;

	public Produto(int id, String codigoDeBarras, String titulo, double valorVenda) {
		this.id = id;
		this.codigoDeBarras = codigoDeBarras;
		this.titulo = titulo;
		this.valorVenda = valorVenda;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodigoDeBarras() {
		return codigoDeBarras;
	}

	public void setCodigoDeBarras(String codigoDeBarras) {
		this.codigoDeBarras = codigoDeBarras;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}

}
