package br.com.loja.mjv;

import java.util.Date;

public abstract class TransmissorMensagem {
	
	private Cadastro cliente;
	private Date data;
	private String mensagem;

	protected void enviarMsg(Cadastro cliente, String mensagem) {
		if(cliente.getEmail() == null) {
			
			
			
		}
	}

}


