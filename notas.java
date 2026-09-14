import java.util.Scanner;

public class notas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Sistemas de Notas ");

        System.out.println("Digite sua 1 nota ");

        int nota1 = sc.nextInt();

        System.out.println("Digite sua 2 nota ");

        int nota2 = sc.nextInt();

        System.out.println("Digite Sua 3 nota ");

        int nota3 = sc.nextInt();

        int media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {

            System.out.println("Aprovado !!! ");

        } else if (media >= 5 && media < 7) {

            System.out.println("Recuperação ");

        } else if (media < 5) {

            System.out.println("Reprovado");

        }
    }
}
