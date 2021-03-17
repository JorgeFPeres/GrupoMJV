package br.com.loja.mjv;


public class TransmissorEmail extends TransmissorMensagem{
	
	
	@Override
	public void enviarMsg(Cadastro destinatario, String mensagem) {
		System.out.println("Destinat�rio: " + destinatario.getNome() + destinatario.getEmail());
		System.out.println("Mensagem: " + mensagem );
		System.out.println("Data: " + dateFormat.format(d));
	}
	
	private void acionandoServi�oEmail() {
		System.out.println("Acionando servi�o por email");
	}

	
}
