import java.util.Scanner;

public class desconto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o Valor da compra = ");

        double valor_da_compra = sc.nextDouble();

        if (valor_da_compra >= 100) {

            System.out.println(" Parabéns !! voce recebeu 10 % de Desconto ");

            double desconto = valor_da_compra * 0.10;

            double valor_final = (valor_da_compra - desconto);

            System.out.println(" O valor Final da sua compra é de: " + valor_final + "$");

        } else if (valor_da_compra < 100) {

            System.out.println("Sem Desconto na compra ");

            System.out.println("Valor da compra é de : " + valor_da_compra);

        }

    }

}
