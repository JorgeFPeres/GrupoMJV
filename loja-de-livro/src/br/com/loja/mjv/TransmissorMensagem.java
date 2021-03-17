package br.com.loja.mjv;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


abstract class TransmissorMensagem {

	private Cadastro destinatario;
	
	protected abstract void enviarMsg(Cadastro destinatario, String mensagem);
	
	Date data = new Date();
	long d = data.getTime();
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	
	
	

	public long getData() {
		return d;
	}

	public void setData(Date data) {
		
	}
	


	
	

}
