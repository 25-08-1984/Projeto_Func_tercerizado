package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidade.Funcionario;
import entidade.Tercerizado;

public class Programa {

	public static void main(String[] args) {
		Locale ptBR = Locale.forLanguageTag("pt-Br");
		Locale.setDefault(ptBR);
		Scanner sc = new Scanner(System.in);
		
		List <Funcionario> list = new ArrayList<>();
		
		System.out.println("Quantos funcionarios quer registrar?");
		int num = sc.nextInt();
		
		for (int i = 1; i <=num; i++) {
			
			System.out.println("Funcionario #"+ i + "data:");
			
			System.out.println("O seu funcionario e terciarizado ou nao (y/n)");
			
			char f = sc.next().charAt(0);
			
			System.out.println("Nome: ");
			sc.nextLine();
			String nome =sc.nextLine();
			
			System.out.println("Hora: ");
			
			int hora = sc.nextInt();
			
			System.out.println("Valor por hora: ");
			sc.nextLine();
			
			Double vhora = sc.nextDouble();
			
			if (f == 'y') {
				System.out.println("Valor por hora: ");
				sc.nextLine();
				
				double bonusadd = sc.nextDouble();
				list.add(new Tercerizado(nome,hora,vhora,bonusadd));
				
			}
			else {
				list.add(new Funcionario(nome,hora,vhora));
			}
			
			System.out.println();
			System.out.println("Pagamentos: ");
			for(Funcionario fun : list) {
				System.out.println(fun.getnome() +"-> $" + String.format("%.2f" , fun.pagamento()));
				
			}
		
			
			
			
			
		}
		sc.close();
		

	}

}
