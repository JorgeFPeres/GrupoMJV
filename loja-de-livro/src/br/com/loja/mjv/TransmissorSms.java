package br.com.loja.mjv;

public class TransmissorSms extends TransmissorMensagem {
	
	public void enviar(Cadastro cliente, String mensagem) {
		System.out.println("Destinat�rio: " + cliente.getTelefone());
		System.out.println("Mensagem: " + mensagem );
	}
	
	
	

}
