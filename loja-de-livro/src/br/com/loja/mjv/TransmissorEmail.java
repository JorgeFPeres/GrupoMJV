package br.com.loja.mjv;

public class TransmissorEmail extends TransmissorMensagem{

	public void enviar(Cliente cliente, String email, String mensagem) {
		cliente.setEmail(email);
		System.out.println("Destinatário: " + cliente.getEmail() + "Mensagem: " + mensagem );
	}
	
	
}
