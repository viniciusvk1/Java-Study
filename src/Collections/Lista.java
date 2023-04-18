package Collections;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {

        ArrayList<Usuario> lista = new ArrayList<Usuario>();

        Usuario u1 = new Usuario("Ana");
        lista.add(u1);
        lista.add(new Usuario("Vinicius"));
        lista.add(new Usuario("Camile"));
        lista.add(new Usuario("Fernanda"));
        lista.add(new Usuario("Pedro"));

        System.out.println(lista.get(3));

        lista.remove(1);
        System.out.println(lista.remove(new Usuario("Pedro")));

        System.out.println("Tem? " + lista.contains(new Usuario("Camile")));

        for (Usuario u : lista) {
            System.out.println(u.nome);
        }
    }
}
