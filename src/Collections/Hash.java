package Collections;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {

        HashSet<Usuario> usuarios = new HashSet<>();

        usuarios.add(new Usuario("Pedro"));
        usuarios.add(new Usuario("Guilherme"));
        usuarios.add(new Usuario("Vinicius"));

        System.out.println(usuarios.contains(new Usuario("Guilherme")));
    }
}
