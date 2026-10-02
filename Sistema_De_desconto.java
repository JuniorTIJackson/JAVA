import java.util.Scanner;

public class Sistema_De_desconto {

	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Digite o tipo de cliente que vc é :");
		
		String cliente= sc.nextLine();
		
		System.out.println("Digite o valor da compra ");
		
		double valor_da_compra=sc.nextDouble();
		
		double d=0;
		
		
		if(cliente.equalsIgnoreCase("comum")) {
			
			d=0;
			
			if( valor_da_compra >500) {
				
				d=0.05;
			}
			
		}else if(cliente.equalsIgnoreCase("vip")) {
			
			d=0.15;
			
			if(valor_da_compra >500) {
				
				d=0.20;
				
			}
			
			
			
		}else if(cliente.equalsIgnoreCase("funcionario")) {
			d=0.30;
			
			if(valor_da_compra >500) {
				d=0.35;
				
				
			}
		}else {
			
			System.out.println("cliente inválido");
		}
		
		double valor_D= valor_da_compra * d;
		
		double valor_f= valor_da_compra - valor_D;
		
		System.out.println("O valor do desconto é de: "+valor_D);
		
		System.out.println("O valor final é de: "+valor_f);

	}
	

}
