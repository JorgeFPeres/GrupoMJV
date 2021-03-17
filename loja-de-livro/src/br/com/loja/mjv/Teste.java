package br.com.loja.mjv;



public class Teste {
	public static void main(String[] args) {
	
		
		
		
		
		Livro livro = new Livro(123, "codigo123", "As tranças do rei careca", 2300, 100, "Gleyson");
		
		
		//System.out.println(livro.getTitulo());
		
		Cadastro cliente1 = new Cadastro(123, "Cliente teste", 123456589L, "cliente@cliente.com");
		
		TransmissorSms tsms = new TransmissorSms();
		
		tsms.enviar(cliente1, "Teste funcionou");
		
		
		
		
		
	}
	

}
