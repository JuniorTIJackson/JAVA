import java.util.Scanner;

public class login {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String login = "Jackson";

        int senha = 28082006;

        System.out.println("== Bem vindo ao sistema de cadastro==");

        System.out.println("Digite Seu Login= ");

        String login_do_usuario = sc.nextLine();

        System.out.println("Digite a Sua Senha=  ");

        int senha_do_usuario = sc.nextInt();

        if (login.equals(login_do_usuario) && senha == senha_do_usuario) {

            System.out.println("LOGIN REALIZADO");

        } else {
            System.out.println("Usuário incorreto ou senha incorreta ");
        }

    }
}
