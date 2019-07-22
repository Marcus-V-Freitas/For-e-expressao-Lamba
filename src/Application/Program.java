package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Funcionário;



public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		
		List<Funcionário> funcionarios=new ArrayList<Funcionário>();
		
		System.out.println("Digite o número de funcionários");
		int N=sc.nextInt();
		
		for(int i=0;i<N;i++) {
			System.out.println("Dgite o ID do funcionário");
			Integer id=sc.nextInt();
			System.out.println("Digite o Nome do funcionário");
			sc.nextLine();
			String name=sc.nextLine();
			System.out.println("Digite o salário do funcionário");
			Double salary=sc.nextDouble();
			funcionarios.add(new Funcionário(id, name, salary));
			
		}
		
		System.out.println("Digite o ID do funcionário que deseja aumentar: ");
		Integer id=sc.nextInt();
		
		Funcionário emp=funcionarios.stream().filter(x->x.getId()==id).findFirst().orElse(null);
		
		if(emp==null) {
			System.out.println("Funcionário não existe");
		}else {
			System.out.println("Digite o aumento:");
			Double percentage=sc.nextDouble();
			emp.IncreaseSalary(percentage);
		}

		for(Funcionário func: funcionarios) {
			System.out.println(func);
		}
	}

}
