package br.com.planos.mjv;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Planos {

	private String beneficios;

	public static void main(String[] args) {

		
		//lista para armazenar beneficios de planos de celular, pode ser alterada adicionando mais planos
		List<Planos> servicos = new LinkedList<Planos>();

		Planos tipo1 = new Planos();
		tipo1.beneficios = "200 minutos de liga??es ";
		Planos tipo2 = new Planos();
		tipo2.beneficios = "3Gb de internet ";
		Planos tipo3 = new Planos();
		tipo3.beneficios = "Facebook Ilimitado";

		servicos.add(tipo1);
		servicos.add(tipo2);
		servicos.add(tipo3);

		//tipos de planos de celular, pode ser alterado a qualquer momento utilizando os beneficios da lista
		String basic = "Voc? escolheu o plano BASIC que oferece: " + "\n"+servicos.get(0).beneficios;		
		String premium ="Voc? escolheu o plano PREMIUM que oferece: " + "\n"+ servicos.get(0).beneficios + " + " + servicos.get(1).beneficios;
		String gold ="Voc? escolheu o plano GOLD que oferece: " +"\n"+ servicos.get(0).beneficios + " + " + servicos.get(1).beneficios + " + "
				+ servicos.get(2).beneficios;
					

		System.out.println("-----------------------------------------" + "\n" + 
							"BEM VINDO AO SISTEMA DE PLANOS DA MJVFONE" + "\n" +
							"-----------------------------------------" + "\n" +
							"DIGITE A OP??O DESEJADA: " + "\n" +
							"[1] Para assinar o PLANO B?SICO" + "\n" + 
							"[2] Para assinar o PLANO PREMIUM" + "\n" + 
							"[3] Para assinar o PLANO GOLD" + "\n" +
							"-----------------------------------------");
			
			
			Scanner sc = new Scanner(System.in);
		
			
			int escolha = sc.nextInt();

		switch (escolha) {

		case 1:
			System.out.println(basic);
			break;
		case 2:
			System.out.println(premium);
			break;
		case 3:
			System.out.println(gold);
			break;
		default:
			System.out.println("Op??o inv?lida" + "\n" + "Por favor, escolha um de nossos servi?os.");
			
		}

		
	}
}
