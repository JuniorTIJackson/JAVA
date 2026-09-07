
public class Operadores {

	public static void main(String[] args) {
		//operadores lógicos
		// + - / * 
		// and && or ||
		
		int idade=80;
		
		
		if(idade <18) {
			System.out.println("vc não tem idade ainda para votar");
			
		}else if(idade>=18 && idade <=59) {
			
			System.out.println(" vc tem idade para votar");
			
		}else if(idade>59 && idade <=80) {
			
			System.out.println("Voto opcional");
		}
		
		
	}
	
}

