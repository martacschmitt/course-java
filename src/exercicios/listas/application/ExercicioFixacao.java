package exercicios.listas.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercicios.listas.entities.Employee;

public class ExercicioFixacao {

	/**
	 * Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de N funcionários. Não deve haver repetição de id.
	 * 
	 * Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário. Para isso, o programa deve ler um id e o valor X. 
	 * Se o id informado não existir, mostrar uma mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários,
	 * conforme exemplos.
	 * 
	 * Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa ser mudado livremente. Um salário só pode ser 
	 * aumentado com base em uma operação de aumento por porcentagem dada.
	 * 
	 * Exemplos:
	 * 
	 * How many employees will be registered? 3
	 * 
	 * Emplyoee #1:
	 * Id: 333
	 * Name: Maria Brown
	 * Salary: 4000.00
	 * 
	 * Emplyoee #2:
	 * Id: 536
	 * Name: Alex Grey
	 * Salary: 3000.00
	 * 
	 * Emplyoee #3:
	 * Id: 772
	 * Name: Bob Green
	 * Salary: 5000.00
	 * 
	 * Enter the employee id that will have salary increase : 536
	 * Enter the percentage: 10.0
	 * 
	 * List of employees:
	 * 333, Maria Brown, 4000.00
	 * 536, Alex Grey, 3300.00
	 * 772, Bob Green, 5000.00
	 * 
	 * ---
	 * 
	 * How many employees will be registered? 2
	 * 
	 * Emplyoee #1:
	 * Id: 333
	 * Name: Maria Brown
	 * Salary: 4000.00
	 * 
	 * Emplyoee #2:
	 * Id: 536
	 * Name: Alex Grey
	 * Salary: 3000.00
	 * 
	 * Enter the employee id that will have salary increase: 776
	 * This id does not exist!
	 * 
	 * List of employees:
	 * 333, Maria Brown, 4000.00
	 * 536, Alex Grey, 3000.00
	 * 
	 */
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employees = new ArrayList<Employee>();
		
		System.out.print("How many employees will be registered? ");
		int registers = sc.nextInt();
		
		for (int i = 1; i <= registers; i++) {
			System.out.println();
			System.out.println("Employee #" + i + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			employees.add(new Employee(id, name, salary));
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		
		Employee employee = employees.stream().filter(emp -> emp.getId() == id).findFirst().orElse(null);
		if (employee == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			employee.increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for (Employee emp : employees) {
			System.out.println(emp);
		}
		
		sc.close();
		
	}
	
}
