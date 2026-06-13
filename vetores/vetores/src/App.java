import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int[] vetor = new int[3];
        System.out.println("Digite o primeiro numero:");
        vetor[0] = entrada.nextInt();
        System.out.println(vetor[0]);
        entrada.close();
    }
}
