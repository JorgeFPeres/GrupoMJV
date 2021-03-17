package br.com.loja.mjv;

public class Teste {
	public static void main(String[] args) {

		// Livro livro = new Livro(123, "codigo123", "As tranças do rei careca", 2300,
		// 100, "Gleyson");

		// System.out.println(livro.getTitulo());

		// referencias do construtor cliente -> id, nome, telefone, email
		Cadastro cliente1 = new Cadastro(123, "Nome do Cliente", 123456589L, "cliente@cliente.com");

		// escolha do usuário para notificação via SMS cria um objeto do tipo
		TransmissorSms tsms = new TransmissorSms();
		
		TransmissorEmail tmail = new TransmissorEmail();
		
		tsms.enviarMsg(cliente1, "Teste de envio por SMS funcionou");
		
		System.out.println("-----------------------------");
		
		tmail.enviarMsg(cliente1, "Teste de envio por Email funcionou");
		
		Cadastro artista = new Cadastro(2222, "Artista", 987654123L, "artista@artista.com");
		

		
		
		
	}

}
