package br.com.loja.mjv;

public class TransmissorSms extends TransmissorMensagem {


	@Override
	protected void enviarMsg(Cadastro destinatario, String mensagem) {
		acionarServicoSms();
		System.out.println("Destinatário: " + destinatario.getNome() + destinatario.getTelefone());
		System.out.println("Mensagem: " + mensagem);
		System.out.println("Data: " + dateFormat.format(d));
		
		
	}
	
	private void acionarServicoSms() {
		System.out.println("Acionando serviço por SMS");
	}

		

}
