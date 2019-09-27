package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Legalperson;
import entities.Physicperson;
import entities.Taxpayers;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Taxpayers> list = new ArrayList<>();

		System.out.println("Número de contribuintes: ");
		int contribuintes = sc.nextInt();

		for (int i = 0; i < contribuintes; i++) {

			System.out.println("Contribuinte #" + i);
			System.out.println("Pessoa física ou jurídica? (F/J) ");
			char ch = sc.next().charAt(0);

			if (ch == 'F') {

				System.out.println("Nome: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.println("Salário anual: ");
				Double income = sc.nextDouble();
				System.out.println("Despesas de saúde: ");
				Double h_expenditures = sc.nextDouble();

				list.add(new Physicperson(name, income, h_expenditures));

			}

			else if (ch == 'J') {

				System.out.println("Nome: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.println("Salário anual: ");
				double income = sc.nextDouble();
				System.out.println("Número de funcionários: ");
				int n_workers = sc.nextInt();

				list.add(new Legalperson(n_workers, name, income));
			}

		}
		double soma_total = 0.0;
		System.out.println("Impostos pagos: ");
		System.out.println();

		for (Taxpayers x : list) {

			soma_total += x.taxCalculation();
			System.out.println(x.toString());

		}

		System.out.println();
		System.out.println("Impostos totais: ");
		System.out.println(String.format("%.2f", soma_total));

		sc.close();

	}

}
