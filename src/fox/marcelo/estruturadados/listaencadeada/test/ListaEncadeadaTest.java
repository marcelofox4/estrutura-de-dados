package fox.marcelo.estruturadados.listaencadeada.test;

import fox.marcelo.estruturadados.listaencadeada.domain.ListaEncadeada;

public class ListaEncadeadaTest {
    public static void main(String[] args) {

        ListaEncadeada<String> listaEncadeada = new ListaEncadeada<>();

        listaEncadeada.add("teste01");
        listaEncadeada.add("teste02");
        listaEncadeada.add("teste03");
        listaEncadeada.add("teste04");

        System.out.println(listaEncadeada.get(0));
        System.out.println(listaEncadeada.get(1));
        System.out.println(listaEncadeada.get(2));
        System.out.println(listaEncadeada.get(3));

        System.out.println(listaEncadeada);

        System.out.println(listaEncadeada.remove(2));

        System.out.println(listaEncadeada);
    }
}
