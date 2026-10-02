import java.util.Scanner;

public class Sistema_de_emprestimo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Digite o salário Mensal");
		
		double salario_mensal= sc.nextDouble();
		
		System.out.println("Digite o valor da parcela ");
		
		double valor_da_parcela= sc.nextDouble();
		
		System.out.println("Digite sua idade ");
		
		int idade =sc.nextInt();
		
		double desconto= salario_mensal * 0.3;
		
		double trinta_porcem_salari= salario_mensal + desconto;
		
		
		if(salario_mensal >=2000 && valor_da_parcela <=trinta_porcem_salari && idade >=18) {
			System.out.println("Empréstimo concluído");
			
			
		}else {
			System.out.println("Empréstimo Negado !!");
		}

	}

}
