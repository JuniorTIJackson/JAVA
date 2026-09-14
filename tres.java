import java.util.Scanner;

public class tres {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro Número= ");

        int n1 = sc.nextInt();

        System.out.print("Digite o Segundo Número ");

        int n2 = sc.nextInt();

        System.out.print("Digite o terceiro Número ");

        int n3 = sc.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.print(n1 + " n1 É Maior entre os dois");
        } else if (n2 > n1 && n2 > n3) {

            System.out.print(n2 + " n2 È Maior que os dois ");

        } else if (n3 > n1 && n3 > n2) {

            System.out.print(n3 + " n3 È Maior que os dois ");

        }
    }
}
