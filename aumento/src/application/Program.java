package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quantos funcionários serão registrados:? ");
		Integer N = scanner.nextInt();
		
		List<Employee> list = new ArrayList<>();
		
		for(Integer i = 0; i < N; i++) {
			System.out.println("Funcionário #" + (i + 1) + ":");
			System.out.print("ID: ");
			Integer id = scanner.nextInt();
			System.out.print("Nome: ");
			scanner.nextLine();
			String name = scanner.nextLine();
			System.out.print("Salário: ");
			Double salary = scanner.nextDouble();
			
			Employee employee = new Employee(id, name, salary);
			list.add(employee);
		} 
		
		System.out.print("ID do funcionário que receberá um aumento: ");
		Integer idsalary = scanner.nextInt();
		
		Integer pos = position(list, idsalary);
		if(pos == null) {
			System.out.println("ID inexistente!");
		}else {
			System.out.print("Porgentagem de reajuste do funcionário: ");
			Double percent = scanner.nextDouble();
			list.get(pos).increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("Lista de funcionários: ");
		for (Employee employee : list) {
			System.out.println(employee);
		}
		
		scanner.close();
	}
	
	public static Integer position(List<Employee> list, Integer id) {
		for(Integer i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
		
	}

}
