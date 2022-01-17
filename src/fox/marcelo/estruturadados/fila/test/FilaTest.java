package fox.marcelo.estruturadados.fila.test;

import fox.marcelo.estruturadados.fila.domain.Fila;
import fox.marcelo.estruturadados.fila.domain.No;

public class FilaTest {
    public static void main(String[] args) {

        Fila fila = new Fila();

        fila.enqueue(new No("primeiro"));
        fila.enqueue(new No("segundo"));
        fila.enqueue(new No("terceiro"));
        fila.enqueue(new No("quarto"));

        System.out.println(fila);

        System.out.println(fila.dequeue());
        System.out.println(fila);

        fila.enqueue(new No("último"));
        System.out.println(fila);

        System.out.println(fila.first());
        System.out.println(fila);

    }
}
