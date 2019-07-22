package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Funcion�rio;



public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		
		List<Funcion�rio> funcionarios=new ArrayList<Funcion�rio>();
		
		System.out.println("Digite o n�mero de funcion�rios");
		int N=sc.nextInt();
		
		for(int i=0;i<N;i++) {
			System.out.println("Dgite o ID do funcion�rio");
			Integer id=sc.nextInt();
			System.out.println("Digite o Nome do funcion�rio");
			sc.nextLine();
			String name=sc.nextLine();
			System.out.println("Digite o sal�rio do funcion�rio");
			Double salary=sc.nextDouble();
			funcionarios.add(new Funcion�rio(id, name, salary));
			
		}
		
		System.out.println("Digite o ID do funcion�rio que deseja aumentar: ");
		Integer id=sc.nextInt();
		
		Funcion�rio emp=funcionarios.stream().filter(x->x.getId()==id).findFirst().orElse(null);
		
		if(emp==null) {
			System.out.println("Funcion�rio n�o existe");
		}else {
			System.out.println("Digite o aumento:");
			Double percentage=sc.nextDouble();
			emp.IncreaseSalary(percentage);
		}

		for(Funcion�rio func: funcionarios) {
			System.out.println(func);
		}
	}

}
