package Collections;

import java.util.Locale;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Set<String> listaAprovados = new HashSet<>();
        SortedSet<String> listaAprovados = new TreeSet<>();
        listaAprovados.add("Vinicius");
        listaAprovados.add("Luis");
        listaAprovados.add("Felipe");
        listaAprovados.add("Joao");

        for (String candidato : listaAprovados) {
            System.out.println(candidato);
        }


        sc.close();
    }
}