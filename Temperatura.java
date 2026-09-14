import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura do tempo");

        int temperatura = sc.nextInt();

        if (temperatura < 15) {

            System.out.println("Frio");

        } else if (temperatura >= 15 && temperatura <= 25) {
            System.out.println("Agradável");

        } else if (temperatura > 25) {
            System.out.println("Quente");

        }
    }
}
