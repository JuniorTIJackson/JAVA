import java.util.Scanner;

public class Sistema_de_aprovacao {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Sistema de Aprovação completo");
		
		System.out.println("Digite  a Sua média das prova ");
		
		double media= sc.nextDouble();
		
		System.out.println("Digite a sua frequencia percentual ");
		
		int frequencia= sc.nextInt();
		
		System.out.println("Calculando!!!!!!!");
		
		if(media>=7  && frequencia >=75) {
			System.out.println("Aprovado!!");
		}else if(media>= 5 && frequencia >=75) {
			System.out.println("Reprovado");
		}
		

	}

}
