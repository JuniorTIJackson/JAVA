import java.util.Scanner;

public class cinema {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("BEM VINDO AO CINEMA !!!");
		System.out.println("=========================");
		
		System.out.println("Digite a Sua idade ");
		
		int idade= sc.nextInt();
		
		if (idade <12) {
			System.out.println("O valor do ingresso é de: 10$");
		}else if(idade>=12 && idade <=17) {
			System.out.println("O valor do ingresso é de: 15$");
			
		}else if(idade>=18 && idade <=59) {
			System.out.println(" O valor do ingresso é de: 25$");
		}else {
			System.out.println("O valor do ingresso é de: 12$");
		}
		

	}

}
