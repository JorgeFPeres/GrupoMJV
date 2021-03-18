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
		tipo1.beneficios = "200 minutos de ligações ";
		Planos tipo2 = new Planos();
		tipo2.beneficios = "3Gb de internet ";
		Planos tipo3 = new Planos();
		tipo3.beneficios = "Facebook Ilimitado";

		servicos.add(tipo1);
		servicos.add(tipo2);
		servicos.add(tipo3);

		//tipos de planos de celular, pode ser alterado a qualquer momento utilizando os beneficios da lista
		String basic = "Você escolheu o plano BASIC que oferece: " + servicos.get(0).beneficios;
		String premium ="Você escolheu o plano PREMIUM que oferece: " + servicos.get(0).beneficios + " + " + servicos.get(1).beneficios;
		String gold ="Você escolheu o plano GOLD que oferece: " + servicos.get(0).beneficios + " + " + servicos.get(1).beneficios + " + "
				+ servicos.get(2).beneficios;
		
		
					
			System.out.println("-----------------------------------------");
			System.out.println("BEM VINDO AO SISTEMA DE PLANOS DA TELEFOGO");
			System.out.println("-----------------------------------------");
			System.out.println("DIGITE A OPÇÃO DESEJADA: ");
			System.out.println("[1] Para assinar o PLANO BÁSICO");
			System.out.println("[2] Para assinar o PLANO PREMIUM");
			System.out.println("[3] Para assinar o PLANO GOLD");
			
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
			System.out.println("Escolha um de nossos serviços");
			break;

		}
		
	}
}