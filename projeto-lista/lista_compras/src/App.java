import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner inUser = new Scanner(System.in);
        ArrayList<String> listaCompras = new ArrayList<>();
        int opcaoLista = 0;
        int opcao = 0;
        String novoItem = "";

        do {
            try {
                System.out.println("""
                \nEscolha a opção desejada:
                1 - Criar / Gerenciar lista de compras
                2 - Sair
                """);
                opcaoLista = inUser.nextInt();
                inUser.nextLine(); // Limpa o buffer

                switch (opcaoLista) {
                    case 1 -> {
                        System.out.println("\n--- Gerenciador da Lista ---");
                        do {
                            System.out.println("""
                                    \nEscolha a opção desejada:
                                    1 - Adicionar um item na lista
                                    2 - Ver a sua lista
                                    3 - Voltar ao menu principal
                                    """);
                            opcao = inUser.nextInt();
                            inUser.nextLine(); // Limpa o buffer

                            switch (opcao) {
                                case 1 -> {
                                    System.out.println("Digite o nome do produto: ");
                                    novoItem = inUser.nextLine();
                                    listaCompras.add(novoItem);
                                    System.out.println("Item adicionado com sucesso!");
                                }
                                case 2 -> {
                                    System.out.println("\n--- Sua Lista de Compras ---");
                                    if (listaCompras.isEmpty()) {
                                        System.out.println("A lista está vazia.");
                                    } else {
                                        for (String item : listaCompras) {
                                            System.out.printf("- %s \n", item);
                                        }
                                    }
                                }
                                case 3 -> System.out.println("Voltando...");
                                default -> System.out.println("Opção inválida!");
                            }
                        } while (opcao != 3);
                    }
                    case 2 -> System.out.println("Obrigado por usar o nosso sistema!");
                    default -> System.out.println("Opção inválida!");
                }
            } catch (Exception erro) {
                System.out.println("Erro!!! Entrada Inválida.");
                inUser.nextLine(); // Limpa o buffer do erro
                opcaoLista = 0;    // Reseta para não quebrar o laço
            }
        } while (opcaoLista != 2);

        inUser.close();
    }
}
