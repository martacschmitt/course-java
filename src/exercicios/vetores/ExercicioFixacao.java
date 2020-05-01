package exercicios.vetores;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class ExercicioFixacao {

	/**
	 * A dona de um pensionato possui dez quartos para alugar para estudantes, sendo esses quartos identificados pelos números 0 a 9.
	 * 
	 * Fazer um programa que inicie com todos os dez quartos vazios, e depois leia uma quantidade N representando o número de estudantes que vão
	 * alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos N estudantes. Para cada registro de aluguel, informar o nome e email do
	 * estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
	 * um relatório de todas ocupações do pensionato, por ordem de quarto, conforme exemplo.
	 * 
	 * Exemplo:
	 * 
	 * How many rooms will be rented? 3
	 * 
	 * Rent #1:
	 * Name: Maria Green
	 * Email: maria@gmail.com
	 * Room: 5
	 * 
	 * Rent #2:
	 * Name: Marco Antonio
	 * Email: marco@gmail.com
	 * Room: 1
	 * 
	 * Rent #3:
	 * Name: Alex Brown
	 * Email: alex@gmail.com
	 * Room: 8
	 * 
	 * Busy rooms:
	 * 1: Marco Antonio, marco@gmail.com
	 * 5: Maria Green, maria@gmail.com
	 * 8: Alex Brown, alex@gmail.com
	 * 
	 */
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent[] rents = new Rent[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println();
			sc.nextLine();
			System.out.println("Rent #" + (i + 1));
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			rents[room] = new Rent(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i < rents.length; i++) {
			if (rents[i] != null) {
				System.out.println(i + ": " + rents[i].getName() + ", " + rents[i].getEmail());
			}
		}
		
		sc.close();
		
	}
	
}
