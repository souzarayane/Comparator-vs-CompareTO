package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainLivro {

    public static void main(String[] args) {

        List<Livro> livros = new ArrayList<>();
        livros.add(new Livro("Java para Iniciantes", 59.99, 2024));
        livros.add(new Livro("Estrutura de Dados com Java", 130.79, 2020));
        livros.add(new Livro("Aprendendo Algoritmos", 70.00, 2022));

        // Ordenando por títulos (ordem natural)
        Collections.sort(livros);
        System.out.println("Ordenado por título:");
        for (Livro livro : livros) {
            System.out.println(livro);
        }

        // Ordenar por preço
        Collections.sort(livros, new LivroComparatorPorPreco());
        System.out.println("\nOrdenado por preço:");
        for (Livro livro : livros) {
            System.out.println(livro);
        }

        // Ordenar por ano de publicação
        Collections.sort(livros, new LivroComparatorPorAnoPublicacao());
        System.out.println("\nOrdenado por ano de publicação:");
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }
}

class LivroComparatorPorPreco implements Comparator<Livro> {
    @Override
    public int compare(Livro l1, Livro l2) {
        return Double.compare(l1.getPreco(), l2.getPreco());
    }
}

class LivroComparatorPorAnoPublicacao implements Comparator<Livro> {
    @Override
    public int compare(Livro l1, Livro l2) {
        return Integer.compare(l2.getAnoPublicacao(), l1.getAnoPublicacao());
    }
}
