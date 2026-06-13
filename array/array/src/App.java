import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> nomes = new ArrayList<>();

        //Adiciona Elementos A Lista (add());
        nomes.add("Pedro");
        nomes.add("João");
        nomes.add("Lucas");
        nomes.add("Robert");

        System.out.println(nomes);

        //Acessar Um Elemento (get(indice))
        System.out.println("O melhor desses ai é o " + nomes.get(0));

        //Alterar Um Item (nomes.set(Indice para alterar, e o q tu quer mudar))

        nomes.set(0,"Pedrão");
        System.out.println(nomes.get(0));

        //Remover Um Item Da Lista (nomes.remove(Indice));
        nomes.remove(3);
        System.out.println(nomes);

        //Tamanho Da Lista
        System.out.println(nomes.size());

        //Apagar A Lista
        nomes.clear();
        System.out.println(nomes);

        //Confirma A Existencia Dos Itens
        System.out.println(nomes.contains("Gilmar"));
    }
}
