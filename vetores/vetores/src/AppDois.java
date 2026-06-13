import java.util.Scanner;
public class AppDois {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println( "Digite seu nome");
        String nome = entrada.nextLine();

        System.out.printf("\n O nome informado é: %s \n", nome);
        entrada.close();
    }
}
